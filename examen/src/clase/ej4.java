package clase;

import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] lista = new int[5];
		int [] listainvers = new int[5];
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dame 5 numeros; ");
		for(int i = 0; i<lista.length; i++){
			lista[i] = sc.nextInt();
		}
		for(int i =0;i < lista.length;i++) {
			System.out.println(lista[i]);
		}
		
		for(int i = lista.length-1; i >= 0;i--) {
			//System.out.println(lista[i]);
			listainvers[4-i] = lista[i];
		}		
	}
}
