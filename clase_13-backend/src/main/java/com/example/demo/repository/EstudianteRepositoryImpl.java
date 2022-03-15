package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

@Repository
public class EstudianteRepositoryImpl implements IEstudianteRepository {

	@PersistenceContext
	EntityManager em;
	
	
	@Override
	public List<Estudiante> getAllEstudiantes() {
		TypedQuery<Estudiante> mq = em.createQuery("SELECT e FROM Estudiante e",Estudiante.class);
		return mq.getResultList();
	}


	@Override
	public void insertarEstudiante(Estudiante estudiante) {
		em.persist(estudiante);
	}
	
	

}
