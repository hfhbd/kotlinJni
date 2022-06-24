import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    repeat(3) {
        launch {
            val s = Main().hello("from Java", 4)
            println(s)
        }
    }
}

class Main {
    init {
        System.load("/Users/philipwedemann/Downloads/kotlinJni/libhello.o")
    }

    external fun hello(from: String, repeat: Int): Int
}
