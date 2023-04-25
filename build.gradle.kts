plugins {
    id("java-library")
    id("checkstyle")
    id("maven-publish")
}

group = "com.github.allinkdev"
version = "1.0.0"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8

    withSourcesJar()
}


tasks {
    assemble {
        dependsOn(checkstyleMain)
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
}