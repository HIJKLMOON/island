/*
 * island 应用构建脚本。
 *
 * 共享配置（仓库、测试运行器）由根项目统一提供，这里只写本应用自身的内容。
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

group = "com.center"
version = "1.0.0"

dependencies {
    implementation(project(":common"))

    testImplementation(libs.junit.jupiter)
    testRuntimeOnly(libs.junit.platform.launcher)

    // This dependency is used by the application.
    implementation(libs.guava)
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    // Define the main class for the application.
    mainClass = "com.center.island.App"
}
