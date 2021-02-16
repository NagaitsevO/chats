object MessageFunctions {
    private var messageBufferID = 1

    fun sendMessage(transmittedUser: User,
                    receivedUser: User,
                    text: String,
                    messages: MutableList<Message>): Int {
        val message = Message(
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

    fun toString(messages: List<Message>): String {
        val messagesPrintOut = StringBuilder()
        for (message in messages) {
            messagesPrintOut.append("Отправитель: ")
            messagesPrintOut.append(message.receivedUser.userName)
            messagesPrintOut.append("\n")
            messagesPrintOut.append("Получатель: ")
            messagesPrintOut.append(message.transmittedUser.userName)
            messagesPrintOut.append("\n")
            messagesPrintOut.append("Сообщение: ")
            messagesPrintOut.append(message.text)
            messagesPrintOut.append("\n")
            readMessage(message, messages)
        }
        return messagesPrintOut.toString()
    }

    fun toShowTheChat(user1: User, user2: User, messages: MutableList<Message>): String {
        val theFoundChat = messages.filter(fun(message: Message) =
                ((message.receivedUser == user1) || (message.receivedUser == user2) &&
                        (message.transmittedUser == user2) || (message.transmittedUser == user1)))
        return toString(theFoundChat)
    }

}