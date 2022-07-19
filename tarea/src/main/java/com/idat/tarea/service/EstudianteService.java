package com.idat.tarea.service;

import java.util.List;

import com.idat.tarea.dto.EstudianteDTORequest;
import com.idat.tarea.dto.EstudianteDTOResponse;

public interface EstudianteService {
	
	
	void guardarEstudiante(EstudianteDTORequest estudiante);
	void actualizarEstudiante(EstudianteDTORequest estudiante);
	void eliminarEstudiante(Integer id);
	List<EstudianteDTOResponse> listarEstudiantes();
	EstudianteDTOResponse obtenerEstudianteId(Integer id);

}
