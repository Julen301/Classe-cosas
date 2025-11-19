package clase;

import java.util.Scanner;

public class ej {
	public static void main(String[] args) {
		
	     int[] numeros = {5, 10, 15, 20, 25};
	     int suma = 0;
	        for (int i = 0; i < numeros.length; i++) {
	            suma += numeros[i];
	        }
		System.out.println("El resultado " + suma);
		
	}
}
