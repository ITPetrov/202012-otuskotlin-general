package ru.otus.otuskotlin.general.dsl

import ru.otus.otuskotlin.general.models.UserPermissionsModel

class UserPermissionsConfig {
    private val  _permissions= mutableSetOf<UserPermissionsModel>()
    val permissions: Set<UserPermissionsModel>
        get() = _permissions.toSet()
    fun add(permission: UserPermissionsModel) = _permissions.add(permission)
    fun add(permissionStr: String)=add(UserPermissionsModel.valueOf(permissionStr))

    operator fun UserPermissionsModel.unaryPlus() =add(this)
    operator fun String.unaryPlus() = add(this)
}
