import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MessageFunctionsTest {
    val users = ArrayList<User>()
    val messages = ArrayList<Message>()



    @Test
    fun sendMessage() {
        UserFunctions.createUser("User1", "email1@email.ru", users)
        UserFunctions.createUser("User2", "email2@email.ru", users)
        assertEquals(0, MessageFunctions.sendMessage(users[0], users[1], "Hello, User!", messages))
    }

    @Test
    fun readMessage() {
        UserFunctions.createUser("User1", "email1@email.ru", users)
        UserFunctions.createUser("User2", "email2@email.ru", users)
        val messageNumber = MessageFunctions.sendMessage(users[0], users[1], "Hello, User!", messages)
        MessageFunctions.readMessage(messages[messageNumber], messages)
        assertEquals(true, messages[messageNumber].isRead)
    }

}