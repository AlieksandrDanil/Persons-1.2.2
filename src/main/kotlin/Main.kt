fun main() {
    print("Введите целым числом количество лиц, которым понравилось данное видео: ")
    val likes = readLine()?.toInt() ?: return
    val lastFigure: Char = likes.toString().last()
    val persons = if (likes == 0 || likes in 2..20 || lastFigure.digitToInt() != 1) {
        "людям"
    } else if (lastFigure.digitToInt() == 1) {
        "человеку"
    } else {
        ""
    }
    println("Понравилось $likes $persons")
}