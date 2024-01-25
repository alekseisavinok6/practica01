//practica01_v01_5

/*
Autor: Aleksei Savinok
Fecha: 24/01/24
Objetivo: Calcular el IMC de una persona
*/

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

		//En versión 1.5 del programa hemos añadido navegación.

		//declaracion de variables
		Scanner scannerNum=new Scanner(System.in).useLocale(Locale.US);
		Scanner scannerStr=new Scanner(System.in);
		
		
		//Persona[] personas=new Persona[10];
		ArrayList<Persona> personas=new ArrayList<Persona>();
		
		
		int edad;
		String nombre;
		double altura;
		double peso;
		boolean salir=false;
		int opcion;
		do {
			System.out.println("Menú de Opciones");
			System.out.println("=====================");
			System.out.println("1. Ingreasar Persona");
			System.out.println("2. Listar Personas");
			//System.out.println("3. Persona con mayor IMC");
			//System.out.println("4. Persona con menor IMC");
			//System.out.println("6. Ordenar Lísta de Personas");
			System.out.println("9. Agregar Data Ejemplo");
			System.out.println("0. Salir");
			System.out.println();
			System.out.println("Ingrese una opción:");
			opcion=scannerNum.nextInt();
			
			switch(opcion) {
				case 1:
					//formulario de persona
				    System.out.println("Formulario de Persona");
					System.out.println("=====================");
					System.out.println();
					System.out.print("Nombre: ");
					nombre=scannerStr.nextLine();
					System.out.print("Edad: ");
					edad=scannerNum.nextInt();
					System.out.print("Altura: ");
					altura=scannerNum.nextDouble();
					System.out.println("Peso: ");
					peso=scannerNum.nextDouble();
				  	//fin de formulario de persona
					
					//crear objeto persona1
					personas.add(new Persona(nombre, edad, altura, peso));
					break;
				case 2:
					for(int i=0; i<personas.size(); i++) {
						System.out.println(personas.get(i).toSaludo());
					}
					break;
				case 9:
					personas.add(new Persona("Juan1", 25, 1.75, 83));
					personas.add(new Persona("Juan", 25, 1.75, 80));
					personas.add(new Persona("María", 30, 1.65, 61));
					personas.add(new Persona("Pedro", 42, 1.70, 90));
					personas.add(new Persona("Pedro1", 47, 1.90, 80));
					personas.add(new Persona("Pedro2", 33, 1.60, 95));
					personas.add(new Persona("Pedro3", 30, 1.70, 93));
					personas.add(new Persona("Pedro4", 37, 1.50, 66));
					break;
				case 0:
					salir=true;
					break;
				default:
					System.out.println("Opción no válida.");
			}					

		}while (!salir);	
		System.out.println("Fin del programa");			

	}
}		






		

