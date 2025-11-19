package clase;

import java.util.Scanner;

public class e6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        int[] numeros = new int[10];
	        System.out.println("Introduce 10 números enteros:");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = sc.nextInt();
	        }
	        System.out.print("\n¿Cuántas posiciones deseas desplazar a la derecha? ");
	        int desplazamiento = sc.nextInt();
	        desplazamiento = desplazamiento % numeros.length;
	        int[] resultado = new int[numeros.length];
	        for (int i = 0; i < numeros.length; i++) {
	            int nuevaPosicion = (i + desplazamiento) % numeros.length;
	            resultado[nuevaPosicion] = numeros[i];
	        }
	        System.out.println("\n=== ARRAY ORIGINAL ===");
	        mostrarArray(numeros);
	        System.out.println("\n=== ARRAY DESPUÉS DE DESPLAZAR " + desplazamiento + " POSICIONES ===");
	        mostrarArray(resultado);
	        sc.close();
	    }
	    public static void mostrarArray(int[] arr) {
	        System.out.print("[");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i]);
	            if (i < arr.length - 1) System.out.print(", ");
	        }
	        System.out.println("]");
	    }
	  }


