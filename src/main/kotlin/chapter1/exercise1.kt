package chapter1

data class User(var name: String)
class UserHolder {
    private val user: User = User("doljae")

    fun get(): User {
        // defensive copying
        return user.copy()
    }
}

class UserRepository {
    private val storedUsers: MutableMap<Int, String> = mutableMapOf()

    fun loadAll(): Map<Int, String> {
        // upcast collection -> make collection read-only
        return storedUsers
    }
}