object MessageFunctions {
    private var messageBufferID: Int = 0

    fun sendMessage(transmittedUser: User,
                    receivedUser: User,
                    text: String,
                    messages: MutableList<Message>): Int {
        var message = Message(
                messageBufferID,
                transmittedUser,
                receivedUser,
                text,
                100,
                false)
        messageBufferID++
        messages.add(message)
        return message.messageID
    }

    fun readMessage(message: Message,
                    messages: List<Message>) {
        message.isRead = true
    }

    fun toString(messages: List<Message>): String =
            messages.joinToString(
                    separator = "\n",
                    prefix = "===",
                    postfix = "======\n"
            ) { message ->

                readMessage(message, messages)

                """

                Отправитель: ${message.receivedUser.userName}
                Получатель: ${message.transmittedUser.userName}
                Сообщение: ${message.text}

            """.trimIndent()

            }

    fun toShowTheChat(user1: User, user2: User, messages: MutableList<Message>): String {
        val theFoundChat = messages.filter(fun(message: Message) =
                ((message.receivedUser == user1) || (message.receivedUser == user2) &&
                        (message.transmittedUser == user2) || (message.transmittedUser == user1)))
        return toString(theFoundChat)
    }
}
