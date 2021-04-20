import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


internal class UserFunctionsTest {
    val users = ArrayList<User>()

    @Test
    fun createUser1() {
       assertEquals(1, UserFunctions.createUser("User1", "email1@email.ru", users))
    }

    @Test
    fun createUser2() {
        assertEquals(2, UserFunctions.createUser("User2", "email2@email.ru", users))
    }

    @Test
    fun isEmailInArrayOfUsersYES() {
        assertEquals(true, UserFunctions.isEmailInArrayOfUsers(users, "email2@email.ru"))
    }

    @Test
    fun isEmailInArrayOfUsersNO() {
        assertEquals(false, UserFunctions.isEmailInArrayOfUsers(users, "email3@email.ru"))
    }

    @Test
    fun changeUserEmail() {
        assertEquals(true, UserFunctions.changeUserEmail(users,1, "email3@email.ru"))
    }

    @Test
    fun changeUserName() {
        assertEquals(true, UserFunctions.changeUserName(users,1, "User3"))
    }

    @Test
    fun getUserName() {
        assertEquals("User3", UserFunctions.getUserName(users[0]))
    }
}