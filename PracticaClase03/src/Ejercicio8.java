import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Escribe un programa que lea una lista de diez n?meros y determine cu?ntos son
		//positivos, y cu?ntos son negativos.
		
		Scanner teclado = new Scanner(System.in);
		
		int cont1 = 0;
		int cont2 = 0;
		
		for(int i = 1; i <= 10; i++){
			
			System.out.println(i + ". Ingrese n?mero: ");
			int n = teclado.nextInt();
			
			if(n >= 0 ) {
				cont1++;
				//System.out.println("Estos n?meros son positivos: ");
			}else {
				cont2++;
				//System.out.println("Estos n?meros son negativos: ");
			}
		}
		System.out.println("Hay " + cont1 + " n?meros son positivos.");
		System.out.println("Hay " + cont2 + " n?meros son negativos.");
		
		
	}

}
