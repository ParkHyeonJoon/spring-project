dependencies {
    implementation(project(":netplix-core:core-usecase"))
    implementation(project(":netplix-core:core-port"))
    runtimeOnly(project(":netplix-adapters:adapter-http"))
    runtimeOnly(project(":netplix-adapters:adapter-persistence"))
    implementation("org.springframework:spring-context")
}