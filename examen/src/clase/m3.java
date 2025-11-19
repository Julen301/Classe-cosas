package clase;

import java.util.Scanner;

public class m3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Dame números");

		int[][] matriz = new int[4][4];

		for (int i = 0; i < matriz.length; i++) {
		    for (int j = 0; j < matriz.length; j++) {
		        matriz[i][j] = scan.nextInt();
		    }
		}
		
		System.out.println("Suma de cada fila:");
		for (int i = 0; i < matriz.length; i++) {
		    int sumaFila = 0;
		   // int sumaCol = 0;
		    for (int j = 0; j < matriz[i].length; j++) {
		        sumaFila += matriz[i][j];
		     //   sumaCol += matriz[j][j];
		    }
		    System.out.println("Fila" + i + ":" + sumaFila);
		}

		System.out.println("Suma de cada columna:");
		for (int j = 0; j < matriz[0].length; j++) { 
		    int sumaColumna = 0;
		    for (int i = 0; i < matriz.length; i++) { 
		        sumaColumna += matriz[i][j]; 
		    }
		    System.out.println("Columna" + j + ":" + sumaColumna);
		}
	}
}
