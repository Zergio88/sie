package com.tpoad.morfandoInc.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class HomeController {

	@Autowired
	@GetMapping
	String sayHello() {
	    return "Welcome to my service";
	}

	
}
