package com.javadocker.demo.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
public class OperationalSystem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Getter @Setter
	private String javaVersion;
	
	@Getter @Setter
	private String vendor;
	
	@Getter @Setter
	private String vendorUrl;
	
	@Getter @Setter
	private String javaHome;
	
	@Getter @Setter
	private String vmSpecifiedName;
	
	@Getter @Setter
	private String vmSpecifiedVendor;
	
	@Getter @Setter
	private String vmSpecifiedVersion;
	
	@Getter @Setter
	private String vmName;
	
	@Getter @Setter
	private String vmVendor;
	
	@Getter @Setter
	private String vmVersion;
	
	@Getter @Setter
	private String specifiedVersion;
	
	@Getter @Setter
	private String specifiedVendor;
	
	@Getter @Setter
	private String specifiedName;
	
	@Getter @Setter
	private String classVersion;
	
	@Getter @Setter
	private String classPath;
	
	@Getter @Setter
	private String libPath;
	
	@Getter @Setter
	private String tmpdir;
	
	@Getter @Setter
	private String compiler;
	
	@Getter @Setter
	private String extDirs;
	
	@Getter @Setter
	private String osName;
	
	@Getter @Setter
	private String osArch;
	
	@Getter @Setter
	private String osVersion;
	
	@Getter @Setter
	private String fileSeparator;
	
	@Getter @Setter
	private String pathSeparator;
	
	@Getter @Setter
	private String lineSeparator;
	
	@Getter @Setter
	private String userName;
	
	@Getter @Setter
	private String userHome;
	
	@Getter @Setter
	private String userDir;
	
	@Getter @Setter
	private Integer processors;
	
	@Getter @Setter
	private Integer freeMemory;
	
	@Getter @Setter
	private Integer maxMemory;
	
	@Getter @Setter
	private Roots[] roots;
}
