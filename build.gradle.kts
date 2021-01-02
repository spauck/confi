import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  val kotlinVersion = "1.4.20"
  kotlin("jvm") version kotlinVersion
}

group = "com.github.spauck.confi"
version = "0.1-SNAPSHOT"

repositories {
  mavenCentral()
  jcenter()
}

dependencies {
  implementation("org.slf4j:slf4j-simple:1.7.26")
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

  val junitVersion = "5.7.0"
  testImplementation("org.junit.jupiter:junit-jupiter-api:$junitVersion")
  testImplementation("org.junit.jupiter:junit-jupiter-params:$junitVersion")
  testImplementation("org.assertj:assertj-core:3.17.2")
  testImplementation("org.mockito:mockito-core:3.5.13")

  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junitVersion")
}

tasks.withType<KotlinCompile> {
  kotlinOptions.jvmTarget = "1.8"
}

tasks.withType<Test> {
  useJUnitPlatform()
  testLogging {
    events("passed", "skipped", "failed")
  }
}
