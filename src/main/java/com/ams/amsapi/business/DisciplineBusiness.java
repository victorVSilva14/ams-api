package com.ams.amsapi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.amsapi.model.Discipline;
import com.ams.amsapi.repository.DisciplineRepository;

@Service
public class DisciplineBusiness {
	private final DisciplineRepository disciplineRepository;

    @Autowired
    public DisciplineBusiness(DisciplineRepository disciplineRepository) {
        this.disciplineRepository = disciplineRepository;
    }

    public List<Discipline> getAllDisciplines() {
        return disciplineRepository.findAll();
    }

    public Discipline getDisciplineById(Long id) {
        return disciplineRepository.findById(id).orElse(null);
    }

    public Discipline createOrUpdateDiscipline(Discipline discipline) {
        return disciplineRepository.save(discipline);
    }

    public void deleteDiscipline(Long id) {
        disciplineRepository.deleteById(id);
    }

}