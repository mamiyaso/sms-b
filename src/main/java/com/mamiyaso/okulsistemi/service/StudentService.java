// StudentService.java
package com.mamiyaso.okulsistemi.service;

import com.mamiyaso.okulsistemi.model.Student;
import com.mamiyaso.okulsistemi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public List<Student> getStudentsByLastName(String lastName) {
        return studentRepository.findByLastName(lastName);
    }

    public Student getStudentByEmail(String email) {
        return studentRepository.findByEmail(email);
    }
}
