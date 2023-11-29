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

import com.ams.amsapi.business.TeacherBusiness;
import com.ams.amsapi.model.Teacher;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    private final TeacherBusiness teacherBusiness;

    @Autowired
    public TeacherController(TeacherBusiness teacherBusiness) {
        this.teacherBusiness = teacherBusiness;
    }

    @GetMapping
    public ResponseEntity<List<Teacher>> getAllTeachers() {
        List<Teacher> teachers = teacherBusiness.getAllTeachers();
        return ResponseEntity.ok(teachers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable Long id) {
        Teacher teacher = teacherBusiness.getTeacherById(id);
        return ResponseEntity.ok(teacher);
    }

    @PostMapping
    public ResponseEntity<Teacher> createOrUpdateTeacher(@RequestBody Teacher teacher) {
        Teacher savedTeacher = teacherBusiness.createOrUpdateTeacher(teacher);
        return new ResponseEntity<>(savedTeacher, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTeacher(@PathVariable Long id) {
        teacherBusiness.deleteTeacher(id);
        return ResponseEntity.noContent().build();
    }
}
