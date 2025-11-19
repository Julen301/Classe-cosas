package clase;

import java.util.Scanner;

public class s3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("pon frase");
		String frase = sc.nextLine();
		
		char[] caracteres = frase.toCharArray();
		
		int letras =0;
		int espacios=0;
		
		for (int i = 0; i < caracteres.length; i++) {
			char c = caracteres[i];
			 if (Character.isLetter(c)) {
	                letras++;
	            }
			 if( c == ' ') {
				 espacios++;
			 }
			 
		}
		System.out.println("letras " + letras);
		System.out.println(("espacios " + espacios));
 		
		
		
	}

}
