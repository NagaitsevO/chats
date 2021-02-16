import java.lang.reflect.Array.get

object UserFunctions {
    private var userBufferID: Int = 1

    fun createUser(userName: String, email: String, users: MutableCollection<User>): Int {
        if (!isEmailInArrayOfUsers(users, email)) {
            val user = User(userBufferID, userName, email)
            users.add(user)
            return userBufferID
            userBufferID++
        }
        return 0
    }

    fun isEmailInArrayOfUsers(users: MutableCollection<User>, testedEmail: String): Boolean {
        for (user in users) {
            if (user.email == testedEmail) {
                return true
            }
        }
        return false
    }

    fun changeUserEmail(users: MutableCollection<User>, userID: Int, newEmail: String): Boolean {
        for (user in users) {
            if (user.userID == userID) {
                user.email = newEmail
                return true
            }
        }
        return false
    }

    fun changeUserName(users: MutableCollection<User>, userID: Int, newName: String): Boolean {
        for (user in users) {
            if (user.userID == userID) {
                user.userName = newName
                return true
            }
        }
        return false
    }

    fun getUserName(user: User): String {
        return user.userName
    }





}