package com.tpoad.morfandoInc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tpoad.morfandoInc.entity.Horario;

@Repository
public interface HorarioRepo extends JpaRepository<Horario, Integer> {

}
