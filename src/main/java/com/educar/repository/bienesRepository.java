package com.educar.repository;

import java.util.Optional;

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
	  	
	  	@Query("SELECT MAX(piso) d FROM bienes d WHERE d.pallet = :pallet")
	  	Long CantMaxPiso(@Param("pallet")String pallet);

	  	@Query("SELECT COUNT(*) d from bienes d WHERE d.pallet = :pallet AND d.piso = :piso")
		Long CantPiso(@Param("pallet") String pallet,@Param("piso") int piso);

}