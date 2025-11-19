package clase;

import java.util.Scanner;

public class matriz {

	private static int length;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int [] lista = new int[5];
		int [][] matriz = new int [2][4];
		matriz[0][0] = 1;
		String[][] tablero = new String[5][2];
		matriz[1][3] = 47;
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dame numros porfa");
		
		
		int [] lista = new int[5];
		int [][] matriz = new int [3][3];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = scan.nextInt();
			}
		}
				
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
	
		
		
	}

}
