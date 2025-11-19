package clase;

import java.util.Scanner;

public class m1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Dame numros");
		
		int [][] matriz = new int [3][3];
		int suma = 0;
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				matriz[i][j] = scan.nextInt();
				suma += matriz[i][j];
			}
		}
				
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("El resultado de la suma de las matrices es " + suma);
		
	}

}

