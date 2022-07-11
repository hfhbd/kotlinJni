import org.jetbrains.kotlin.gradle.plugin.mpp.*

plugins {
    kotlin("multiplatform")
}

kotlin {
    fun KotlinNativeTarget.config() {
        binaries.sharedLib()

        compilations.getByName("main") {
            cinterops {
                val jni by creating {
                    defFile(project.file("src/nativeInterop/cinterop/jni.def"))
                }
            }
        }
    }

    linuxX64 {
        config()
    }
    macosArm64 { config() }
    jvm()

    sourceSets {
        val nativeMain by creating {
            dependsOn(commonMain.get())
        }
        val linuxX64Main by getting {
            dependsOn(nativeMain)
        }
        val macosArm64Main by getting {
            dependsOn(nativeMain)
        }
    }
}
