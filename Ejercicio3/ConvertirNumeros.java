package entornos;
 
import java.util.Scanner;

public class ConvertirNumeros {
	public static int roman2dec(String num) {
		int numDecimal = 0;
		char anterior = 0;

		for (int x = 0; x < num.length(); x++) {
			if (num.charAt(x) == 'I')
				numDecimal += 1;

			if (num.charAt(x) == 'V') {
				System.out.println(anterior);
				if (anterior == 'I') {
					numDecimal -= 2;
				}
				numDecimal += 5;
			}

			if (num.charAt(x) == 'X') {
				if (anterior == 'I') {
					numDecimal -= 2;
				}
				numDecimal += 10;
			}

			if (num.charAt(x) == 'L') {
				if (anterior == 'X') {
					numDecimal -= 20;
				}
				numDecimal += 50;
			}

			if (num.charAt(x) == 'C') {
				if (anterior == 'X') {
					numDecimal -= 20;
				}
				numDecimal += 100;
			}

			if (num.charAt(x) == 'D') {
				if (anterior == 'C') {
					numDecimal -= 200;
				}
				numDecimal += 500;
			}

			if (num.charAt(x) == 'M') {
				if (anterior == 'C') {
					numDecimal -= 200;
				}
				numDecimal += 1000;
			}
			anterior = num.charAt(x);
		}
		return numDecimal;

	}

	public static String dec2roman(int num) {
		int i, miles, centenas, decenas, unidades;
		String romano = "";
		miles = num / 1000;
		centenas = num / 100 % 10;
		decenas = num / 10 % 10;
		unidades = num % 10;
		for (i = 1; i <= miles; i++) {
			romano = romano + "M";
		}
		if (centenas == 9) {
			romano = romano + "CM";
		} else if (centenas >= 5) {
			romano = romano + "D";
			for (i = 6; i <= centenas; i++) {
				romano = romano + "C";
			}
		} else if (centenas == 4) {
			romano = romano + "CD";
		} else {
			for (i = 1; i <= centenas; i++) {
				romano = romano + "C";
			}
		}
		if (decenas == 9) {
			romano = romano + "XC";
		} else if (decenas >= 5) {
			romano = romano + "L";
			for (i = 6; i <= decenas; i++) {
				romano = romano + "X";
			}
		} else if (decenas == 4) {
			romano = romano + "XL";
		} else {
			for (i = 1; i <= decenas; i++) {
				romano = romano + "X";
			}
		}
		if (unidades == 9) {
			romano = romano + "IX";
		} else if (unidades >= 5) {
			romano = romano + "V";
			for (i = 6; i <= unidades; i++) {                                                           
				romano = romano + "I";
			}
		} else if (unidades == 4) {
			romano = romano + "IV";
		} else {
			for (i = 1; i <= unidades; i++) {
				romano = romano + "I";
			}
		}
		return romano;
	}

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		while(true) {
			System.out.println("1. Convertir a romano" + "\n" 
					+ "2. Convertir a decimal" + "\n" + "3. Salir");
			int eleccion = src.nextInt();
			while (eleccion < 1 && eleccion > 3) {
				System.out.println("Introduce una opción correcta");
				eleccion = src.nextInt();
			}
			src.nextLine();
			String num;
			if (eleccion == 1) {
				System.out.print("Numero romano: ");
				num = src.nextLine();
				System.out.println("Numero decimal: " + roman2dec(num));
			} else if (eleccion == 2) {
				System.out.print("Numero decimal: ");
				num = src.nextLine();
				System.out.println("Numero romano: " + dec2roman(Integer.parseInt(num)));
			} else {
				System.out.println("Hasta pronto!");
				break;
			}
		}
	}
}
