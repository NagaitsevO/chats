import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


internal class UserFunctionsTest {
    val users = ArrayList<User>()

    @Test
    fun createUser1() {
        assertEquals(0, UserFunctions.createUser("User1", "email1@email.ru", users))
        UserFunctions.toCleanUserBufferID()
    }

    @Test
    fun createUser2() {
        UserFunctions.createUser("User1", "email1@email.ru", users)
        assertEquals(1, UserFunctions.createUser("User2", "email2@email.ru", users))
        UserFunctions.toCleanUserBufferID()
    }

    @Test
    fun isEmailInArrayOfUsersYES() {
        UserFunctions.createUser("User2", "email2@email.ru", users)
        assertEquals(true, UserFunctions.isEmailInArrayOfUsers(users, "email2@email.ru"))
        UserFunctions.toCleanUserBufferID()
    }

    @Test
    fun isEmailInArrayOfUsersNO() {
        assertEquals(false, UserFunctions.isEmailInArrayOfUsers(users, "email3@email.ru"))
        UserFunctions.toCleanUserBufferID()
    }

    @Test
    fun changeUserEmail() {
        UserFunctions.createUser("User1", "email1@email.ru", users)
        assertEquals(true, UserFunctions.changeUserEmail(users,0, "email3@email.ru"))
        UserFunctions.toCleanUserBufferID()
    }

    @Test
    fun changeUserName() {
        UserFunctions.createUser("User1", "email1@email.ru", users)
        assertEquals(true, UserFunctions.changeUserName(users,0, "User3"))
        UserFunctions.toCleanUserBufferID()
    }

    @Test
    fun getUserName() {
        UserFunctions.createUser("User1", "email1@email.ru", users)
        UserFunctions.changeUserName(users,0, "User3")
        assertEquals("User3", UserFunctions.getUserName(users[0]))
        UserFunctions.toCleanUserBufferID()
    }
}