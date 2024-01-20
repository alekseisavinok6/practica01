/*
Autor: Aleksei Savinok
Fecha: 17/01/24
Objetivo: Calcular el IMC de una persona
*/

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

		//declaracion de variables
		Scanner scanner=new Scanner(System.in).useLocale(Locale.US);
		Persona[] personas=new Persona[10];

		String nombre;
		int edad;
		double altura;
		double peso;
		
		
		//formulario de persona
		
		/*System.out.println("Formulario de Persona");
		System.out.println("=====================");
		System.out.println();
		System.out.print("Nombre: ");
		nombre=scanner.nextLine();
		System.out.print("Edad: ");
		edad=scanner.nextInt();
		System.out.print("Altura: ");
		altura=scanner.nextDouble();
		System.out.println("Peso: ");
		peso=scanner.nextDouble();*/
		//fin de formulario de persona

		//crear objeto persona1
		//persona1=new Persona(nombre, edad, altura, peso);
		personas[0]=new Persona("Juan1", 25, 1.75, 80);
		personas[1]=new Persona("Juan", 25, 1.75, 80);
		personas[2]=new Persona("María", 30, 1.65, 60);
		personas[3]=new Persona("Pedro", 40, 1.80, 90);
		personas[4]=new Persona("Pedro1", 40, 1.80, 90);
		personas[5]=new Persona("Pedro2", 40, 1.80, 90);
		personas[6]=new Persona("Pedro3", 40, 1.80, 90);
		personas[7]=new Persona("Pedro4", 40, 1.80, 90);
		personas[8]=new Persona("Pedro5", 40, 1.80, 90);
		personas[9]=new Persona("Pedro6", 40, 1.80, 90);

		
		//salida de datos
		for(int i=0; i<personas.length; i++) {
			System.out.println(personas[i].toSaludo());
		}

    }
    
}
