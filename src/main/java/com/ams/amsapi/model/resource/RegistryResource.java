package com.ams.amsapi.model.resource;

import java.util.Date;

import com.ams.amsapi.model.Registry;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @NoArgsConstructor
@Accessors(chain=true)
public class RegistryResource {
	private Long id;
	private Date entryDateTime;
	private Date exitDateTime;
	
	public Registry toEntity() {
		return new Registry()
				.setId(this.id)
				.setEntryDateTime(this.entryDateTime)
				.setExitDateTime(this.exitDateTime);
	}
}
