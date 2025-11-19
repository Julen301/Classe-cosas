package examen;

import java.util.Scanner;

public class Examen1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Lo que voy hacere es primero hare un sc luego variables o int o double ya que el precio es e algon coma algo
		 * luego usara de primer momento un bulce for por que en el enunciar se pone 3 entonces seran tres vuetas 
		 * se podria hacer con un while pero entonces no acabaria nunca a nose que lo cieres con el for si le digo 3 a las tres vultas parara
		 * sobre la marcha ire improbisando pero tengo pensado hacer un segundo for u un while delnto del for para validar el tema de lo que se repuesta y lo que se paga 
		 * i al final pondre los Sysout para dar la informacion en pantalla algo asi are el enunciado
		*/
		
		//hola son y 18;05 no he savido hacer lo de si pone un numero negativo aun no soy tan bueno :)
		
		
		Scanner scanner = new Scanner(System.in);
		
		//Variables para lo que es el resument
		double totalRecaudado = 0;
		double mayorPago = 0;
		int clienteMayorPago = 0;
		
		//vamos a solociat numeros al cliente
		System.out.println("Pon un numero de clientes");
		int numClientes = scanner.nextInt();
		//voy a hacer unbulce for para procesar cada cliente
		for (int i = 1; i<= numClientes; i++) {
			
			// para validadr litros repostados
			System.out.println("Litros repostados");
			double litros = scanner.nextDouble();
			while(litros < 0) {
				System.out.println("Valor no válido. Introduce un número positivo:");
				litros = scanner.nextDouble();
			}
			
			//para validar precio por litro
			System.out.println("Precio por el litro");
			double precio = scanner.nextDouble();
			while(precio <= 0) {
				System.out.println("Valor no válido. Introduce un número positivo:");
				precio = scanner.nextDouble();
			}
			
			//para calcular imposte del cliente
			double importe = litros * precio;
			System.out.println("Importe total es de " + importe);
			
			//para hacer laclaisficacino del consumo se tan sencillo como hacer un <>
			if(importe < 20) {
				System.out.println("Es un cliente que consume poco");
			}else if(importe <= 50) {
				System.out.println("Cliente que consume ni fu ni fa");
			}else {
				System.out.println("Cliente que consume mucho exageratan masa");
			}
			
			//esto es para actulizar los totates y que no se ralle
			totalRecaudado += importe;
			
			//voy hacer una verificacion que el cliente es es que mayor pago tiene
			if(importe > mayorPago) {
				mayorPago = importe;
				clienteMayorPago = i;
			}
		}
		
		//para mostras los resultados en pantalla es decir el resumen del dia
		System.out.println("Resumen del dia");
		System.out.println("Total recauidad" + totalRecaudado);
		System.out.println("cliente con mayor pafo "+clienteMayorPago);
	}

}
