package ru.otus.otuskotlin.general

import org.junit.Assert
import org.junit.Assert.*
import ru.otus.otuskotlin.general.dsl.user
import ru.otus.otuskotlin.general.models.UserModel
import ru.otus.otuskotlin.general.models.UserPermissionsModel
import java.sql.BatchUpdateException
import kotlin.test.Test
import kotlin.test.assertTrue
import org.junit.Assert.assertTrue as assertTrue1

internal class DslTest {
    @Test
    fun CreateUserModel() {
        val user: UserModel = user {
            name {
                first = " Иван"
                second = "Иванович"
                last = "Иванов"
            }
            permissions {
                add("READ")
                add(UserPermissionsModel.SEND_MESSAGE)
                +"UPDATE"
                +UserPermissionsModel.GET_NEWS
            }
        }
        assertEquals("Иванович",user.mname)
        assertTrue ("permisson must contain ALL permissions")   {
            user.permissions.containsAll(
                listOf(
                    UserPermissionsModel.READ,
                    UserPermissionsModel.SEND_MESSAGE,
                    UserPermissionsModel.UPDATE,
                    UserPermissionsModel.GET_NEWS
                )
            )
        }
    }
}