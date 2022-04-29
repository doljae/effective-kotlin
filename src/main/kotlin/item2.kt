fun updateWeather(degree: Int) {
    val (description, color) = when {
        degree < 5 -> "cold" to Color.BLUE
        degree < 23 -> "mild" to Color.YEllOW
        else -> "hot" to Color.RED
    }
    println("$description, $color")
}

enum class Color {
    RED, BLUE, YEllOW
}

fun main() {

    // v1
//    var numbers = (2..100).toList()
//    val primes = mutableListOf<Int>()
//    while (numbers.isNotEmpty()) {
//        val prime = numbers.first()
//        primes.add(prime)
//        numbers = numbers.filter { it % prime != 0 }
//    }

    //v2
    val primes: Sequence<Int> = sequence {
        var numbers = generateSequence(2) { it + 1 }
        while (true) {
            val prime = numbers.first()
            yield(prime)
            numbers = numbers.drop(1).filter { it % prime != 0 }
        }
    }


    print(primes.take(10).toList())

}