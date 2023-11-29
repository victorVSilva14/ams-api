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

import com.ams.amsapi.business.DisciplineBusiness;
import com.ams.amsapi.model.Discipline;

@RestController
@RequestMapping("/disciplines")
public class DisciplineController {

    private final DisciplineBusiness disciplineBusiness;

    @Autowired
    public DisciplineController(DisciplineBusiness DisciplineBusiness) {
        this.disciplineBusiness = DisciplineBusiness;
    }

    @GetMapping
    public ResponseEntity<List<Discipline>> getAllDisciplines() {
        List<Discipline> disciplines = this.disciplineBusiness.getAllDisciplines();
        return ResponseEntity.ok(disciplines);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Discipline> getDisciplineById(@PathVariable Long id) {
        Discipline discipline = this.disciplineBusiness.getDisciplineById(id);
        return ResponseEntity.ok(discipline);
    }

    @PostMapping
    public ResponseEntity<Discipline> createOrUpdateDiscipline(@RequestBody Discipline discipline) {
        Discipline savedDiscipline = this.disciplineBusiness.createOrUpdateDiscipline(discipline);
        return new ResponseEntity<>(savedDiscipline, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDiscipline(@PathVariable Long id) {
    	this.disciplineBusiness.deleteDiscipline(id);
        return ResponseEntity.noContent().build();
    }
}
