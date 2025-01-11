plugins {
    id("com.gradleup.shadow") version "9.0.0-beta4"
    kotlin("jvm") version "2.1.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(files("lib/spoutpluginapi.jar"))
    implementation(files("lib/craftbukkit.jar"))
    implementation(kotlin("stdlib"))
}

tasks {
    build {
        dependsOn(shadowJar)
    }

    shadowJar{
        minimize()
    }
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}
