package entornos;
 
import java.util.Scanner;

public class ConvertidorMonedas {
	public static double dolar2euro(double num) {
		return num * 0.91;
	}
	
	public static double euro2dolar(double num) {
		return num * 1.096;
	}
	
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		while(true) {
			System.out.println("1. Convertir a euros" + "\n" 
					+ "2. Convertir a dólares" + "\n" + "3. Salir");
			int eleccion = src.nextInt();
			while (eleccion < 1 && eleccion > 3) {
				System.out.println("Introduce una opción correcta");
				eleccion = src.nextInt();
			}
			double num;
			if (eleccion == 1) {
				System.out.print("Dólares: ");
				num = src.nextDouble();
				System.out.println("En euros: " + dolar2euro(num));
			} else if (eleccion == 2) {
				System.out.print("Euros: ");
				num = src.nextDouble();
				System.out.println("En dólares: " + euro2dolar(num));
			} else {
				System.out.println("Hasta pronto!");
				break;
			}
		}
	}
}
