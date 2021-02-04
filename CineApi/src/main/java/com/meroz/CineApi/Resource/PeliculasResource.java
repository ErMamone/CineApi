package com.meroz.CineApi.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.meroz.CineApi.Model.Peliculas;
import com.meroz.CineApi.Service.PeliculasService;

@RestController
@RequestMapping("/ApiPelis")
public class PeliculasResource {
	
	@Autowired
	private PeliculasService peliculasService;
	
	
	@GetMapping("/peliculas")
	public List<Peliculas> getAllPeliculas(){
		return peliculasService.getAll();
	}
	
	
	@GetMapping("/ver/{id}")
	public Peliculas getById(@PathVariable Long id) {
		Peliculas pel = peliculasService.searchById(id);
		return pel;
	}
	
	@PostMapping("/crear")
	public Peliculas crear(@RequestBody Peliculas peliculas) {
		return peliculasService.create(peliculas);
	}
	
	@PutMapping("/editar/{id}")
	public Peliculas crear(@RequestBody Peliculas peliculas, @PathVariable Long id) {
		return peliculasService.modifyById(peliculas, id);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Long id) {
		peliculasService.deleteById(id);
	}

}
