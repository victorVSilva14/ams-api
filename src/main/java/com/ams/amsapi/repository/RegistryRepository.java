package com.ams.amsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ams.amsapi.model.Registry;

@Repository
public interface RegistryRepository extends JpaRepository<Registry, Long>, RegistryRepositoryCustom {
	public Registry findTopByOrderByEntryDateTimeDesc();
}
