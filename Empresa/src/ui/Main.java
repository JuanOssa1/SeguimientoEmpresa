package ui;
import model.Empresa;
import model.Candidato;
import model.Caracteristica;
import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	private Scanner dataRead;
	private Empresa empresafeliz;
	
	public Main()
	{
		init();	
	}
	
	
	public static void main(String args[])
	{
		Main m = new Main();
		m.menu(0);
	}
	public void init()
	{
	
		//Candidato candidatoPrueba = new Candidato("", "" , "" , "" , "" );
		dataRead = new Scanner(System.in);
		
	}
	public void menu(int myOption)
	{
		
				int option = myOption;
			     
					if(option == 0)
					{
						showMenuOptions();
						option = dataRead.nextInt();
						dataRead.nextLine();
						empresafeliz.agregarMasPaises("camion");
					}
					
				if (option == 1)
				{
						
				}
				else if (option == 2)
				{
					
					System.out.println(empresafeliz.mostrarArrayList());
					//empresafeliz.mostrarArrayList();
					System.out.println("REGISTAR CANDIDATO CON SUS RESPECTIVAS NOTAS");
					String id = "";
					System.out.println("ingrese el id del candidato");
					id = dataRead.nextLine();
					String nombre = "";
					System.out.println("ingrese el nombre del candidato");
					nombre = dataRead.nextLine();
					String apellido = "";
					System.out.println("ingrese el apellido del candidato");
					apellido = dataRead.nextLine();
					String sexo = "";
					System.out.println("ingrese el sexo del candidato");
					sexo = dataRead.nextLine();
					System.out.println("Ingrese pais en el que se presento " + "1." + empresafeliz.ARGENTINA +"2." +  empresafeliz.BRASIL +"3." +  empresafeliz.CHILE + "4." + empresafeliz.COLOMBIA + "5." + empresafeliz.MEXICO + "6." + empresafeliz.VENEZUELA);
					int opcion = dataRead.nextInt(); dataRead.nextLine();
					String paisDeInscripcion = "";
					if(opcion == 1)
					{
						paisDeInscripcion = empresafeliz.ARGENTINA;
					}
					else if(opcion == 2)
					{
						paisDeInscripcion = empresafeliz.BRASIL;
					}
					else if(opcion == 3)
					{
						paisDeInscripcion = empresafeliz.CHILE;
					}
					else if(opcion == 4)
					{
						paisDeInscripcion = empresafeliz.MEXICO;
					}
					else if(opcion == 5)
					{
						paisDeInscripcion = empresafeliz.COLOMBIA;
					}
					else if(opcion == 6)
					{
						paisDeInscripcion = empresafeliz.VENEZUELA;
					}
					double notaHabilidades = 0;
					String nombreHa = "";
					System.out.println("Ingrese la calificacion de " + Caracteristica.NOTAHABILIDADESDECOMUNICACION);
					notaHabilidades = dataRead.nextDouble(); dataRead.nextLine();
					nombreHa = Caracteristica.NOTAHABILIDADESDECOMUNICACION;
					double notaHistorial = 0;
					String nombreHi = "";
					System.out.println("Ingrese la calificacion de " + Caracteristica.NOTAHISTORIALLABORAL);
					notaHistorial = dataRead.nextDouble(); dataRead.nextLine();
					nombreHi = Caracteristica.NOTAHISTORIALLABORAL;
					double notaTecnicas = 0;
					String nombreTe = "";
					System.out.println("Ingrese la calificacion de " + Caracteristica.NOTACOMPETENCIASTECNICAS);
					notaTecnicas = dataRead.nextDouble(); dataRead.nextLine();
					nombreTe = Caracteristica.NOTACOMPETENCIASTECNICAS;
					double notaActitud = 0;
					String nombreAc = "";
					System.out.println("Ingrese la calificacion de " + Caracteristica.NOTAACTITUD);
					notaActitud = dataRead.nextDouble(); dataRead.nextLine();
					nombreAc = Caracteristica.NOTAACTITUD;
					Candidato candidatoPrueba = new Candidato(id, nombre , apellido , sexo , paisDeInscripcion );
					Caracteristica nuevasCaracteristicas = new Caracteristica(nombreHa, notaHabilidades);
					Caracteristica nuevasCaracteristicas1 = new Caracteristica(nombreHi, notaHistorial);
					Caracteristica nuevasCaracteristicas2= new Caracteristica(nombreTe, notaTecnicas);
					Caracteristica nuevasCaracteristicas3= new Caracteristica(nombreAc, notaActitud);
					empresafeliz.agregarCandidato(candidatoPrueba);
					candidatoPrueba.agregarPuntajeACaracteristicas(nuevasCaracteristicas);
					candidatoPrueba.agregarPuntajeACaracteristicas(nuevasCaracteristicas1);
					candidatoPrueba.agregarPuntajeACaracteristicas(nuevasCaracteristicas2);
					candidatoPrueba.agregarPuntajeACaracteristicas(nuevasCaracteristicas3);	
				}
				else if (option == 3)
				{
					String pais = "";
					System.out.println("REGISTRAR NUEVA ZONA DE INSCRIPCION");
					System.out.println("Ingrese el nombre del pais en el cual se habilitaran nuevas inscripciones");
					pais = dataRead.nextLine();
					empresafeliz.agregarMasPaises(pais);
					
				}
				else if (option == 4)
				{
					/*
					Caracteristica caract = empresafeliz.get
					Candidati candidatoSeleccionado = 
					*/
				}
				else if (option == 5)
				{
		
				}
				else if (option == 6)
				{
				
				}
				else if (option == 7)
				{
					
				}
				else if (option == 8)
				{
					
				}
				else if (option == 9)
				{
					
				}
				else if (option == 10)
				{
				
				
				}
				else if (option == 11)
				{
					
				}
		
			
	}
	public void showMenuOptions()
	{
		
	System.out.println("Escriba el numero de la opcion que desea seleccionar");
				System.out.println("1.  Zona con mas candidatos por encima del umbral");
				System.out.println("2.  Registrar candidato"); 
				System.out.println("3.  Registar nuevas zonas");
				System.out.println("4.  Registrar nuevas caracteristicas");
				System.out.println("5.  Modificar los umbrales de las caracteristicas");
				System.out.println("6.  Reporte de candidatos indicando el nombre, region y calificacion por caracteristica");
				System.out.println("7.  Promedio de los candidatos en una caracteristica de zona especifica"); 
				System.out.println("8.  Ver el porcentaje total de mujeres");
				System.out.println("9.  Ver la moda de los candidatos en una caracteristica evaluando las zonas");
				
	}
	
	
}
