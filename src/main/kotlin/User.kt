data class User(
    val userID: Int = 0,
    var userName: String = "",
    var email: String = "email@email.ru"
) {

    override fun toString(): String {
        return ("ID Пользователя - $userID, " +
                "Имя пользователя - $userName" +
                "Электронный адрес пользователя - $email")
    }
}