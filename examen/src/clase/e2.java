package clase;

import java.util.Random;

public class e2 {
	  public static void main(String[] args) {
	        Random rand = new Random();
	        int[] numeros = new int[20];
	        System.out.println("Generando 20 números aleatorios...\n");
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = rand.nextInt(100);
	        }
	        int contadorPrimos = 0;
	        for (int num : numeros) {
	            if (esPrimo(num)) {
	                contadorPrimos++;
	            }
	        }
	        int[] primos = new int[contadorPrimos];
	        int indice = 0;
	        for (int num : numeros) {
	            if (esPrimo(num)) {
	                primos[indice] = num;
	                indice++;
	            }
	        }
	        System.out.println("=== ARRAY ORIGINAL ===");
	        mostrarArray(numeros);
	        
	        System.out.println("\n=== ARRAY DE NÚMEROS PRIMOS ===");
	        if (primos.length > 0) {
	            mostrarArray(primos);
	        } else {
	            System.out.println("No se encontraron números primos.");
	        }
	    }
	    public static boolean esPrimo(int n) {
	        if (n < 2) return false;
	        if (n == 2) return true;
	        if (n % 2 == 0) return false;
	        for (int i = 3; i <= Math.sqrt(n); i += 2) {
	            if (n % i == 0) return false;
	        }
	        return true;
	    }
	    public static void mostrarArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i]);
	            if (i < arr.length - 1) System.out.print(", ");
	        }
	        System.out.println();
	    }
}
