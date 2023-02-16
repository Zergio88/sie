package com.tpoad.morfandoInc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpoad.morfandoInc.entity.bienes;
import com.tpoad.morfandoInc.repo.bienesRepository;

import exceptions.RegistroExistenteException;

@Service
public class bienesService {
	
	@Autowired
	private bienesRepository bienesrepository;
	
	public bienes insertar(bienes bienes) {
		if(bienesrepository.findBySerie(bienes.getSerie()) != null) {
			throw new RegistroExistenteException("El numero de serie ya existe");
		}
		return  bienesrepository.save(bienes);
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

	public Long countByPallet(String pallet) {
		return bienesrepository.countByPallet(pallet);
	}
}
