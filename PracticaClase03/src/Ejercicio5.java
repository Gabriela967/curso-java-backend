import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Realiza un programa que nos diga cu�ntos d�gitos tiene un n�mero introducido por
		 //teclado
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un n�mero: ");
		String n = teclado.next();
			

		System.out.println("El n�mero introducido tiene " + n.length() + " d�gitos.");


	}

}
