package com.tpoad.morfandoInc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tpoad.morfandoInc.entity.Usuario;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Integer> {
	
}
