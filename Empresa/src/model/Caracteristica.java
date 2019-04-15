package model;
import java.util.ArrayList;
public class Caracteristica
{
	
	public final static String NOTAHABILIDADESDECOMUNICACION = "notaHabilidadesDeComunicacion";
	public final static String NOTAHISTORIALLABORAL = "notaHistorialLaboral";
	public final static String NOTACOMPETENCIASTECNICAS = "notaCompetenciasTecnicas";
	public final static String NOTAACTITUD = "notaActitud";
	private String nombre; 
	private double nota;
	
	
	public Caracteristica(String nombre, double nota)
	{
		this.nombre = nombre;
		this.nota = nota;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getNota() {
		return nota;
	}


	public void setNota(double nota) {
		this.nota = nota;
	}
	
}