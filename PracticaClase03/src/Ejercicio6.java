import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribe un programa que calcule la media de un conjunto de números positivos
		//introducidos por teclado. A priori, el programa no sabe cuántos números se introducirán. El
		//usuario indicará que ha terminado de introducir los datos cuando meta un número negativo.
		
		Scanner teclado = new Scanner(System.in);
		int n = 0;
		int suma = 0;
		int cont = 0;
		double division;
		
		while(true) {
			
			System.out.println("Ingrese un número: ");
			n = teclado.nextInt();

			if(n >= 0) {
				cont++;
				suma = suma + n;
			}else {
				division = (double) suma / cont; //hacer un cast para mostrar decimales
				System.out.println("La media del conjunto de números positivos es: " + division);
				break;
			}
	

		}
		
	}

}
