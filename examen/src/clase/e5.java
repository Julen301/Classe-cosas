package clase;

import java.util.Scanner;

public class e5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int[] numeros = new int[15];
	        System.out.println("Introduce 15 números enteros:");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = sc.nextInt();
	        }
	        System.out.print("\nIntroduce el número de referencia: ");
	        int referencia = sc.nextInt();
	        int mayores = 0;
	        int menores = 0;
	        int iguales = 0;
	        for (int num : numeros) {
	            if (num > referencia) {
	                mayores++;
	            } else if (num < referencia) {
	                menores++;
	            } else {
	                iguales++;
	            }
	        }
	        System.out.println("\n=== RESULTADOS ===");
	        System.out.println("Números mayores que " + referencia + ": " + mayores);
	        System.out.println("Números menores que " + referencia + ": " + menores);
	        System.out.println("Números iguales a " + referencia + ": " + iguales);
	}

}
