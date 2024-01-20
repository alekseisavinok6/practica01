import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        		// calcular el IMC de una persona
		
		Scanner scanner=new Scanner(System.in);
		
		String nombre;
		int edad;
		double altura;
		double peso;
		double imc;
		
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
		imc=peso/(altura*altura);
		System.out.println("El índice de masa corporal de "+nombre+" es "+imc);
    }
    
}
