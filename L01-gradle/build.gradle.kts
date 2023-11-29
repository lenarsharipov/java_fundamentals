plugins {
    id("java")
}

group = "com.java"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("com.google.guava:guava")

}

tasks.test {
    useJUnitPlatform()
}