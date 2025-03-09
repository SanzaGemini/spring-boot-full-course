package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Student;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Student> listofStudent(){
		return List.of(new Student(
									1L,
									"John",
									"johndoe@email.com",
									LocalDate.of(2000,02,14),
									"25"));
	}

}
