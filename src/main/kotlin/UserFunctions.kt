object UserFunctions {
    private var userBufferID: Int = 0

    fun createUser(userName: String, email: String, users: MutableCollection<User>): Int {
        if (!isEmailInArrayOfUsers(users, email)) {
            val user = User(userBufferID, userName, email)
            users.add(user)
            userBufferID++
            return user.userID
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

    fun toCleanUserBufferID(): Boolean {
        userBufferID = 0
        return true
    }



}