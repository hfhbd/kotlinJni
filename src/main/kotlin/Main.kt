fun main() {
    Main().hello("Hello from Kotlin")
}

class Main {
    init {
        System.loadLibrary("helloc")
    }

    external fun hello(from: String)
}
