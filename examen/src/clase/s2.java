package clase;

import java.util.Scanner;

public class s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("pon frase");
		String frase = sc.nextLine();
		
		char[ ]letras = frase.toCharArray();
		
		int contado = 0;
		for(int i = 0; i < letras.length;i++) {
			char c = Character.toLowerCase(letras[i]);
			
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
				contado++;
			}
			
			
		}
		
		System.out.println("Vocales " + contado);
	}

}
