package clase;

import java.util.Scanner;

public class Activitat_5_Tresen_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Como lo he planteado 
		 * me pide crear un juego 3 en ralla 
		 * lo importatnte es necesitares un 
		 * tablero 3x3
		 * 2 jugadores x y o 
		 * se alteran turnos 
		 * gana quien aliente 3 x o O en filas columnas o en / 
		 * empate si el tablero esta lleno 
		 * 
		 * tema de  inputs fila y comuna numeros  del 0 1 2
		 * 
		 * salida 
		 * mostrar el tablero actualizado 
		 * mensaje deganor o si se empata pues el mensaje de  empate
		 * 
		 * identificar los datos
		 * 
		 * tablero = char[][]
		 * jugador actual = char
		 * estdo del juego = bolean
		 * fila elegida = int 
		 * columna elegida = in 
		 * mavimento valido = boolean
		 * 
		 * mini raconamientos
		 * Por que char[][] y no String[][]
		 * Porque cada casilla tiene UN SOLO caracter: 'X', 'O' o '-'
		 * char es mas simple y eficiente
		 * 
		 * Por que boolean para juegoTerminado
		 * Solo hay 2 estados posibles: termino o no terminoç
		 * boolean es perfecto para esto
		 * 
		 * ahor hay que devir en funcions 
		 * asicamente una funcions es como una tasca que hace 
		 * 1. Necesito CREAR el tablero vacío
		 * 2. Necesito MOSTRAR el tablero
		 * 3. Necesito PEDIR un movimiento
		 * 4. Necesito VALIDAR que el movimiento sea correcto
	     * 5. Necesito VERIFICAR si alguien ganó
	 	 * 6. Necesito VERIFICAR si hay empate
	 	 * 7. Necesito CAMBIAR de turno
	 	 * 
	 	 * sobretodo las funcions de tipo void i tipo boolena 
	 	 * void solo hace algo como mostrar iniializar 
	 	 * en cambio boolean responde a una pregunta tollo esvalido gano esta lleno etc
	 	 * 
	 	 * como lo distribuje
	 	 * 
	 	 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		char[][] tablero = new char[3][3];
		
		iniciatablero(tablero); // esto lo que hace es que llama a la funcion de iniciatablero 
		
		char jugadroActual = 'x';
		boolean juegoTerminado = false; // vasicamente mietras sea false el juego va a contuniar
		
		System.out.println("tres en ralla");
		System.out.println("jugadro1 x");
		System.out.println("jugadro 2 o");
		
		while (!juegoTerminado) { //vascamente mienstas el juego no este terminado esto se repetira hasta que uno de los dos gano o empate
			mostrartablero(tablero);
			
			System.out.println("Turno de el jugadro " + jugadroActual);
			
			boolean movimentoValido = false; // esto hara que si el jugadro a eligido la casilla correcta
			
			while (!movimentoValido) { // este bucle lo que hace es que se repite el movimentos hasta que sea valido es decir si la casilla esta ocupada te volvera a pregruintar
				System.out.println("ingesa la fila (0-2); ");
				int fila = scanner.nextInt();
				
				System.out.println("ingresa la columna (0-2); ");
				int columna = scanner.nextInt();
				
				if(esMovimientoValido(tablero, fila, columna)) {
					tablero[fila][columna] = jugadroActual;
					movimentoValido = true;
				}else {
					System.out.println("mavimiento no valido dale otro intento bot");
				}
			}
			//esot va a verificas si el jugador actual gano
			if(verificarGanador(tablero, jugadroActual)) {
				mostrartablero(tablero);
				System.out.println("has gandor" + jugadroActual);
				juegoTerminado = true;  // esto hara que al ganar el while principal se detenga 
			}else if (tableroLleno(tablero))  { // si no ay un ganador se dara el empate 
				mostrartablero(tablero);
				System.out.println("Es un empate");
				juegoTerminado = true;
			}else {
				if(jugadroActual == 'x') { // si el jugador acual es 'x' cambiamos a 'o'
					jugadroActual = 'o';
				}else {
					jugadroActual = 'x';
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
