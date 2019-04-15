package model;

import java.util.ArrayList;

public class Empresa 
{
	public final static String COLOMBIA = "Colombia";
	public final static String VENEZUELA = "Venezuela";
	public final static String ARGENTINA = "Argentina";
	public final static String BRASIL = "Brazil";
	public final static String MEXICO = "Mexico";
	public final static String CHILE = "Chile";
	private String nombre;
	private ArrayList<String> regiones;
	private ArrayList<Candidato> candidatos;
	public Empresa(String nombre)
	{
		this.nombre = nombre;
		candidatos = new ArrayList<Candidato>();
		regiones = new ArrayList<String>();
		regiones.add(COLOMBIA);
		regiones.add(VENEZUELA);
		regiones.add(ARGENTINA);
		regiones.add(BRASIL);
		regiones.add(MEXICO);
		regiones.add(CHILE);
	}
	
	public void agregarCandidato(Candidato candidato)
	{
		candidatos.add(candidato);	
	}
	public ArrayList<String> getRegiones() 
	{
		return this.regiones;
	}
	public String agregarMasPaises(String pais)
	{
		regiones.add(pais);
		String msg = ""; 
		/*
		int centinel = -1;
		for(int i = 0; i <regiones.size() && centinel == -1; i++ )
		{
			regiones.set(i, pais);
		}
		*/
		return msg;
	}
	public String mostrarArrayList()
	{
		String msg = ""; 
		for(int i = 0; i <regiones.size(); i++ )
		{
			msg += regiones.get(i);
		}
		return msg;
	}
	
	/*
	public String mostarArrayList()
	{
		
	}
	*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Candidato> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(ArrayList<Candidato> candidatos) {
		this.candidatos = candidatos;
	}

	public void setRegiones(ArrayList<String> regiones) {
		this.regiones = regiones;
	}
	
}