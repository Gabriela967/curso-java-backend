import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribe un programa que calcule la media de un conjunto de n�meros positivos
		//introducidos por teclado. A priori, el programa no sabe cu�ntos n�meros se introducir�n. El
		//usuario indicar� que ha terminado de introducir los datos cuando meta un n�mero negativo.
		
		Scanner teclado = new Scanner(System.in);
		int n = 0;
		int suma = 0;
		int cont = 0;
		double division;
		
		while(true) {
			
			System.out.println("Ingrese un n�mero: ");
			n = teclado.nextInt();

			if(n >= 0) {
				cont++;
				suma = suma + n;
			}else {
				division = (double) suma / cont; //hacer un cast para mostrar decimales
				System.out.println("La media del conjunto de n�meros positivos es: " + division);
				break;
			}
	

		}
		
	}

}
