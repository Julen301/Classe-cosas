package clase;

import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] lista = new int[5];
		Scanner sc = new Scanner (System.in);
		int [] lista_mayor = new int[lista.length];
		int maximo = 0;
		int posicion_maximo = 0;
		
		System.out.println("Dame 5 numeros; ");
		for(int i = 0; i<lista.length; i++){
			lista[i] = sc.nextInt();
		}
		for(int i =0;i < lista.length;i++) {
			System.out.println(lista[i]);
		}
		
		for(int i = 0; i < lista_mayor.length;i++){
			for(int j = 0; j < lista.length; j++){
				if(lista[i] > maximo) {
					maximo = lista[j];
					posicion_maximo = j;
				}
			}
			lista_mayor[i] = maximo;
			lista[posicion_maximo] = 0;
			maximo = 0;
		}
		for(int i = 0; i < lista_mayor.length;i++) {
			System.out.println(lista_mayor[i]);
		}
		
	}
}
