plugins {
    id("java")
}

group = "com.java"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("com.google.guava:guava")
    testImplementation(platform("org.junit:junit-bom:5.9.2"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
}

tasks.test {
    useJUnitPlatform()
}