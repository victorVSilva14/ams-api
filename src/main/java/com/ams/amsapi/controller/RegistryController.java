package com.ams.amsapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ams.amsapi.business.RegistryBusiness;
import com.ams.amsapi.model.Registry;

@RestController
@RequestMapping(value="registry")
public class RegistryController {

	@Autowired
	private RegistryBusiness business;
	
	@GetMapping
	public ResponseEntity<List<Registry>> findAllRegistry() {
		List<Registry> registryList = business.findAllRegistry();
		return ResponseEntity.ok(registryList);
	}
	
	@GetMapping(value="last-registration")
	public ResponseEntity<Registry> getLastRegistration() {
		Registry registryList = business.getLastRegistration();
		return ResponseEntity.ok(registryList);
	}
	
	@PostMapping("entry")
	public ResponseEntity<Void> registerEntry() throws Exception {
		this.business.registerEntry();
		return ResponseEntity.ok().build();
	}
	
	@PostMapping("exit")
	public ResponseEntity<Void> registerExit() throws Exception {
		this.business.registerExit();
		return ResponseEntity.ok().build();
	}
}
