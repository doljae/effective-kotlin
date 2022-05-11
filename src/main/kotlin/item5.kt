fun factorial(n: Int): Long {
    // require안의 조건을 만족하지 못하면 IllegalArgumentException을 throw한다.
    // 메시지도 넣을 수 있다.
    require(n >= 0) { "Cannot calculate factorial of $n, because it is smaller than 0" }
    return if (n <= 1) 1 else factorial(n - 1) * n
}

class Point
class Cluster

fun findClusters(points: List<Point>): List<Cluster> {
    require(points.isNotEmpty())
    return listOf(Cluster())
}

enum class Outfit {
    DRESS, COAT
}

class User(val email: String, val outfit: Outfit)

fun sendEmail(user: User, message: String) {
    requireNotNull(user.email)
    val email: String = user.email ?: return
}

fun sendEmailV2(user: User) {
    val email: String = user.email ?: run {
        println("Email not sent, no email address")
        return
    }
}

fun speak(text: String, isInitialized: Boolean) {
    check(isInitialized)
    println(text)
}

fun changeDress(user: User) {
    require(user.outfit == Outfit.DRESS)
    val outfit = requireNotNull(user.outfit)
}

fun main() {
    println(factorial(3))
}