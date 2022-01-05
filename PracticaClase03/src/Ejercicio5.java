import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Realiza un programa que nos diga cuántos dígitos tiene un número introducido por
		 //teclado
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		String n = teclado.next();
			

		System.out.println("El número introducido tiene " + n.length() + " dígitos.");


	}

}
