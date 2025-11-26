package clase;

import java.util.Scanner;
import java.util.Random;

public class Activitat_5_tresnejava_pt2_ia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();  // este random va a aser para numero aleatorios 
		
		char[][] tablero = new char[3][3];
		
		iniciatablero(tablero); //esto lo que hace es que llama a la funcion de iniciatablero
		
		char jugadorHumano = 'X'; 
		char jugadorIa = 'O';
		char jugadorActual = 'X';
		
		boolean juegoTerminado = false; //asicamente mietras sea false el juego va a contuniar
		
		System.out.println("tres en ralla contra la maquina");
		System.out.println("tu eres x");
		System.out.println("la ia es o");
		System.out.println();//salto de linea
		
		while (!juegoTerminado) { //vascamente mienstas el juego no este terminado esto se repetira hasta que uno de los dos gano o empate
		    mostrartablero(tablero); 
		    
		    if(jugadorActual==jugadorHumano) {
		    	System.out.println("tu turno");
		    	boolean movimentoValido = false;// esto hara que si el jugadro a eligido la casilla correcta
		    	
		    	while(!movimentoValido){ // este bucle lo que hace es que se repite el movimentos hasta que sea valido es decir si la casilla esta ocupada te volvera a pregruintar
		    		System.out.println("ingesa la fila (0-2)");
		    		int fila = scanner.nextInt();
		    		
		    		System.out.println("ingresa la columna (0-2); ");
		            int columna = scanner.nextInt();
		            
		            if(esMovimientoValido(tablero, fila, columna)) {
		            	tablero[fila][columna] = jugadorHumano;
		            	movimentoValido = true;
		            }else {
		            	System.out.println("mavimento no valido dale otro intento bot");
		            }
		    	}
		    }else {
		    	System.out.println("turno de la ia");
		    	boolean movimentoRealizado = false; // esto controlara si la ia ya a colocaso en su posicions su ficha 
		    	
		    	while (!movimentoRealizado) { // se va a repetir asta qu encuntre una casilla vacioa
		    		int fila = random.nextInt(3); // vasicamente genera 0,1,2
		    		int columna = random.nextInt(3); 
		    		
		    		if(esMovimientoValido(tablero, fila, columna)) {
		    			tablero[fila][columna] = jugadorIa;
		    			System.out.println("La ia jugo en " + fila + "," + columna); // mensaje de donde puso o
		    			movimentoRealizado = true; //bucle zerrador
		    		}
		    		// si la casilla esta ocupada el bucle se repite automaticamente y genera otra posicion
		    	}
		    }
		    
		   if(verificarGanador(tablero, jugadorActual)) {
			   mostrartablero(tablero);
			   if(jugadorActual == jugadorHumano) {
				   System.out.println("has ganado");
			   }else {
				   System.out.println("la ia gano mejora bot");
			   }
			   juegoTerminado = true; // al ganar hce el el bucle principal se detenga
			   
		   }else if (tableroLleno(tablero)) {
			   mostrartablero(tablero);
			   System.out.println("empate");
			   juegoTerminado = true;
			   
		   }else {
			   if(jugadorActual == jugadorHumano) {
				   jugadorActual = jugadorIa;
			   }else {
				   jugadorActual = jugadorHumano;
			   }
		   }
		 
		}
		
	}
	public static void iniciatablero(char[][] tablero){
		// mientra i y j sean menores que 3 i++ va uamentar 1 cada vex
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				tablero[i][j] = '-';
			}
		}
	}
	
	public static void mostrartablero(char[][] tablero) {
		System.out.println("0 1 2"); //sirve pra imprimer los nuemros de las columnas
		for(int i = 0; i <3 ; i++) {
			System.out.print(i + " "); // esto imprime el nuero de filas en el costado izquierdo 
			
			for (int j = 0; j<3; j++) {
				System.out.print(tablero[i][j]);
				if(j<2) {  // esto lo que hace es que si no es la  ultima columna va imprimer la varra |
					System.out.print(" | ");
				}
			}
			
			System.out.println();
			if(i<2) { // vasicamente su esto no es la ultima fila va a imprimer la linea horizontal --------
				System.out.println(" ---------"); // es un separdor orizoental
			}
		}
	}
	
	public static boolean esMovimientoValido(char[][] tablero, int fila, int columna) {
		//es to lo que hace es que si la fila es menor que 0 o mayor que 2 sera invalido
		if(fila < 0 || fila > 2 || columna <0 || columna > 2) {
			return false; // esto es que el movimento es invaildo
		}
		//esto es lo mismo si la colaman es monor que 0 o mayor que 2 sera invalido
		if(tablero[fila][columna] != '-') {  // vasicamente != '-' (!= / esto significa diferente de) si la casilla es es - es significa que esta ocupada
			return false;
		}
		return true; // si te da el true esto significa que a pasado por todas las pruebas y es moviemtos valido
	}
	
	public static boolean verificarGanador(char[][] tablero, char jugador) {
		
		for(int i = 0;i < 3; i++) { // aquie lo que se haces es qe i representa la fila 0,1,2 / itambien verifica las 3 casillas de la fila "i" son del jugador 
			if(tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
				return true;
			}
		}	
		for(int j = 0;j < 3; j++) { // k repressenta la columna 0,1,2 / es decri ej si j = 2 verifica a comuna derecha
			if(tablero[0][j] == jugador && tablero[1][j] == jugador && tablero[2][j] == jugador) {
				return true; 
			}
		}
		
		//verificas posiciones especificas
		if(tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
			return true;  
		}
			    
		if(tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
			return true; 
		}
		
		return false; // vasicamente si no se gano de ninguna de las maneras se te retornara false
	}
	
	public static boolean tableroLleno(char[][] tablero) {
		
		for(int i = 0; i <3 ; i++){
			for(int j = 0; j<3; j++) {
				if(tablero[i][j] == '-') { // vasicamente si hay una casillas vacia se debuelve false
					return false;
				}
			}
		}
		return true; // esto lo que hace es el que el bucle termina sin encontrar '-' esto significara que estaran las posi llena
	}


}
