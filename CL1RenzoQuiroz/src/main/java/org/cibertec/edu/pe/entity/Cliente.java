package org.cibertec.edu.pe.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="cliente")
public class Cliente {
	@Id
	private int id;
	private String nombre;
	private String apellido;
	private String corre;
	private String fecha;
	private String dni;
	private int categoria;
	
	public Cliente() {
	}

	public Cliente(int id, String nombre, String apellido, String corre, String fecha, String dni, int categoria) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.corre = corre;
		this.fecha = fecha;
		this.dni = dni;
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	
	
	

}
