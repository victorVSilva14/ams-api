package com.ams.amsapi.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Table(name = "student")
@Getter @Setter @NoArgsConstructor
@Accessors(chain=true)
public class Student {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CD_STUDENT", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "AGE")
    private int age;

    @Column(name = "EMAIL")
    private String email;

    @ManyToMany
    @JoinTable(
        name = "Student_Discipline",
        joinColumns = @JoinColumn(name = "CD_STUDENT"),
        inverseJoinColumns = @JoinColumn(name = "CD_DISCIPLINE")
    )
    private List<Discipline> disciplines;
}
