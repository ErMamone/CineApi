package com.meroz.CineApi.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meroz.CineApi.Model.Peliculas;

public interface PeliculasDao extends JpaRepository<Peliculas, Long> {
	
}
