package com.tpoad.morfandoInc.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tpoad.morfandoInc.entity.bienes;
import com.tpoad.morfandoInc.service.bienesService;

import exceptions.RequestException;



@RestController
@RequestMapping("/api/v1/bienes")
public class bienesController {

	@Autowired
	private bienesService bienesservice;

	@GetMapping
	public List<bienes> listar(){
		return bienesservice.listar();
	}
	
	@PostMapping
	public bienes insertar(@RequestBody bienes bienes) {
		if(bienes.getSerie().equals("")) {
			throw new RequestException("P-401","se necesita el nro de serie");
		}
		return bienesservice.insertar(bienes);
	}
	
	@PutMapping
	public bienes actualizar(@RequestBody bienes bienes) {
		return bienesservice.actualizar(bienes);
	}
	
	@DeleteMapping
	public void eliminar(@RequestBody bienes bienes) {
		bienesservice.eliminar(bienes);
	}
	
	@GetMapping("/cantidad")
	public Long CantBienesByPallet(@RequestParam String pallet) {
		return bienesservice.countByPallet(pallet);
	}
	
	
	
}
