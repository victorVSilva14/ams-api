package com.ams.amsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ams.amsapi.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
