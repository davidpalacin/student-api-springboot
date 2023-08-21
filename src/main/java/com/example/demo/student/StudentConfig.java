package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
  @Bean
  CommandLineRunner commandLineRunner(StudentRepository repository) {
    return args -> {
      Student david = new Student(
          "David",
          "palacingimenezdavid.fpllefia@gmail.com",
          LocalDate.of(1999, Month.JULY, 12),
          24);

      Student alex = new Student(
          "Alex",
          "alex@gmail.com",
          LocalDate.of(2004, Month.JULY, 5),
          19);

      repository.saveAll(
        List.of(david, alex)
      );

    };
  }
}
