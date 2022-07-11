import org.jetbrains.kotlin.gradle.plugin.mpp.*

plugins {
    kotlin("multiplatform")
}

kotlin {
    fun KotlinNativeTarget.config() {
        binaries.executable {
            entryPoint = "sample.main"
        }
    }

    linuxX64 {
        config()
    }
    macosArm64 { config() }

    sourceSets {
        commonMain {
            dependencies {
                implementation(projects.helloc)
            }
        }
    }
}
