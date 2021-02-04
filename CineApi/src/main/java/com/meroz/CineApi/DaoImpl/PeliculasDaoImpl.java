package com.meroz.CineApi.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.meroz.CineApi.Model.Peliculas;

public class PeliculasDaoImpl{

	private static final String BUSCAR_TODOS = "select * from peliculas";
	private static final String BUSCAR_UNA = "select * from peliculas where pelicula_id = ?";
	
	@Autowired
	EntityManager em;
	
	//NativeQuery que devuelve la lista completa de todas las peliculas actuales
	@SuppressWarnings("unchecked")
	public List<Peliculas> findAll() {
		Query query = em.createNativeQuery(BUSCAR_TODOS, Peliculas.class);
		return query.getResultList();
	}

	//NativeQuery que devuelve la pelicula que coincida con el Id que se envia por parametros
	public Peliculas getOne(Long id) {
		Query query = em.createNativeQuery(BUSCAR_UNA, Peliculas.class);
		query.setParameter(1, id);
		
		return (Peliculas) query.getSingleResult();
	}

}
