package com.javadocker.demo.api.services.os;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;

import com.javadocker.demo.api.model.OperationalSystem;
import com.javadocker.demo.api.response.Response;
import com.javadocker.demo.api.services.impl.OperationalSystemService;

public interface IOperationalSystem {


	ResponseEntity<Response<OperationalSystem>> findSoData(HttpServletRequest request);

}
