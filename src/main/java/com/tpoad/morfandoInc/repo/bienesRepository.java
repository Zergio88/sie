package com.tpoad.morfandoInc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tpoad.morfandoInc.entity.bienes;


@Repository
public interface bienesRepository extends JpaRepository<bienes, Long>{

}
