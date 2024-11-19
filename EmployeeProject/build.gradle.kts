plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.springframework.boot:spring-boot-starter-security:3.3.5")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.3.5")
    implementation("org.springframework.boot:spring-boot-starter-graphql:3.3.5")
    implementation("org.springframework.boot:spring-boot-starter-web:3.3.5")
    implementation("org.springframework.boot:spring-boot-starter-security:3.3.5")
    implementation("com.h2database:h2:2.3.232")
    implementation("org.hibernate.orm:hibernate-core:6.6.2.Final")
    implementation("org.hibernate:hibernate-entitymanager:5.6.15.Final")




}

tasks.test {
    useJUnitPlatform()
}
