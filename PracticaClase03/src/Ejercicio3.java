import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realiza el control de acceso a una caja fuerte. La combinaci�n ser� un
		//n�mero de 4 cifras. El programa nos pedir� la combinaci�n para abrirla. Si no
		//acertamos, se nos mostrar� el mensaje �Lo siento, esa no es la combinaci�n� y si
		//acertamos se nos dir� �La caja fuerte se ha abierto satisfactoriamente�.
		//Tendremos cuatro oportunidades para abrir la caja fuerte.
		
		
		int combinacion = 1234;
		int oportunidades = 1;
		
		Scanner teclado = new Scanner(System.in);
		
		while(oportunidades <= 4) {
			
			System.out.println("Intento n�mero: " + oportunidades);
			System.out.println("Ingresa la combinaci�n de la caja fuerte:");
			int clave = teclado.nextInt();
			oportunidades++;
			
			if(clave != combinacion) {
				System.out.println("Lo siento, esa no es la combinaci�n");
			}else {
				System.out.println("La caja fuerte se ha abierto satisfactoriamente");
				break;
			}
			
			if(oportunidades == 4) {
				System.out.println("Es tu �ltimo intento");
			}
			
		}
		
		
		
	}

}
