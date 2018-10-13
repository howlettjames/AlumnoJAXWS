package org.certificatic.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alumno 
{
	private String nombre;
	private String apellido;
	private String telefono;
	
	public Alumno()
	{
		
	}
	
	public Alumno(String nombre, String apellido, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + "]";
	}
}
