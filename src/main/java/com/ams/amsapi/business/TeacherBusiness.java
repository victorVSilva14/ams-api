package com.ams.amsapi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.amsapi.model.Teacher;
import com.ams.amsapi.repository.TeacherRepository;

@Service
public class TeacherBusiness {

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherBusiness(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Teacher getTeacherById(Long id) {
        return teacherRepository.findById(id).orElse(null);
    }

    public Teacher createOrUpdateTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public void deleteTeacher(Long id) {
        teacherRepository.deleteById(id);
    }
}
