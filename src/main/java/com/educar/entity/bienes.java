package com.educar.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="bienes")
public class bienes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String modelo;
	private String serie;
	private String estado;
	private String pallet;
	private int piso;
	private String responsables;
	@Column(name = "fechayhora", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechayhora;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPallet() {
		return pallet;
	}
	public void setPallet(String pallet) {
		this.pallet = pallet;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public String getResponsables() {
		return responsables;
	}
	public void setResponsables(String responsables) {
		this.responsables = responsables;
	}
	public Date getFechayhora() {
		return fechayhora;
	}
	public void setFechayhora(Date fechayhora) {
		this.fechayhora = fechayhora;
	}
	
}
