package clase;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] lista = new int[5];
		Scanner sc = new Scanner (System.in);
		int pares = 0;
		
		System.out.println("Dame 5 numeros; ");
		for(int i = 0; i<lista.length; i++){
			lista[i] = sc.nextInt();
		}
		for(int i =0;i < lista.length;i++) {
			System.out.println(lista[i]);
		}
		
		for(int i = 0; i < lista.length; i ++) {
			if(lista[i] % 2 == 0) {
				pares++;
			}
		
		System.out.println("En esta listado hay estoy " + pares);
			
		}
		
	}
}
