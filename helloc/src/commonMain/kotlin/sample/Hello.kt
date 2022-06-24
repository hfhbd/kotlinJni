package sample

import jni.*

@CName("Java_Main_hello")
fun hello(env: JNIEnv, obj: jobject, from: jstring, repeat: jint): Int {
    repeat(repeat) {
        println("Hello World from JNI: $from")
    }
    return repeat
}
