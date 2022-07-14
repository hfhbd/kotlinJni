plugins {
    kotlin("jvm") version "1.7.10"
    id("app.cash.licensee") version "1.5.0"
}

allprojects {
    repositories {
        mavenCentral()
    }

    plugins.apply("app.cash.licensee")
    licensee {
        allow("Apache-2.0")
    }
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
}

tasks {
    withType<JavaCompile> {
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
    }
    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "1.8"
    }
    jar {
        manifest.attributes["Main-Class"] = "sample.MainKt"
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
        from(configurations.runtimeClasspath.get().map {
            if (it.isDirectory) it else zipTree(it)
        })
    }
}
