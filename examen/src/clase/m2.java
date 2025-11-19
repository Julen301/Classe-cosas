package clase;

import java.util.Random;
import java.util.Scanner;

public class m2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		
		System.out.println("Dame numero de calumnas");
		
		int n = scan.nextInt();
		
		int [][] matriz = new int [5][n];
		int suma = 0;
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(11); 
				System.out.print(matriz[i][j]);
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
