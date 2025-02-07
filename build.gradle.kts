plugins {
    kotlin("jvm") version "2.1.0"
}

group = "com.github.beetv"
version = "1.0-SNAPSHOT"

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(11)
}