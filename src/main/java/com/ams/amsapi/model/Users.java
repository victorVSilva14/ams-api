package com.ams.amsapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Table(name = "users")
@Getter @Setter @NoArgsConstructor
@Accessors(chain=true)
public class Users {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
    private Long id;
	
	@Column(name = "USERNAME", nullable = false)
    private String username;
	
	@Column(name = "EMAIL", nullable = false)
    private String email;
	
	@Column(name = "PASSWORD", nullable = false)
    private String password;

	@Column(name = "ROLE", nullable = false)
    private String roles;
}
