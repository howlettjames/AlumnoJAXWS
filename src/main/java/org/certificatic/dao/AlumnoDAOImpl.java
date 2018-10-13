package org.certificatic.dao;

import java.util.ArrayList;
import java.util.List;

import org.certificatic.entity.Alumno;

public class AlumnoDAOImpl implements AlumnoDAO 
{
	static List<Alumno> alumnos = new ArrayList<>();
	
	@Override
	public Alumno guardarAlumno(Alumno alumno) 
	{
		alumnos.add(alumno);
		return alumno;
	}

	@Override
	public List<Alumno> obtenerAlumnos() 
	{	
		return alumnos;
	}
}
