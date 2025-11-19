package clase;

import java.util.Scanner;

public class e3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int[] numeros = new int[10];
	        System.out.println("Introduce 10 números enteros:");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = sc.nextInt();
	        }
	        System.out.print("\nIntroduce un índice (0-9) para consultar: ");
	        int indice = sc.nextInt();
	        if (indice >= 0 && indice < numeros.length) {
	            System.out.println("\nÍndice: " + indice);
	            System.out.println("Valor: " + numeros[indice]);
	        } else {
	            System.out.println("\n¡ERROR! El índice " + indice + 
	                             " está fuera del rango válido (0-9).");
	        }
	}

}
