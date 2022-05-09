fun factorial(n: Int): Long {
    require(n >= 0)
    return if (n <= 1) 1 else factorial(n - 1) * n
}

class Point
class Cluster

fun findClusters(points: List<Point>): List<Cluster> {
    require(points.isNotEmpty())
    return listOf(Cluster())
}

class User(val email: String)

fun sendEmail(user: User, message: String) {
    requireNotNull(user.email)
}