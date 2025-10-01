package com.example.applicationForm.service.impl;

import com.example.applicationForm.model.Student;
import com.example.applicationForm.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class inMemoryStudentServiceImpl implements StudentService {
    @Override
    public List<Student> findAllStudents() {
        return null;
    }
    @Override
    public Student saveStudent(Student student) {
        return null;
    }
    @Override
    public Student updateStudent(Student student) {
        return null;
    }
    @Override
    public Student findByEmail(String email) {
        return null;
    }
    @Override
    public void deleteStudent(String email) {}



}
