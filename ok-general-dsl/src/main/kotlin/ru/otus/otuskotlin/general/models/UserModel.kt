package ru.otus.otuskotlin.general.models


data class UserModel (
    var id: UserId=UserId.NONE,
    var fname: String="",
    var mname: String="",
    var lname: String="",
    var permissions: MutableSet<UserPermissionsModel> = mutableSetOf()

)

