package clase;

import java.util.Random;
import java.util.Scanner;

public class Activitat_5_tresenjava_sinfunciosIApt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner scanner = new Scanner(System.in);
		  Random random = new Random();
		  
	       char[][] tablero = new char[3][3];
	        
	        char jugadorHumano = 'X';
	        char jugadorActual = 'X';
	        char jugadorIA = 'O';
	        
	        boolean juegoTerminado = false;
	               
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                tablero[i][j] = '-';
	            }
	        }
	        System.out.println("=== TRES EN RAYA ===");
	        System.out.println("Jugador 1: x");
	        System.out.println("bot esta jugando ; o");
	        System.out.println();
	        
	        
	        while (!juegoTerminado) {
	        	
	        	//separadores | ---
	            System.out.println("\n  0   1   2");
	            for (int i = 0; i < 3; i++) {
	                System.out.print(i + " ");
	                for (int j = 0; j < 3; j++) {
	                    System.out.print(tablero[i][j]);
	                    if (j < 2) {
	                        System.out.print(" | ");
	                    }
	                }
	                System.out.println();
	                
	                if (i < 2) {
	                    System.out.println("  ---------");
	                }
	            }
	            
	            System.out.println("\nTurno del jugador " + jugadorActual);
	            boolean movimientoValido = false;
	            int fila = 0;
	            int columna = 0;
	            
	            
	            
	        if(jugadorActual == jugadorHumano) {
                	System.out.println("tu turno");
                	
                while (!movimientoValido) {
	                System.out.print("Ingresa la fila (0-2): ");
	                fila = scanner.nextInt();
	                
	                System.out.print("Ingresa la columna (0-2): ");
	                columna = scanner.nextInt();
	                
	                if (fila >= 0 && fila <= 2 && columna >= 0 && columna <= 2) {
	                    
	                    if (tablero[fila][columna] == '-') {
	                        tablero[fila][columna] = jugadorActual;
	                        movimientoValido = true;
	                    } else {
	                        System.out.println("¡Casilla ocupada! Intenta otra.");
	                    }
	                    
	                } else {
	                    System.out.println("¡Fuera de rango! Usa números del 0 al 2.");
	                }
	            }
	            }else {
	            	System.out.println("turno del bot");
	            	boolean movimientoRealizado = false;
	            	
	            	
	            }     
	            boolean gano = false;
	                       
	            for (int i = 0; i < 3; i++) {
	                if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
	                    gano = true;
	                }
	            }
	            for (int j = 0; j < 3; j++) {
	                if (tablero[0][j] == jugadorActual && tablero[1][j] == jugadorActual &&  tablero[2][j] == jugadorActual) {
	                    gano = true;
	                }
	            }
	            if (tablero[0][0] == jugadorActual &&  tablero[1][1] == jugadorActual &&  tablero[2][2] == jugadorActual) {
	                gano = true;
	            }
	            if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
	                gano = true;
	            }
	            if (gano) {
	                System.out.println("\n  0   1   2");
	                for (int i = 0; i < 3; i++) {
	                    System.out.print(i + " ");
	                    for (int j = 0; j < 3; j++) {
	                        System.out.print(tablero[i][j]);
	                        if (j < 2) {
	                            System.out.print(" | ");
	                        }
	                    }
	                    System.out.println();
	                    if (i < 2) {
	                        System.out.println("  ---------");
	                    }
	                }
	                System.out.println("\n¡Felicidades! ¡El jugador " + jugadorActual + " ha ganado!");
	                juegoTerminado = true;
	            } else {
	                boolean lleno = true;
	                for (int i = 0; i < 3; i++) {
	                    for (int j = 0; j < 3; j++) {
	                        if (tablero[i][j] == '-') {
	                            lleno = false;
	                        }
	                    }
	                }
	                if (lleno) {
	                    System.out.println("\n  0   1   2");
	                    for (int i = 0; i < 3; i++) {
	                        System.out.print(i + " ");
	                        for (int j = 0; j < 3; j++) {
	                            System.out.print(tablero[i][j]);
	                            if (j < 2) {
	                                System.out.print(" | ");
	                            }
	                        }
	                        System.out.println();
	                        if (i < 2) {
	                            System.out.println("  ---------");
	                        }
	                    }
	                    System.out.println("\n¡Es un empate! El tablero está lleno.");
	                    juegoTerminado = true;
	                } else {
	                    if (jugadorActual == 'x') {
	                        jugadorActual = 'o';
	                    } else {
	                        jugadorActual = 'x';
	                    }
	                }
	            }
	        } 
	    } 
	}


