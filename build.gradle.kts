plugins {
    kotlin("jvm") version "1.8.21"
}

group = "ru.job4j"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.slf4j:slf4j-nop:1.7.32")
    testImplementation(kotlin("test"))
    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.4.2")
}

tasks.test {
    useJUnitPlatform()
}