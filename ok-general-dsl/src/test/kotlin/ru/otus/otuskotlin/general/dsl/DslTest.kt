package ru.otus.otuskotlin.general

import org.junit.Assert.*
import ru.otus.otuskotlin.general.dsl.addPermits
import ru.otus.otuskotlin.general.dsl.user
import ru.otus.otuskotlin.general.models.UserModel
import ru.otus.otuskotlin.general.models.UserPermissionsModel
import kotlin.test.Test
import kotlin.test.assertTrue

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
        assertEquals("Иванович", user.mname)
        assertTrue("permisson must contain ALL permissions") {
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


    @Test
    fun infixTest (){
        val user=UserModel()
        user addPermits UserPermissionsModel.READ
        assertEquals(UserPermissionsModel.READ,user.permissions.first())
    }
}

