package com.tpoad.morfandoInc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tpoad.morfandoInc.entity.Direccion;

@Repository
public interface DireccionRepo extends JpaRepository<Direccion, Integer> {

}
