package ejercicio_c4;

public class MainArticulo {

	public static void main(String[] args) {
		
		
		
		Articulo articulo1 = new Articulo("Pijama", 10.0, 21, 50);
		Articulo articulo2 = new Articulo("Zapatos", -20.0, 210, -5);
		Articulo articulo3 = new Articulo("Camizone", 56.5, 40, 20);
		
		mostrar(articulo1);
		mostrar(articulo2);
		mostrar(articulo3);
		
		articulo1.setNombre("Pijama");
		articulo1.setPrecio(10.0);
		articulo1.setIva(21);
		articulo1.setCuantosQuedan(50);
		
		articulo2.setNombre("Zapatos");
		articulo2.setPrecio(-20.0);
		articulo2.setIva(210);
		articulo2.setCuantosQuedan(-5);
		
		articulo3.setNombre("Camizone");
		articulo3.setPrecio(56.5);
		articulo3.setIva(40);
		articulo3.setCuantosQuedan(20);
		
		}
	
	static void mostrar(Articulo articulo) {
		System.out.println("----------------------------------");
		System.out.println(articulo.getNombre() + " | Precio: " + articulo.getPrecio() + " | IVA: " + articulo.getIva() + " | Stock: " + articulo.getCuantosQuedan());
		System.out.println("----------------------------------");
		}
	
	}