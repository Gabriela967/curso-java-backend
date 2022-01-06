import java.util.Arrays;
import java.util.Scanner;

public class Clase05 {

	public static void main(String[] args) {
		
		int[] numeros = asignarValoresArray();
		mostrarElementosArray(numeros);
		
		//===================================================
		//Copiar un vector utilizando el System.arraycopy
		int [] copiaNum = new int[10];
		//ver el contenido del array
		System.arraycopy(numeros, 0, copiaNum, 0, 10);
		mostrarElementosArray(copiaNum);
		
		//Foreach con vectores
		System.out.println("=============FOR EACH====================");
		for (int i : copiaNum) System.out.println(copiaNum[i]);
		
		System.out.println("=============Ordenar Vector====================");
		//Ordenar contenido de un vector
		 int[] vec = {1,5,8,2,9};
		 Arrays.sort(vec);
		 System.out.println("Vector ordenado: ");
		 mostrarElementosArray(vec);
		 
		 System.out.println("=============PROMEDIO====================");
		 //Promedio de un array
		 int total = 0;
		 double prom = 0;
		 
		 for (int i = 0; i < vec.length; i++) {
			 total += vec[i];
		 }
		 prom = total / vec.length ;
		 System.out.println("El promedio es: " + prom);
		
		 mostrarMayorMenor(vec);
		 
		 //crear un vec de 10, pedierle al usuario que cargue 10 valores 
		 //indicar cuantos numeros pares y cuantos numeros impares hay
		 //indicar cuantas veces se repite el número 2
		 
		 int[] vector = asignarValoresArray();
		 int cont1 = 0;
		 int cont2 = 0;
		 int cont3 = 0;
		 
		 for (int i = 0; i < vector.length; i++) {
			if(vector[i] % 2 == 0) {
				cont1++;
			}
			else {
				cont2++;
			}
			
			if(vector[i] == 2) {
				cont3++;
			}
		}
		 
		System.out.println("La cantidad de números pares es : " + cont1);
		System.out.println("La cantidad de números impares es : " + cont2);
		System.out.println("La cantidad de números dos es: " + cont3);
		
		//TEST
		int count = 1;
		while(count <= 15) {
			System.out.println(count % 2 == 1 ? "***" : "+++++");
			++count;
		}
		
		//============
		
		 
	}

	private static void mostrarMayorMenor(int[] vec) {
		System.out.println("=============MAYOR EN ARRAY====================");
		 //Calculo del mayor de un array
		 int mayor = vec[0];
		 for (int i = 0; i < vec.length; i++) {
			 if(vec[i] > mayor) mayor = vec[i];
		 }
			 
		 System.out.println("El mayor es : " + mayor);
			 
		 System.out.println("=============MENOR EN ARRAY====================");
		 //Calculo del menor de un array 
		 int menor = vec[0];
		 for (int i = 0; i < vec.length; i++) {
			 if(vec[i] < menor) menor = vec[i];
		 }
			 
		 System.out.println("El mayor es : " + menor);
	}
	
	public static int[] asignarValoresArray() {
		//Asignar valor con for a un vector de 10 elementos a traves de teclado
		Scanner teclado = new Scanner(System.in);
				
		int[] numeros = new int[10];
			
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese un número : ");
			//numeros[i] = teclado.nextInt();
			numeros[i] = i;
		}
		return numeros;
	}
	
	public static void mostrarElementosArray(int[] lista) {
		for (int j = 0; j < lista.length; j++) {
			 System.out.print(lista[j] + " ");
		}
		System.out.println(" ");
	}

}
