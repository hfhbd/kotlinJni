## Kotlinjni

# Usage

Kotlin C: `gradlew assemble` 

Plain C: `gcc c/hello.c -o libhello.o -fPIC -I ${JAVA_HOME}/include -I ${JAVA_HOME}/include/darwin`

Running: 
`java -jar -Djava.library.path=kotlinJni/helloc/build/bin/macosArm64/debugShared kotlinJni.jar`
