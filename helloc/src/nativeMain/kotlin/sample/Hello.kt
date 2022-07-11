package sample

import jni.*
import kotlinx.cinterop.*

@CName("Java_sample_Main_hello")
fun hello(env: CPointer<JNIEnvVar>, obj: jobject, from: jstring) {
    val getStringUTFChars = requireNotNull(env.pointed.pointed!!.GetStringUTFChars) {
        "GET FAILED"
    }
    val cString = getStringUTFChars(env.reinterpret(), from, null)!!
    val kString = cString.toKString()
    env.pointed.pointed!!.ReleaseStringUTFChars!!(env.reinterpret(), from, cString)
    println("HELLO FROM JNI: $kString")
}
