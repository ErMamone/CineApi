package com.meroz.CineApi.ServiceImpl;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meroz.CineApi.Dao.PeliculasDao;
import com.meroz.CineApi.DaoImpl.PeliculasDaoImpl;
import com.meroz.CineApi.Model.Peliculas;
import com.meroz.CineApi.Service.PeliculasService;

@Service
public class PeliculasServiceImpl implements PeliculasService{
	
	@Autowired
	private PeliculasDao peliculasDao;
	
	@Autowired
	private PeliculasDaoImpl peliculasDaoImpl;
	
	//Se obtiene la lista siempre ordenada por Nombre segun lo solicitado en el punto 1
	//Se realiza por Native Query 
	@Override
	public List<Peliculas> getAll() {
		List<Peliculas> lista = peliculasDaoImpl.findAll();
		lista.sort(Comparator.comparing(Peliculas::getNombre));
		return lista;
	}

	//Se obtiene una sola entidad debido a que busca igualdad sobre una primary key
	//Se realiza por Native Query
	@Override
	public Peliculas searchById(Long id) {
		return peliculasDaoImpl.getOne(id);
	}

	//Crea una pelicula con id nuevo utilizando JPA
	@Override
	public Peliculas create(Peliculas pel) {
		return peliculasDao.save(pel);
	}

	//Obtiene la pelicula, settea los datos validando primero que no sean null y se guarda esta entidad nuevamente utilizando JPA
	@Override
	public Peliculas modifyById(Peliculas pel, Long id) {
		Peliculas pelicula = peliculasDao.getOne(id);
		
		if(pel.getDirector() != (null)) {
			pelicula.setDirector(pel.getDirector());
		}
		
		if(pel.getFechaDeEstreno() != (null) ) {
			pelicula.setFechaDeEstreno(pel.getFechaDeEstreno());
		}
		
		if(pel.getNombre() != (null) ) {
			pelicula.setNombre(pel.getNombre());
		}
		
		if(pel.getPaisDeOrigen()!=(null)) {
			pelicula.setPaisDeOrigen(pel.getPaisDeOrigen());
		}
		
		if(pel.getReparto() != (null)) {
			pelicula.setReparto(pel.getReparto());
		}
		
		
		return peliculasDao.save(pelicula);
	}

	//Eliminacion por Id usando metodos de JPA
	@Override
	public void deleteById(Long id) {
		peliculasDao.deleteById(id);
	}
	

}
