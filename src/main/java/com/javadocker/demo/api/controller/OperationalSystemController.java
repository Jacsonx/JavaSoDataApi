package com.javadocker.demo.api.controller;

import java.security.Provider.Service;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javadocker.demo.api.model.OperationalSystem;
import com.javadocker.demo.api.response.Response;
import com.javadocker.demo.api.services.impl.OperationalSystemService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/so")
@Api(tags = { "Operational System"}, description = "Services about OS data")
public class OperationalSystemController {
	
	@Autowired private OperationalSystemService soService;

	
	@ApiResponses( value = { 
	              @ApiResponse(code = 200, message = "OK"),
	              @ApiResponse(code = 206, message = "Partial Content"),
	              @ApiResponse(code = 401, message = "Unauthorized"),
	              @ApiResponse(code = 403, message = "Forbidden"),
	              @ApiResponse(code = 404, message = "Not Found"),
	              @ApiResponse(code = 500, message = "Internal Server Errors")
	              })
	@GetMapping(value = "/")
	public ResponseEntity<Response<OperationalSystem>> findSoData(HttpServletRequest request) {
		
		   return soService.findSoData(request);
	}
	
	
}
