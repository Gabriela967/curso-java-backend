import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Realiza un programa que sume los 100 n?meros siguientes a un n?mero entero y
		//positivo introducido por teclado. Se debe comprobar que el dato introducido es correcto (que
		//es un n?mero positivo)
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese un n?mero: ");
		int n = teclado.nextInt();
		
		int suma = 0;
		int siguienteNum;
		
		if(n >= 0)
		{
            for(int i = 1;  i <= 100; i ++) {
            	
            	siguienteNum = n + i;
            	
				suma = suma + siguienteNum;
			}
            
        	System.out.println("La suma es de:  " + suma);
	    }else {
	    	System.out.println("Debe ingresar un n?mero entero y positivo");
	    }
	
	}

}
