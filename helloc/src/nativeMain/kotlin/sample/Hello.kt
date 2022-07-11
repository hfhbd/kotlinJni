package sample

import jni.*
import kotlinx.cinterop.*

@CName("Java_sample_Main_hello")
fun hello(env: CPointer<JNIEnvVar>, obj: jobject, from: jstring, repeat: jint): Int {
    val getStringUTFChars = env.pointed.pointed!!.GetStringUTFChars!!
    val cString = getStringUTFChars(env.reinterpret(), from, null)!!
    val kString = cString.toKString()
    env.pointed.pointed!!.ReleaseStringUTFChars!!(env.reinterpret(), from, cString)
    return hello("JNI: $kString", repeat)
}
