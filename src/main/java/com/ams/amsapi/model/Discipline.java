package com.ams.amsapi.model;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Table(name = "discipline")
@Getter @Setter @NoArgsConstructor
@Accessors(chain=true)
public class Discipline implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="CD_DISCIPLINE", nullable=false)
	private Long id;

	@Column(name="NAME", nullable=false)
	private String name;
	
	@Column(name="START_DATE_TIME", nullable=false)
	private Date startDateTime;
	
	@Column(name="FINAL_DATE_TIME", nullable=false)
	private Date finalDateTime;
	
	@Column(name="DAY_OF_WEEK", nullable=false)
	private String dayOfWeek;
	
	@Column(name="CLASSROOM")
	private String classroom;

	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "CD_TEACHER", referencedColumnName = "CD_TEACHER")
	private Teacher teacher;
	
	@Lob
    @Column(name = "IMAGE", columnDefinition = "MEDIUMBLOB")
    private byte[] image;
	
	public void setImage(MultipartFile file) {
	    try {
	        this.image = file.getBytes();
	    } catch (IOException e) {
	    	e.printStackTrace();
	    }
	}
	
}
