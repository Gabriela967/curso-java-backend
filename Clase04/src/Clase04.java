import java.util.Arrays;

public class Clase04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] losValores = new int[5];
		losValores[0] = 1;
		losValores[1] = 14;
		losValores[2] = 32;
		losValores[3] = 5;
		losValores[3] = 25;

		System.out.println("El valor de la primer posicion es: " + losValores[0]);
	
		for(int i = 0; i < losValores.length; i++) {
			System.out.println(losValores[i]);
		}
		
		int aux;
		System.out.println("Recorremos la lista para atras");
		for(int i = losValores.length-1; i >= 0 ; i--) {
			System.out.println(losValores[i]);
			aux = losValores[i];
		}
		
		System.out.println("====================");
		int suma = 0;
		int n = losValores.length;
		
		for(int i = 0; i < n; i++) {
			suma = suma + losValores[i];
		}
		
		System.out.println(suma);
		
		System.out.println("====================");
		
		int pares[] = {2,4,6,8,10};
		int[] datos = new int[pares.length];
		
		suma = 0;
		n = datos.length;
		
//		for(int i = 0; i < pares.length; i++) {
//			
//			datos[i] = pares[i];
//			System.out.print(datos[i] + " ");
//			
//		}
		
		System.arraycopy(pares, 0 , datos, 0 , pares.length);
		for(int i = 0; i < datos.length; i++) {
		
		System.out.print(datos[i] + " ");
		
	    }
		
		System.out.println("====================");
		
		Arrays.sort(losValores);
		
		for(int i = 0; i < losValores.length; i++) {
			
			System.out.print(losValores[i] + " ");
			
		}
		
		System.out.println("El resultafo de equals es : " + Arrays.equals(datos,pares));
		
		System.out.println("Datos tiene : " + Arrays.toString(datos));
		
		
		System.out.println("==========Maximo - Minimo==========");
		
		int[] vec = {8,1,3,12,5,8,10};
		int maximo = vec[0];
		int minimo = vec[0];
		
		for(int i = 0; i < vec.length; i++) {
			if(vec[i] > maximo) maximo = vec[i];
			if(vec[i] < minimo) minimo = vec[i];
		}
		
		System.out.println("El maximo es : " + maximo);
		System.out.println("El minimo es : " + minimo);
		
		
		
	}

}
