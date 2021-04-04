package com.example.testspringbooti18n;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;

@SpringBootApplication
public class TestSpringbootI18nApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSpringbootI18nApplication.class, args);
    }

    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }
}
