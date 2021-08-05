fun main() {
    val users = ArrayList<User>()
    val messages = ArrayList<Message>()

    UserFunctions.createUser("User1", "email1@email.ru", users)
    UserFunctions.createUser("User2", "email2@email.ru", users)

    println(UserFunctions.changeUserEmail(users,0, "newemail@mail.ru"))
    println(users[0].email)

    val id = MessageFunctions.sendMessage(users[0], users[1], "some text1", messages)
    println(MessageFunctions.toString(messages))
    println(MessageFunctions.toShowTheChat(users[0], users[1], messages))

    val isEmail = UserFunctions.isEmailInArrayOfUsers(users, "email2@email.ru")
    println(isEmail)
    println(users)

}