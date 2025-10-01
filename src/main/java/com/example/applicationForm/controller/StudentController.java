package com.example.applicationForm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.handler.MappedInterceptor;
import com.example.applicationForm.model.Student;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> findAllStudents(){

        return List.of(
            Student.builder().firstname("John").lastname("Doe").email("John1997@gmail,com").age(28).build(),
                Student.builder().firstname("Anna").lastname("Aleksei").email("sabchuk1997@gmail,com").age(28).build(),
                Student.builder().firstname("Nikolay").lastname("Danya").email("Danilov1997@gmail,com").age(28).build()
        );
    }
}
