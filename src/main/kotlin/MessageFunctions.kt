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
        messages.set(message.messageID, message)
        return message.messageID
    }

    fun readMessage(message: Message,
                    messages: MutableList<Message>) {
        message.isRead = true
    }

    fun toString(messages: ArrayList<Message>): String {
        val messagesPrintOut = StringBuilder()
        for (message in messages) {
            messagesPrintOut.append("Отправитель: ")
            messagesPrintOut.append(message.receivedUser.userName)
            messagesPrintOut.append("//n")
            messagesPrintOut.append("Получатель: ")
            messagesPrintOut.append(message.transmittedUser.userName)
            messagesPrintOut.append("//n")
            messagesPrintOut.append("Сообщение: ")
            messagesPrintOut.append(message.text)
            messagesPrintOut.append("//n")
        }
        return messagesPrintOut.toString()
    }


}