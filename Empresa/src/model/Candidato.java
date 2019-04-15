package model;
import java.util.ArrayList;
public class Candidato
{
	/*
	public final static String COLOMBIA = "Colombia";
	public final static String VENEZUELA = "Venezuela";
	public final static String ARGENTINA = "Argentina";
	public final static String BRASIL = "Brazil";
	public final static String MEXICO = "Mexico";
	public final static String CHILE = "Chile";
	*/
	private String id;
	private String nombre;
	private String apellido;
	private String sexo;
	private String pais; 
	//private ArrayList<String> regiones;
	private ArrayList<Caracteristica> caracteristicas;
	
	public Candidato(String id, String nombre, String apellido, String sexo, String pais)
	{
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.pais = pais;
		//regiones = new ArrayList<String>();
		caracteristicas = new ArrayList<Caracteristica>();
		/*
		regiones.add(COLOMBIA);
		regiones.add(VENEZUELA);
		regiones.add(ARGENTINA);
		regiones.add(BRASIL);
		regiones.add(MEXICO);
		regiones.add(CHILE);
		*/
	}
	/*

	*/
	public void agregarPuntajeACaracteristicas(Caracteristica caracteristica)
	{
		caracteristicas.add(caracteristica);
	}
	public String mostrarCaracteristicasConNotas()
	{
		String msg = "";
		for(int i = 0; i < caracteristicas.size(); i++)
		msg += caracteristicas.get(i).getNombre() + caracteristicas.get(i).getNota();
		return msg;
	}
	public void cambiarNota(Caracteristica caract)
	{
		for(int i = 0; i < caracteristicas.size(); i++)
		{
			if(caract.getNombre().equals(caracteristicas.get(i).getNombre()))
			{
				caracteristicas.get(i).setNota(caract.getNota());
			}
		}
	}
	/*
	public String mostrarArrayList()
	{
		String msg = ""; 
		for(int i = 0; i <regiones.size(); i++ )
		{
			msg += regiones.get(i);
		}
		return msg;
	}
	*/
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public ArrayList<Caracteristica> getCaracteristicas() {
		return caracteristicas;
	}
	public void setCaracteristicas(ArrayList<Caracteristica> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
}
