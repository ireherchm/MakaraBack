package com.ihc.makaraBack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MakaraBackApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MakaraBackApplication.class);
        app.run(args);
    }
}
