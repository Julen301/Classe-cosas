package clase;

import java.util.Scanner;

public class ejj1 {
	public static void main(String[] args) {
			    
		   Scanner sc = new Scanner(System.in);
	        int[] numeros = new int[10];
	        int max, min;
	        int posMax = 0, posMin = 0;
	        
	        System.out.println("Introduce 10 números enteros:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = sc.nextInt();
	        }
	        
	        max = numeros[0];
	        min = numeros[0];

	        for (int i = 1; i < 10; i++) {
	            if (numeros[i] > max) {
	                max = numeros[i];
	                posMax = i;
	            }
	            if (numeros[i] < min) {
	                min = numeros[i];
	                posMin = i;
	            }
	        }
	       	      
	        System.out.println("Valor máximo: " + max + " (posición " + posMax + ")");
	        System.out.println("Valor mínimo: " + min + " (posición " + posMin + ")");
	     }

}

