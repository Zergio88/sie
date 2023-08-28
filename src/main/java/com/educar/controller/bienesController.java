package com.educar.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.educar.entity.bienes;
import com.educar.exception.RequestException;
import com.educar.service.bienesService;

@RestController
@RequestMapping("/api/v1/bienes")
public class bienesController {

	@Autowired
	private bienesService bienesservice;

	@PostMapping
	public bienes insertar(@RequestBody bienes bienes) {
		if(bienes.getSerie().isEmpty()) {
			throw new RequestException("P-401","se necesita el nro de serie");
		}
		return bienesservice.insertar(bienes);
	}
	
	@PutMapping("/update")
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
	
	@GetMapping("/ByNumeroSerie")
	public bienes byNumeroSerie(@RequestParam String serie) {
		return bienesservice.byNumeroSerie(serie);
	}
	
	@GetMapping("/cantidadPorPiso")
	public ResponseEntity<List<Map<String,String>>> cantPisosByPallet(@RequestParam String pallet) {
		return bienesservice.cantPisosByPallet(pallet);
	}
	@GetMapping("/regPorPallet")
	public List<bienes> registroPorPallet(@RequestParam String pallet) {
		return bienesservice.registroPorPallet(pallet);
	}

	@GetMapping("/listaDePallets")
	public List<String> listadoDePallet() {
		return bienesservice.listadoDePallet();
	}
}