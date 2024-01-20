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
		Persona persona1;
		String nombre;
		int edad;
		double altura;
		double peso;
		double imc;
		
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
		
		persona1=new Persona(nombre, edad, altura, peso);
		
		//salida de datos
		System.out.println(persona1.toSaludo());

    }
    
}
