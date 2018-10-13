package org.certificatic.dao;

import java.util.List;

import org.certificatic.entity.Alumno;

public interface AlumnoDAO 
{
	Alumno guardarAlumno(Alumno alumno);
	List<Alumno> obtenerAlumnos();
}
