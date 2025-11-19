package clase;

import java.util.Scanner;

public class s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("pon frase");
		String frase = sc.nextLine();
		
		char[] letras = frase.toCharArray();
		
		for(int i =0; i < frase.length(); i++) {
			System.out.println(letras[i]);
		}
		
		
		
	}

}
