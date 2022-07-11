package sample

fun hello(from: String, repeat: Int): Int {
    repeat(repeat) {
        println("Hello World from $from.")
    }
    return repeat
}
