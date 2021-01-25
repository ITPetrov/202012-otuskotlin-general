package ru.otus.otuskotlin.general.dsl

import ru.otus.otuskotlin.general.models.UserModel
import ru.otus.otuskotlin.general.models.UserPermissionsModel

infix fun UserModel.addPermits(permissionsModel: UserPermissionsModel) =permissions.add(permissionsModel)

