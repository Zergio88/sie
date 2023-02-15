package com.tpoad.morfandoInc.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="restaurantes")
public class Restaurant {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_restaurante;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_propietario")
	private Usuario id_usuario;
	private String nombre;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_horario")
	private Horario id_horario;
	
	//@JsonIgnore esta anotacion sirve para no sobrecargar el json
	//@OneToOne(fetch = FetchType.EAGER) para traer todos los datos relacionados a deportes
	@OneToOne
	@JoinColumn(name="id_direccion")
	private Direccion id_direccion;
	private String fotos;
	private String descripcion;
	private String especialidad;
	private int rangos_precios;
	
	public int getId_restaurante() {
		return id_restaurante;
	}
	public void setId_restaurante(int id_restaurante) {
		this.id_restaurante = id_restaurante;
	}
	
	/*public Usuario getId_propietario() {
		System.out.println("id_usuario: "+id_usuario);
		return this.id_usuario;
	}*/
	
	public int getId_propietario() {
		System.out.println("id_usuario: "+id_usuario);
		return this.id_usuario.getId_usuario();
	}
	
	public void setId_propietario(Usuario id_usuario) {
		this.id_usuario = id_usuario;
		System.out.println("id_propietario "+id_usuario.getId_usuario());
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getId_horario() {
		return id_horario.getId_horario();
	}
	
	public void setId_horario(Horario id_horario) {
		this.id_horario = id_horario;
	}
	
	
	public int getId_direccion() {
		System.out.println("id direccion seteado: "+id_direccion.getId_direccion());
		return id_direccion.getId_direccion();
	}
	public void setId_direccion(Direccion id_direccion) {
		// System.out.println("id direccion seteado: "+id_direccion.getId_direccion());
		this.id_direccion = id_direccion;
	}
	
	public String getFotos() {
		return fotos;
	}
	public void setFotos(String fotos) {
		this.fotos = fotos;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public int getRangos_precios() {
		return rangos_precios;
	}
	public void setRangos_precios(int rangos_precios) {
		this.rangos_precios = rangos_precios;
	}
	
	
}
