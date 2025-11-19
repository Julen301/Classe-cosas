package clase;

import java.util.Random;
import java.util.Scanner;

public class e4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Introduce el tamaño del array: ");
        int tamano = sc.nextInt();
        if (tamano <= 0) {
            System.out.println("El tamaño debe ser mayor que 0.");
            sc.close();
            return;
        }
        int[] numeros = new int[tamano];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(10);
        }
        int suma = 0;
        System.out.println("\n=== VALORES DEL ARRAY ===");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
            suma += numeros[i];
        }
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Suma de todos los valores: " + suma);
}
}