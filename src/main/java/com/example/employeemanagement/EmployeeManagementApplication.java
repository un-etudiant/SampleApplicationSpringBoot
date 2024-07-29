//package com.example.employeemanagement;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.env.Environment;
//import org.springframework.core.env.SimpleCommandLinePropertySource;
//
//@SpringBootApplication
//public class EmployeeManagementApplication {
//
//    public static void main(String[] args) {
//
//        SpringApplication app = new SpringApplication(EmployeeManagementApplication.class);
//        SimpleCommandLinePropertySource source = new SimpleCommandLinePropertySource(args);
//        if (!source.containsProperty("spring.profiles.active") &&
//                !System.getenv().containsKey("SPRING_PROFILES_ACTIVE")) {
//            app.setAdditionalProfiles("dev"); // Set default profile to dev
//        }
//        app.run(args);
//
//    }
//    @Bean
//    public CommandLineRunner commandLineRunner(Environment env) {
//        return args -> {
//            System.out.println("Active profiles: " + String.join(", ", env.getActiveProfiles()));
//        };
//    }
//
//}
package com.example.employeemanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementApplication {

    public static void main(String[] args) {
//        SpringApplication app = new SpringApplication(EmployeeManagementApplication.class);
//        SimpleCommandLinePropertySource source = new SimpleCommandLinePropertySource(args);
//        if (!source.containsProperty("spring.profiles.active") &&
//                !System.getenv().containsKey("SPRING_PROFILES_ACTIVE")) {
//            app.setAdditionalProfiles("dev"); // Set default profile to dev
//        }

        SpringApplication.run(EmployeeManagementApplication.class, args);
           }
}
