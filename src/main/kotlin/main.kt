fun main() {
    val users = ArrayList<User>()
    val messages = ArrayList<Message>()

    UserFunctions.createUser("User1", "email1@email.ru", users)
    UserFunctions.createUser("User2", "email2@email.ru", users)

    MessageFunctions.sendMessage(users[0], users[1], "some text1", messages)

    /*
    чат - массив сообщений двух пользователей
    то есть каждой паре общающихся пользователей соответствует один чат
    чат начинается с одного сообщения, которое создаёт пользователь
     */

}