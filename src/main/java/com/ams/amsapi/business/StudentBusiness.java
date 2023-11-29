package com.ams.amsapi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.amsapi.model.Student;
import com.ams.amsapi.repository.StudentRepository;

@Service
public class StudentBusiness {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentBusiness(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student createOrUpdateStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
