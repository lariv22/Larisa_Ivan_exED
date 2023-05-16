package entornos;

import java.util.Scanner;

public class ConvertidorTemperatura {
	public static double fahrenheitToCelsius(double temp) {
		return ((double) 5/9 * (temp - 32));
	}
	
	public static double celsiusToFahrenheit(double temp) {
		return ((double) 9/5 * temp + 32);
	}
	
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		while(true) {
			System.out.println("1. Convertir a celsius" + "\n" 
					+ "2. Convertir a Farenheit" + "\n" + "3. Salir");
			int eleccion = src.nextInt();
			while (eleccion < 1 && eleccion > 3) {
				System.out.println("Introduce una opción correcta");
				eleccion = src.nextInt();
			}
			int temp;
			if (eleccion == 1) {
				System.out.print("Temperatura en F: ");
				temp = src.nextInt();
				System.out.println("Respuesta en C: " + fahrenheitToCelsius(temp));
			} else if (eleccion == 2) {
				System.out.print("Temperatura en C: ");
				temp = src.nextInt();
				System.out.println("Respuesta en F: " + celsiusToFahrenheit(temp));
			} else {
				System.out.println("Hasta pronto!");
				break;
			}
		}
	}
}
