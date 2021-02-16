class Chat(
        val chatID: Int = 100,
        var messages: ArrayList<Message>
) {
    fun addMessageToChat(message: Message, transmittedUser: User, receivedUser: User) {
        messages.add(message)
    }






}