package com.idat.tarea.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.tarea.dto.EstudianteDTORequest;
import com.idat.tarea.dto.EstudianteDTOResponse;
import com.idat.tarea.model.Estudiante;
import com.idat.tarea.repository.EstudianteRepository;

@Service
public class EstudianteServiceImpl implements EstudianteService {
	
	@Autowired
	private EstudianteRepository repository;

	@Override
	public void guardarEstudiante(EstudianteDTORequest estudiante) {
		
		Estudiante p = new Estudiante();
		p.setIdEstudiante(estudiante.getIdEstudiante());
		p.setNombre(estudiante.getNombre());
		p.setCelular(estudiante.getCelular());
		repository.save(p);
	}

	@Override
	public void actualizarEstudiante(EstudianteDTORequest estudiante) {
		// TODO Auto-generated method stub
		
		Estudiante p = new Estudiante();
		p.setIdEstudiante(estudiante.getIdEstudiante());
		p.setNombre(estudiante.getNombre());
		p.setCelular(estudiante.getCelular());

		repository.saveAndFlush(p);
	}

	@Override
	public void eliminarEstudiante(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<EstudianteDTOResponse> listarEstudiantes() {
		
		List<EstudianteDTOResponse> listar = new ArrayList<>();
		
		EstudianteDTOResponse dto = null;
		
		List<Estudiante> p = repository.findAll();
		
		for (Estudiante estudiante : p) {
			
			dto = new EstudianteDTOResponse();
			
			dto.setIdEstudiante(estudiante.getIdEstudiante());
			dto.setNombre(estudiante.getNombre());
			dto.setCelular(estudiante.getCelular());
			
			listar.add(dto);
		}
		
		return listar;
	}
			
		
	@Override
	public EstudianteDTOResponse obtenerEstudianteId(Integer id) {
		// TODO Auto-generated method stub
		
		Estudiante estudiante = repository.findById(id).orElse(null);
		EstudianteDTOResponse dto = new EstudianteDTOResponse();
		
		dto.setIdEstudiante(estudiante.getIdEstudiante());
		dto.setNombre(estudiante.getNombre());
		dto.setCelular(estudiante.getCelular());
		
		return dto;
	}

}
