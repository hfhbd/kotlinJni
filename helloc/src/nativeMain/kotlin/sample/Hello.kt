package sample

import jni.*
import kotlinx.cinterop.*

@CName("Java_Main_hello")
fun hello(env: JNIEnv, obj: jobject, from: jstring, repeat: jint): Int {
    val from = env.pointed.GetStringUTFChars!!(env.reinterpret(), from, null)!!.toKString()
    return hello("JNI: $from", repeat)
}
