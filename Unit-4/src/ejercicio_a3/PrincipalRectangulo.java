package ejercicio_a3;

public class PrincipalRectangulo {

	public static void main(String[] args) {
		 
		Rectangulo R1 = new Rectangulo(0,0,5,5);
		Rectangulo R2 = new Rectangulo(7,9,2,3);
		
		System.out.println(R1.perimetro());
		System.out.println(R2.perimetro());
		
		System.out.println(R1.area());
		System.out.println(R2.area());
	}

}
