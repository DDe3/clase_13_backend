package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;
import com.example.demo.to.EstudianteTo;


//http://localhost:8080/ApiEstudiantes/V1/estudiantes
@RestController
@RequestMapping("/ApiEstudiantes/V1/estudiantes")
public class EstudianteRestController {
	
	@Autowired
	IEstudianteService estudianteService;
	
	@CrossOrigin(origins = "http://localhost:8080")  //EL PUERTO DONDE ESTA SUBIDO VUE
	@GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<List<Estudiante>> getAllEstudiantes() {
		return ResponseEntity.ok(estudianteService.getAllEstudiantes());
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> insertarEstudiante(@RequestBody EstudianteTo estudiante) {
		estudianteService.insertarEstudiante(estudiante);
		return ResponseEntity.status(HttpStatus.CREATED).body("Estudiante insertado");
	}

}
