plugins {
    kotlin("jvm") version "1.9.24"
    application
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("MainKt")
}

// build variant 1
version = "0.1.1"
