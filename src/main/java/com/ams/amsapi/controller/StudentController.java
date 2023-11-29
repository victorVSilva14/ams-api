package com.ams.amsapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ams.amsapi.business.StudentBusiness;
import com.ams.amsapi.model.Student;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentBusiness studentBusiness;

    @Autowired
    public StudentController(StudentBusiness studentBusiness) {
        this.studentBusiness = studentBusiness;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentBusiness.getAllStudents();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Student student = studentBusiness.getStudentById(id);
        return ResponseEntity.ok(student);
    }

    @PostMapping
    public ResponseEntity<Student> createOrUpdateStudent(@RequestBody Student student) {
        Student savedStudent = studentBusiness.createOrUpdateStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentBusiness.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
}
