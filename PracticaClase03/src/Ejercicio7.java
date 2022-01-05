import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Escribe un programa que muestre los n primeros t�rminos de la serie de Fibonacci. El
		 //primer t�rmino de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando
		 //los dos anteriores, por lo que tendr�amos que los t�rminos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
		 //55, 89, 144... El n�mero n se debe introducir por teclado.

		Scanner teclado = new Scanner(System.in);
		System.out.println("�Cu�ntos t�rminos de la serie de Fibonacci quiere ver?:");
		int n = teclado.nextInt();
		
		int primer_num = 0;
		int segundo_num = 1;
		int resultado = 0;
		
		for(int i = 0; i < n ; i++) {
			
			System.out.print(resultado + " ,");
			primer_num = segundo_num; // asigno el 1 a primer_num
			segundo_num = resultado; // le asigno 0 a segundo_num
			resultado = primer_num + segundo_num; // le asigno la suma de 1 + 0 a resultado que queda en 1
			//todo cuando i vale cero la primer vuelta 
			//cuando i vale uno ya primer_num = 0 y segundo_num = 1 , el resultado es 1
			//cuando i vale dos ya primer_num = 1 y segundo_num = 1 , el resultado es 2
			//cuando i vale tres ya primer_num = 1 y segundo_num = 2 , el resultado es 3
			//etc... hasta n 
		}

	}

}
