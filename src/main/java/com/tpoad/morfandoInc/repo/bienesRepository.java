package com.tpoad.morfandoInc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.tpoad.morfandoInc.entity.bienes;


@Repository
public interface bienesRepository extends JpaRepository<bienes, Long>{

	  @Query("SELECT d FROM bienes d WHERE d.serie = :serie")
	    bienes findBySerie(@Param("serie") String serie);

	  	Long countByPallet(String pallet);
	
}
