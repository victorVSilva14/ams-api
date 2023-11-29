package com.ams.amsapi.business;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.amsapi.model.Registry;
import com.ams.amsapi.model.resource.RegistryResource;
import com.ams.amsapi.repository.RegistryRepository;

@Service
public class RegistryBusiness {
	
	private RegistryRepository repository;
	
	@Autowired
	public RegistryBusiness(RegistryRepository repository) {
		super();
		this.repository = repository;
	}
	
	public List<Registry> findAllRegistry() {
		return this.repository.findAll();
	}
	
    public void registerEntry() throws Exception {
    	try {
    		RegistryResource registro = new RegistryResource();
            registro.setEntryDateTime(new Date());
            this.repository.save(registro.toEntity());
    	} catch(Exception e) {
    		throw new Exception(e.getMessage());
    	}
    }

    public void registerExit() throws Exception {
    	try {
    		Registry lastRegistration = this.repository.findTopByOrderByEntryDateTimeDesc();
            if (lastRegistration != null && lastRegistration.getExitDateTime() == null) {
            	lastRegistration.setExitDateTime(new Date());
                this.repository.save(lastRegistration);
            }
    	} catch(Exception e) {
    		throw new Exception(e.getMessage());
    	}
    }

    public Registry getLastRegistration() {
		Registry ultimoRegistro = this.repository.findTopByOrderByEntryDateTimeDesc();
		return ultimoRegistro;
    }
}
