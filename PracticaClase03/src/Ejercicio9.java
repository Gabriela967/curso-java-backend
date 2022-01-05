import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribe un programa que diga si un n�mero introducido por teclado es o no primo. Un
		//n�mero primo es aquel que s�lo es divisible entre �l mismo y la unidad.

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un n�mero: ");
		int n = teclado.nextInt();
		boolean esPrimo = true ;
		
		if(n == 0 || n == 1 || n == 4) {
			esPrimo = false;
		}
		
		for(int i = 2 ; i < n / 2 ; i++) {
			if(n % i == 0) {
				esPrimo = false;  
			}
		}
		
		if(esPrimo == true) {
			System.out.println("El n�mero ingresado es primo.");
		}else {
			System.out.println("El n�mero ingresado no es primo.");
		}
		
	}

}
