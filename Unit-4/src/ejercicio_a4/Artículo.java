package ejercicio_a4;

public class Artículo {
	String nombre;
	double precio;
	double iva = 0.21;
	int cuantosQuedan;

	Artículo(String nombre, double precio, int cuantosQuedan){
		this.nombre = nombre;
		this.precio = precio;
		this.cuantosQuedan =  cuantosQuedan;
	}

}