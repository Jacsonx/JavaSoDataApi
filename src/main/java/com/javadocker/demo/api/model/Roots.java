package com.javadocker.demo.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class Roots {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Getter @Setter
	private String absolutePath;
	
	@Getter @Setter
	private String totalSpace;
	
	@Getter @Setter
	private String freeSpace;
	
	@Getter @Setter
	private String usableSpace;
	
}
