package sample

import kotlinx.coroutines.*

suspend fun main() = coroutineScope {
    repeat(3) {
        launch {
            val s = Main().hello("from Kotlin", 4)
            println("$it $s")
        }
    }
}

class Main {
    init {
        System.loadLibrary("helloc")
    }

    external fun hello(from: String, repeat: Int): Int
}
