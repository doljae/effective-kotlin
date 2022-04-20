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