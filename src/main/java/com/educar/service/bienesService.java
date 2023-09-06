package com.educar.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.educar.entity.bienes;
import com.educar.exception.RegistroExistenteException;
import com.educar.repository.bienesRepository;

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

	public void eliminar(bienes bienes) {
		bienesrepository.delete(bienes);
	}

	public Long countByPallet(String pallet) {
		return bienesrepository.countByPallet(pallet);
	}
	
	public bienes byNumeroSerie(String serie) {
		return bienesrepository.findBySerie(serie);
	}

	public ResponseEntity<List<Map<String, String>>> cantPisosByPallet(String pallet) {
		
		List<Map<String,String>> resultado = new ArrayList<>();
		
		Long pisoMax=bienesrepository.CantMaxPiso(pallet);
		int pisoMaxInteger = pisoMax.intValue();
			
		for(int i=1;i<=pisoMaxInteger;i++) {
			Long cantidadPiso=bienesrepository.CantPiso(pallet,i);
			Map<String,String> fila = new HashMap<>();
			fila.put(Integer.toString(i),cantidadPiso.toString());
			resultado.add(fila);
		}
		
		return ResponseEntity.ok(resultado);
	}

	public List<bienes> registroPorPallet(String pallet){
		return bienesrepository.registroPorPallet(pallet);
	}

	public List<String> listadoDePallet(){
		return bienesrepository.listadoDePallet();
	}

	public List<bienes> ultimosReg(String pallet){
		return bienesrepository.ultimosRegistros(pallet);
	}

	/*
	*     public List<TuEntidad> buscarPorPatrones(String patron1, String patron2) {
        if (patron1 != null && patron2 != null) {
            // Si se proporcionan ambos patrones, buscar en ambas columnas
            return tuRepositorio.findByColumna1AndColumna2(patron1, patron2);
        } else if (patron1 != null) {
            // Si solo se proporciona el primer patrón, buscar solo en la primera columna
            return tuRepositorio.findByColumna1(patron1);
        } else if (patron2 != null) {
            // Si solo se proporciona el segundo patrón, buscar solo en la segunda columna
            return tuRepositorio.findByColumna2(patron2);
        } else {
            // Si no se proporcionan patrones, devolver todos los registros (o manejar como desees)
            return tuRepositorio.findAll();
        }
    }
	*
	*
	* */
	public List<bienes> byPatrones(String patron) {

		return bienesrepository.findByPatrones(patron);
	}
}