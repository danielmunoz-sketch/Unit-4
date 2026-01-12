package ejercicio_a2;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		boolean mayorEdad1;
		
		System.out.println("Introduzca el Nombre");
		p1.nombre = scanner.nextLine();
		System.out.println("Introduzca los apellidos");
		p1.apellidos = scanner.nextLine();
		System.out.println("Introduzca el DNI");
		p1.DNI = scanner.nextLine();
		System.out.println("Introduzca la edad");
		p1.edad = scanner.nextInt();
		
		if (p1.edad >= 18) {
			mayorEdad1 = true;
		}else {
			mayorEdad1 = false;
		}
		
		boolean mayorEdad2;
		
		System.out.println("Introduzca el Nombre");
		p2.nombre = scanner.nextLine();
		System.out.println("Introduzca los apellidos");
		p2.apellidos = scanner.nextLine();
		System.out.println("Introduzca el DNI");
		p2.DNI = scanner.nextLine();
		System.out.println("Introduzca la edad");
		p2.edad = scanner.nextInt();
		
		if (p2.edad >= 18) {
			mayorEdad2 = true;
		}else {
			mayorEdad2 = false;
		}
		
		System.out.println(p1.nombre + " " + p1.apellidos + " con DNI " + p1.DNI + " y mayor de edad (" + mayorEdad1 + ")");
		System.out.println(p2.nombre + " " + p2.apellidos + " con DNI " + p2.DNI + " y mayor de edad (" + mayorEdad2 + ")");		
	}

}
