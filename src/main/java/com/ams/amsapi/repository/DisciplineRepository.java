package com.ams.amsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ams.amsapi.model.Discipline;

@Repository
public interface DisciplineRepository extends JpaRepository<Discipline, Long> {

}
