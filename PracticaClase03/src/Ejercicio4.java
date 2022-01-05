import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Muestra la tabla de multiplicar de un número introducido por teclado.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa el número del que desea generar la tabla de multiplicar :");
		int numero = teclado.nextInt();		
		int resultado = 0;
		
		System.out.println("La tabla de multiplicar del número " + numero + " es ...");
		
		for(int i = 1 ; i <= 10 ; i++) {
			resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}
		
		
	}

}
