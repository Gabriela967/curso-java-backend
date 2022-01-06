
public class Clase06 {

	public static void main(String[] args) {

		//Ejercicio de recursividad
		int numero = 10;
		System.out.println(sumaRecursiva(numero));
		
		saludar();
		String nombre = "pepe";
		int dni = 12345678;
		saludarNombreMostrarDni(nombre, dni);
		
		int a = 5;
		int b = 2;
		calculaAreaDeUnRectangulo(a, b);
		calculaAreaDeUnTriangulo(a, b);
		
		int[] vector = {2,3,4,67,89,20};
		mostrarVector(vector);
		
		//Funciones
		//Metodo que sume dos enteros y devuelva el resultado
		int nro1 = 2;
		int nro2 = 3;
		int result = sumaDosEnteros(nro1,nro2);
		System.out.println("La suma es de : " + result);
		
		//Funcion que sume el IVA
		System.out.println("==================================");
		double money = 10;
		double moneyIVA = sumarIVA(money);
		System.out.println("Valor más IVA : " + moneyIVA);
		
		//Funcion que me diga si un numero es PAR
		int valor = 2;
		
		boolean resultado = esPAR(valor);
		if(resultado) {
		   System.out.println("El numero " + valor + " es PAR");
		}else {
		   System.out.println("El numero " + valor + " NO es PAR");
		}
		
		//Pruebas TEST
		System.out.println(check("ssffss"));
		
		System.out.println(redo(82,3));
		
		System.out.println(factorial(9));
		
		mystery(1234);
		
		System.out.println(mystery2(5));

	}
	
	private static boolean esPAR(int num) {
		
		return num % 2 == 0;
	}

	private static double sumarIVA(double money) {
		double masIVA = money * 1.21;
		return masIVA;
	}
	
	private static int sumaDosEnteros(int nro1, int nro2) {
		
		int result = nro1 + nro2;
		System.out.println("==================================");
		
		return result;
	}
	private static void mostrarVector(int[] vector) {
		System.out.println("==================================");
		System.out.println("Mostrar vector : ");
		for (int i : vector) System.out.println(i);
		
	}
	
	//=================================
	
	//Toma un número y lo suma recursivamente hasta llegar a uno
	public static int sumaRecursiva(int num) {
		int result;
		if(num == 1) {
			System.out.println("Resultado " + num);
			return 1; //caso de fin de recursividad
		}else {
			System.out.println("Numero " + num);
			result = num + sumaRecursiva(num-1);
			System.out.println("Resultado " + result);
		}
		return result;
	}
	//============================
	
	public static void saludar() {
		System.out.println("Hola mundo");
	}
	
	public static void saludarNombreMostrarDni(String nombre, int dni) {
		System.out.println("Hola "+ nombre + " Dni: " + dni);
	}
	
	//Procedimiento que calcule el area de un rectangulo (Base x Altura)
	public static void calculaAreaDeUnRectangulo(int a, int b) {
		int result = a * b;
		System.out.println("El area del rectangulo es de :  "+ result);
	}
	//Procedimiento que calcule el area de un triangulo (Base x Altura / 2)
	public static void calculaAreaDeUnTriangulo(double a, double b) {
		double result = a * b / 2;
		System.out.println("El area del triangulo es de :  "+ result);
	}
	
	
	//TEST
	public static boolean check (String s) {
		return s.length() >= 2 && (s.charAt(0) == s.charAt(1) || check(s.substring(1)));
	}
	
	public static int redo(int i, int j) {
		if(i==0)
			return 0;
		else
			return redo(i/j, j)+1;
	}
	
	public static int factorial(int i) {
		int resultado;
		if(i == 1)
			return 1;
		else 
			resultado = i * factorial(i-1);
		return resultado;
	}
	
	public static void mystery (int x) {
		System.out.print(x % 10);
		
		if((x / 10) != 0) {
			mystery(x / 10);
		}
		
		System.out.print(x % 10);
	}
	
	public static int mystery2 (int x) {
		
		if(x == 0) {
			return 1;
		}else {
			return 3 * mystery2(x-1);
		}
		

	}

}
