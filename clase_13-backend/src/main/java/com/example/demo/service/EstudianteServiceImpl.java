package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IEstudianteRepository;
import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.to.EstudianteTo;

@Service
@Transactional
public class EstudianteServiceImpl implements IEstudianteService {

	
	@Autowired
	IEstudianteRepository estudianteRepo;
	
	@Override
	public List<Estudiante> getAllEstudiantes() {
		return estudianteRepo.getAllEstudiantes();
	}


	@Override
	public void insertarEstudiante(EstudianteTo estudiante) {
		Estudiante e = new Estudiante();
		e.setNombre(estudiante.getNombre());
		e.setApellido(estudiante.getApellido());
		e.setEdad(estudiante.getEdad());
		e.setEstadoCivil(estudiante.getEstadoCivil());
		e.setGenero(estudiante.getGenero());
		e.setFechaNacimiento(LocalDateTime.now());
		estudianteRepo.insertarEstudiante(e);
	}

}
