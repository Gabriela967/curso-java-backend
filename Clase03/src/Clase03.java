import java.util.Iterator;
import java.util.Scanner;

public class Clase03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//float a = 30/0;
		//System.out.println(a);
		//ArithmeticException
		
		//int numero = 3;
		//float otroNumero = 4;
		//System.out.println(numero/0);
		//System.out.println(otroNumero/0);
		
		int edad = 18;
		
		String msj;
		
		if(edad >= 18) {
			msj = "Es mayor de edad";
		}else {
			msj = "Es menor de edad";
		}
		
		System.out.println(msj);
		
		//ctrl + alt flecha abajo
		//para duplicar la linea
		
		//Operador ternario
		System.out.println("Operador ternario");
		
		msj = "";
		
		msj = (edad >= 18) ? "Es mayor de edad" : "Es menor de edad";
		
		System.out.println(msj);
		
		boolean esMayorDeEdad = (edad >= 18) ? true : false;
		System.out.println(esMayorDeEdad);
		
		//camelCase
		
		//======================================
		//Estructuras de control repetitivo
		//While (mientras expresionBooleana) la condición se evalua en el inicio del ciclo
		//Do-while (ejecuta y luego evalua)
		//For
		//Sentencia break
		//Sentencia continue
		
		
		//While
		
		int cont = 1;
		System.out.println(cont);
		cont++;
		System.out.println(cont);
		cont++;
		System.out.println(cont);
		cont++;
		System.out.println(cont);
		cont++;
		
		cont = 1;
		System.out.println("==========");
		System.out.println("Estructura de While");
		
//		while (cont <= 2) {
//			System.out.println(cont);
//			cont++;
//		}
		
		//Do - While
		//El bloque de código se ejecuta al menos una vez
		
		Scanner teclado = new Scanner(System.in);
		
		//do {
			//System.out.println("Ingrese su nombre:");
			//String nombre = teclado.next();
			//System.out.println("Su nombre es " + nombre);
			
			//System.out.println("Ingrese su edad:");
	        //edad = teclado.nextInt(); //si o si ingresar un entero
			//System.out.println("Su edad es " + edad);
			//System.out.println("Su nombre es " + nombre + " y su edad es " + edad);
		//}while(edad >=18);
		
		
		//Ingresar número y que los vaya sumando
		// hasta que el total sea cero o negativo
//		int nro1;
//		int nro2;
//		int total;
//		do {
//			System.out.println("Sumamos...");
//			System.out.println("Ingrese un valor:");
//	        nro1 = teclado.nextInt(); 
//	        System.out.println("Ingrese otro valor:");
//	        nro2 = teclado.nextInt(); 
//
//			total = nro1 + nro2;
//			System.out.println("El total de la suma es " + total);
//		}while(total >= 0);
		
		// for
//		System.out.println("Estructura for");
//		for (int i = 1 ; i < 10; i++) {
//			System.out.println("Contador: " + i);
//			
//		}
		
		//Ejercicio, ingresar edad por teclado mayor a 18
		//Mostrar por pantalla
		for (int i = 1 ; i <=2;) {
			System.out.println("Ingrese su edad:");
	        edad = teclado.nextInt(); 
			if(edad < 18)
			{	
				System.out.println("Edad menor a 18");	
				i++;
				int restar = 3 - i;
				System.out.println("Te quedan restar " + restar);	
			}
		}
	}
}
