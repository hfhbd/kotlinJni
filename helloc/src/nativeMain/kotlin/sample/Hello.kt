package sample

import jni.*
import kotlinx.cinterop.*

@CName("Java_Main_hello")
fun hello(env: JNIEnv, obj: jobject, from: jstring) {
    val getStringUTFChars = requireNotNull(env.pointed.GetStringUTFChars) {
        "GET FAILED"
    }
    val cString = getStringUTFChars(env.reinterpret(), from, null)!!
    val kString = cString.toKString()
    env.pointed.ReleaseStringUTFChars!!(env.reinterpret(), from, cString)
    println("HELLO FROM JNI: $kString")
}
