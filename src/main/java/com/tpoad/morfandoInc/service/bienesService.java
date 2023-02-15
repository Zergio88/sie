package com.tpoad.morfandoInc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpoad.morfandoInc.entity.bienes;
import com.tpoad.morfandoInc.repo.bienesRepository;

@Service
public class bienesService {
	
	@Autowired
	private bienesRepository bienesrepository;
	
	
	
	public bienes insertar(bienes bienes) {
		return bienesrepository.save(bienes); // devuelve el codigo con el que fue insertado en la bd
	}
	
	public bienes actualizar(bienes bienes) {
		return bienesrepository.save(bienes);
	}
	
	public List<bienes> listar(){
		return bienesrepository.findAll();
	}
	
	public void eliminar(bienes bienes) {
		bienesrepository.delete(bienes);
	}
}
