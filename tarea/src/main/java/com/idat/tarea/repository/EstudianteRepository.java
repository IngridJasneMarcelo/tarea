package com.idat.tarea.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.tarea.model.Estudiante;


@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante,Integer>{
	


}
