package com.example.applicationForm.service.impl;

import com.example.applicationForm.model.Student;
import com.example.applicationForm.repository.inMemoryStudentDAO;
import com.example.applicationForm.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class inMemoryStudentServiceImpl implements StudentService {

    private final inMemoryStudentDAO repository;
    @Override
    public List<Student> findAllStudents() {
        return repository.findAllStudents();
    }
    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }
    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }
    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }
    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }

}
