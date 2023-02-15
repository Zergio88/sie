package com.tpoad.morfandoInc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tpoad.morfandoInc.entity.Direccion;
import com.tpoad.morfandoInc.entity.Restaurant;
import com.tpoad.morfandoInc.repo.RestaurantRepo;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantRepo restaurantrepo;
	
	public Restaurant insertar(Restaurant restaurant) {
		return restaurantrepo.save(restaurant);
	}
	
	public Restaurant actualizar(Restaurant restaurant) {
		return restaurantrepo.save(restaurant);
	}

	public List<Restaurant> listar(){
		return restaurantrepo.findAll();
	}
	
	public void eliminar(Restaurant restaurant) {
		restaurantrepo.delete(restaurant);
	}
}
