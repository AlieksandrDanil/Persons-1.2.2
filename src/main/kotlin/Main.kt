fun main() {
    val likes = 61
    val lastFigure: Char = likes.toString().last()
    val end = if (likes == 0 || likes in 2..20 || lastFigure.digitToInt() != 1) {
        "ам"
    } else if (lastFigure.digitToInt() == 1) {
        "у"
    } else {
        ""
    }
    println("Понравилось $likes человек$end")
}