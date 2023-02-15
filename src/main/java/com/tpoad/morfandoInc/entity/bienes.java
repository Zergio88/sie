package com.tpoad.morfandoInc.entity;


import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="bienes")
public class bienes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String bien;
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
	public String getBien() {
		return bien;
	}
	public void setBien(String bien) {
		this.bien = bien;
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
