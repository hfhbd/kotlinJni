#include <stdio.h>
#include "NativeSample.h"

JNIEXPORT int JNICALL Java_Main_hello(JNIEnv *env, jobject obj, jstring from, jint repeat) {
  const char *f = (*env)->GetStringUTFChars(env, from, NULL);
    for(int x = 0; x < repeat; x++) {
      printf("Hello World from JNI: %s\n", f);
    }
  return repeat;
}
