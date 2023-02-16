package com.tpoad.morfandoInc.controlador;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tpoad.morfandoInc.dto.ErrorDTO;

import exceptions.RequestException;

@RestControllerAdvice
public class ControllerAdvice {
	
	@ExceptionHandler(value = RuntimeException.class)
	public ResponseEntity<ErrorDTO> runtimeExceptionHandler(RuntimeException ex){
		ErrorDTO error = ErrorDTO.builder().code("P-500").message(ex.getMessage()).build();
		
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = RequestException.class)
	public ResponseEntity<ErrorDTO> requestExceptionHandler(RequestException ex){
		ErrorDTO error = ErrorDTO.builder().code(ex.getCode()).message(ex.getMessage()).build();
		
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}
}
