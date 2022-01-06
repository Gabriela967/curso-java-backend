import java.util.Iterator;

public class EjerciciosPropuestos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Queremos contar cuantas veces aparece el número 10 en el arreglo:
		int[] vec = {2,10,6,8,10,11,10};
		int cont = 0;
		
		for (int i = 0; i < vec.length; i++) {
			if(vec[i] == 10) {
				cont++;
			}		
		}
		System.out.println("El número 10 aparece: " + cont + " veces.");

		System.out.println("====================");
		//Totalizador y promedio
		
		int total = 0;
		
		for (int i = 0; i < vec.length; i++) {
			total += vec[i];
		}
		System.out.println("La suma total es: " + total);
		System.out.println("El promedio es: " + total / vec.length);
		
		System.out.println("=========TEST===========");
		double[] x = new double[] {1,2,3};
		System.out.println("Value is " + x[1]);
		
		int[] impar = {1,3,5,7,9,11};
		System.out.println(impar[0] + "" + impar[3]);
		
		int[] pares = {2,4,6,8,10};
		pares[0] = 44;
		pares[4] = pares[2];
		System.out.println(pares[0] + "" + pares[4]);
		
		int[] a = new int[0];
		System.out.println(a.length);
		
		int[] y = new int[3];
		System.out.println("y[0] is " + y[0]);
		
		double[] myList = {1,5,5,5,5,1};
		double max = myList[0];
		int indexOfMax = 0;
		
		for (int i = 1; i < myList.length; i++) {
			if(myList[i] > max) {
				max = myList[i];
				indexOfMax = i;
			}
		}
		System.out.println(indexOfMax);
		
		int[] j = {120, 200, 016};
		for (int i = 0; i < j.length; i++) {
			System.out.print(j[i] + " ");
		}
		
		int[] q = {1, 2, 3, 4};
		int[] g = q;
		
		q = new int[2];
		
		for (int i = 0; i < q.length; i++) {
			System.out.print(g[i] + " ");
		}
		
		int[] arrr = new int[5];
		arrr = new int[6];
		
		int[] b = {0, 2, 4, 1, 3};
		for (int i = 0; i < b.length; i++)
			b[i] = b[(b[i] + 3) % b.length];
		
		System.out.println(b[1]);
	}

}
