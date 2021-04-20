object UserFunctions {
    private var userBufferID: Int = 1

    fun createUser(userName: String, email: String, users: MutableCollection<User>): Int {
        if (!isEmailInArrayOfUsers(users, email)) {
            val user = User(userBufferID, userName, email)
            users.add(user)
            userBufferID++
            return userBufferID
        }
        return 0
    }

    fun isEmailInArrayOfUsers(users: MutableCollection<User>, testedEmail: String):
            Boolean = users.any { it.email == testedEmail }

    fun changeUserEmail(users: MutableCollection<User>, userID: Int, newEmail: String): Boolean {
        users.forEach {
            if (it.userID == userID) {
                it.email = newEmail
                return true
            }
        }
        return false
    }

    fun changeUserName(users: MutableCollection<User>, userID: Int, newName: String): Boolean {
        users.forEach {
            if (it.userID == userID) {
                it.userName = newName
                return true
            }
        }
        return false
    }

    fun getUserName(user: User): String {
        return user.userName
    }





}