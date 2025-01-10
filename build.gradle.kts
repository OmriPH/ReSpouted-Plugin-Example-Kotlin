plugins {
    java
}

dependencies {
    implementation(files("lib/spoutpluginapi.jar"))
    implementation(files("lib/craftbukkit.jar"))
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}
