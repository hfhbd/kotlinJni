## Kotlinjni

# Usage

Kotlin C: `gradlew assemble` 

Plain C: 
Linux: `gcc helloc/hello.c -o libhello.so -fPIC -I ${JAVA_HOME}/include -I ${JAVA_HOME}/include/linux`

macOS: `clang -shared helloc/hello.c -o libhelloc.dylib -fPIC -I ${JAVA_HOME}/include -I ${JAVA_HOME}/include/darwin`

Running: 
`java -jar -Djava.library.path=kotlinJni/helloc/build/bin/macosArm64/debugShared kotlinJni.jar`
