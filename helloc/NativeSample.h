#include <jni.h>

#ifndef _Included_NativeSample
#define _Included_NativeSample
#ifdef __cplusplus
extern "C" {
#endif

JNIEXPORT int JNICALL Java_Main_hello(JNIEnv *env, jobject obj, jstring from, jint repeat);

#ifdef __cplusplus
}
#endif
#endif
