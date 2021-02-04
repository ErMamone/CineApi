package com.meroz.CineApi.Model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "peliculas")
public class Peliculas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1272447233615034133L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pelicula_id")
	private Long id;
	
	@Column(name="pelicula_nombre")
	private String nombre;
	
	@Column(name="pelicula_paisDeOrigen")
	private String paisDeOrigen;
	
	@Column(name="pelicula_fechaDeEstreno")
	private Date fechaDeEstreno;
	
	@Column(name="pelicula_director")
	private String director;
	
	@Column(name="pelicula_reparto")
	private String reparto;
	
	public Peliculas() {
	}
	
	//Getters y Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaisDeOrigen() {
		return paisDeOrigen;
	}

	public void setPaisDeOrigen(String paisDeOrigen) {
		this.paisDeOrigen = paisDeOrigen;
	}

	public Date getFechaDeEstreno() {
		return fechaDeEstreno;
	}

	public void setFechaDeEstreno(Date fechaDeEstreno) {
		this.fechaDeEstreno = fechaDeEstreno;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getReparto() {
		return reparto;
	}

	public void setReparto(String reparto) {
		this.reparto = reparto;
	}
	
}
