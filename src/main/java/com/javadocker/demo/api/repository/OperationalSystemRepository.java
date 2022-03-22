package com.javadocker.demo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javadocker.demo.api.model.OperationalSystem;

@Repository
public interface OperationalSystemRepository extends JpaRepository<OperationalSystem, Long>{
	

	
}
