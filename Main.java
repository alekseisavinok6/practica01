/*
Autor: Aleksei Savinok
Fecha: 18/01/24
Objetivo: Calcular el IMC de una persona
*/

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

		//declaracion de variables
		Scanner scanner=new Scanner(System.in).useLocale(Locale.US);
		//Persona[] personas=new Persona[10];
		ArrayList<Persona> personas=new ArrayList<Persona>();

		String nombre;
		int edad;
		double altura;
		double peso;
		
		//formulario de persona
		
		System.out.println("Formulario de Persona");
		System.out.println("=====================");
		System.out.println();
		System.out.print("Nombre: ");
		nombre=scanner.nextLine();
		System.out.print("Edad: ");
		edad=scanner.nextInt();
		System.out.print("Altura: ");
		altura=scanner.nextDouble();
		System.out.println("Peso: ");
		peso=scanner.nextDouble();
		//fin de formulario de persona

		//crear objeto persona1
		//persona1=new Persona(nombre, edad, altura, peso);

		personas.add(new Persona(nombre, edad, altura, peso));
		
		personas.add(new Persona("Juan1", 25, 1.75, 83));
		personas.add(new Persona("Juan", 25, 1.75, 80));
		personas.add(new Persona("María", 30, 1.65, 61));
		personas.add(new Persona("Pedro", 42, 1.70, 90));
		personas.add(new Persona("Pedro1", 47, 1.90, 80));
		personas.add(new Persona("Pedro2", 33, 1.60, 95));
		personas.add(new Persona("Pedro3", 30, 1.70, 93));
		personas.add(new Persona("Pedro4", 37, 1.50, 66));

		//salida de datos

		/*for(Persona p:personas) {
			System.out.println(p.toSaludo());
		}*/

		for(int i=0; i<personas.size(); i++) {
			System.out.println(personas.get(i).toSaludo());
		}
    }
}



		

