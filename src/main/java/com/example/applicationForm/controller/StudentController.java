package com.example.applicationForm.controller;

import com.example.applicationForm.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.handler.MappedInterceptor;
import com.example.applicationForm.model.Student;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> findAllStudents(){
        //todo
        return studentService.findAllStudents();
    }

    @PostMapping("/save_student")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email) {
        return studentService.findByEmail(email);
    }

    @PutMapping("update_student")
    public Student updateStudent(Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable String email) {
        studentService.deleteStudent(email);
    }
}
