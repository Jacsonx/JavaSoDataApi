package com.javadocker.demo.api.services.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;

import com.javadocker.demo.api.model.OperationalSystem;
import com.javadocker.demo.api.response.Response;

import com.javadocker.demo.api.services.os.IOperationalSystem;

public class OperationalSystemService implements IOperationalSystem  {

	@Override
	public ResponseEntity<Response<OperationalSystem>> findSoData(HttpServletRequest request){
		
		return null;
	}	
}
