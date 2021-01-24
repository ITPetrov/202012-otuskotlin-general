package ru.otus.otuskotlin.general.dsl

import ru.otus.otuskotlin.general.models.UserId
import ru.otus.otuskotlin.general.models.UserModel
import ru.otus.otuskotlin.general.models.UserNameConfig
import ru.otus.otuskotlin.general.models.UserPermissionsModel

class UserConfig {
    private var id: UserId=UserId.NONE
    private var name_f: String=""
    private var name_m: String=""
    private var name_l: String=""
    private  var permissions: MutableSet<UserPermissionsModel> = mutableSetOf()

    fun name (block: UserNameConfig.()->Unit){
        val userConfig= UserNameConfig().apply(block)
        name_f=userConfig.first
        name_m=userConfig.second
        name_l=userConfig.last
    }
    fun build()= UserModel(
        id=id,
        fname=name_f,
        mname=name_m,
        lname=name_l,
        permissions=permissions
    )
}
fun user(block: UserConfig.()->Unit) =UserConfig().apply(block).build()