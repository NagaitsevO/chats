class Message(
    val messageID: Int = 10,
    //val chatIDinMessage: Int = 100,
    val transmittedUser: User,
    val receivedUser: User,
    var text: String = "some text",
    val time: Int = 100,
    var isRead: Boolean = false
)
