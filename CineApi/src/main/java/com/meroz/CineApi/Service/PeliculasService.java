package com.meroz.CineApi.Service;

import java.util.List;

import com.meroz.CineApi.Model.Peliculas;

public interface PeliculasService {
	
	public List<Peliculas> getAll();
	
	public Peliculas searchById(Long id);
	
	public Peliculas create(Peliculas pel);
	
	public Peliculas modifyById(Peliculas pel, Long id);
	
	public void deleteById(Long id);
}

