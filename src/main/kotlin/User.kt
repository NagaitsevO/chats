class User(
    val userID: Int,
    var userName: String,
    var email: String = "email@email.ru"
) {


    var bufferID: Int = 1
    val users = ArrayList<User>()
    fun createUser(userName: String, email: String): Int {
        if (!isEmailInArrayOfUsers(email)) {
            val user = User(bufferID, userName, email)
            users.add(user)
            return bufferID
            bufferID++
        }
        return 0
    }

    fun isEmailInArrayOfUsers(testedEmail: String): Boolean {
        for (user in users) {
            if (user.email == testedEmail) {
                return true
            }
        }
        return false
    }

    fun changeUserEmail(userID: Int, newEmail: String): Boolean {
        for (user in users) {
            if (user.userID == userID) {
                user.email = newEmail
                return true
            }
        }
        return false
    }

    fun changeUserName(userID: Int, newName: String): Boolean {
        for (user in users) {
            if (user.userID == userID) {
                user.userName = newName
                return true
            }
        }
        return false
    }

}