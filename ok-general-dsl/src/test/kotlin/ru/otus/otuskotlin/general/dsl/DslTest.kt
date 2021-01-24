package ru.otus.otuskotlin.general

import org.junit.Assert.*
import ru.otus.otuskotlin.general.dsl.user
import ru.otus.otuskotlin.general.models.UserModel
import java.sql.BatchUpdateException
import kotlin.test.Test
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
                +UPDATE
                +add(UserPermissionsModel.GET_NEWS)
            }
        }
    assertEquals("Иванович",user.mname)
    }
}