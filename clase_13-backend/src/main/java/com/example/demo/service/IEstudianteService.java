package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.to.EstudianteTo;

public interface IEstudianteService {
	
	List<Estudiante> getAllEstudiantes();
	void insertarEstudiante(EstudianteTo estudiante);
	
	
}
