package sample

import jni.*
import kotlinx.cinterop.*

@CName("Java_sample_Main_hello")
fun hello(env: CPointer<JNIEnvVar>, obj: jobject, from: jstring, repeat: jint): Int {
    val from = env.getString(from)
    return hello("JNI: $from", repeat)
}

private fun CPointer<JNIEnvVar>.getString(string: jstring): String {
    val getStringChars = pointed.pointed!!.GetStringChars!!
    val cString = getStringChars(reinterpret(), string, null)!!
    val kString = cString.toKString()
    pointed.pointed!!.ReleaseStringChars!!(reinterpret(), string, cString)
    return kString
}
