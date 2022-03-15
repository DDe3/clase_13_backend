package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.to.EstudianteTo;

public interface IEstudianteRepository {
	
	List<Estudiante> getAllEstudiantes();
	void insertarEstudiante(Estudiante estudiante);
}
