package com.example.demo.cruduser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}) // exclude DB config since no DB used
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
// http://localhost:8099/SpringBootRestApi/api/user

//swagger ui http://localhost:8099/swagger-ui/index.html added dependencies in pom.xml
// actuator http://localhost:8099/actuator added dependencies in pom.xml and enabled endpoints in application.properties
