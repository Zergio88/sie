package com.educar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.educar.entity.bienes;

@Repository
public interface bienesRepository extends JpaRepository<bienes, Long>{

	  	@Query("SELECT d FROM bienes d WHERE d.serie = :serie")
	    bienes findBySerie(@Param("serie") String serie);

	  	Long countByPallet(String pallet);
	  	
	  	@Query("SELECT MAX(d.piso) FROM bienes d WHERE d.pallet = :pallet")
	  	Long CantMaxPiso(@Param("pallet")String pallet);

	  	@Query("SELECT COUNT(d) from bienes d WHERE d.pallet = :pallet AND d.piso = :piso")
		Long CantPiso(@Param("pallet") String pallet,@Param("piso") int piso);

		@Query("SELECT d from bienes d WHERE d.pallet = :pallet")
		List<bienes> registroPorPallet(@Param("pallet") String pallet);

		@Query("SELECT DISTINCT pallet FROM bienes")
		List<String> listadoDePallet();

		@Query("SELECT d FROM bienes d WHERE d.pallet = :pallet ORDER BY d.fechayhora DESC LIMIT 20")
		List<bienes> ultimosRegistros(@Param("pallet") String serie);

		@Query("SELECT d FROM bienes d WHERE LOWER(d.modelo) LIKE %:patron% OR LOWER(d.serie) LIKE %:patron% OR LOWER(d.estado) LIKE %:patron%")
		List<bienes> findByPatrones(@Param("patron") String patron);

}