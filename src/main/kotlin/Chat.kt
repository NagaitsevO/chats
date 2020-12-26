class Chat(
        val chatID: Int = 100,
        var messages: ArrayList<Message>
) {
    fun addMessageToChat(message: Message, transmittedUser: User, receivedUser: User) {
        messages.add(message)
    }

    fun toShowTheChat(user1: User, user2: User): List<Message> {
        val theFoundChat = messages.filter(fun(message: Message) =
                ((message.receivedUser == user1) || (message.receivedUser == user2) &&
                        (message.transmittedUser == user2) || (message.transmittedUser == user1)))
        return theFoundChat
    }




}