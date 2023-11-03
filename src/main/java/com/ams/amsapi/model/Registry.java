package com.ams.amsapi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ams.amsapi.model.resource.RegistryResource;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Table(name = "registry")
@Getter @Setter @NoArgsConstructor
@Accessors(chain=true)
public class Registry implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name="CD_REGISTRY", nullable=false)
	private Long id;

	@Column(name="ENTRY_DATE_TIME", nullable=true)
	private Date entryDateTime;
	
	@Column(name="EXIT_DATE_TIME", nullable=true)
	private Date exitDateTime;
	
	public RegistryResource toDTO() {
		return new RegistryResource()
				.setId(this.id)
				.setEntryDateTime(this.entryDateTime)
				.setExitDateTime(this.exitDateTime);
	}
}
