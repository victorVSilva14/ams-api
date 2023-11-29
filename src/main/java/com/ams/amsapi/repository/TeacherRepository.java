package com.ams.amsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ams.amsapi.model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
