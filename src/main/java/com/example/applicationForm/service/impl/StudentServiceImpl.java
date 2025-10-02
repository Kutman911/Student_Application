package com.example.applicationForm.service.impl;

import com.example.applicationForm.model.Student;
import com.example.applicationForm.repository.StudentRepository;
import com.example.applicationForm.service.StudentService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Primary
@AllArgsConstructor
@Service
public class StudentServiceImpl  implements StudentService {

    private final StudentRepository repository;

    @Override
    public List<Student> findAllStudents() {
        return List.of();
    }

    @Override
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    @Transactional
    public void deleteStudent(String email) {
        repository.deleteByEmail(email);
    }
}
