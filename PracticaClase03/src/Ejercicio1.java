
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Muestra los n�meros m�ltiplos de 5 de 0 a 100 utilizando un bucle for. Hacerlo en bucle
		//While y Do While tambien
		
		
		//FOR
		System.out.println("========= FOR ========");
		for(int i = 0 ; i <= 100 ; i++) {
			
			if(i % 5 == 0) {
				
				System.out.println("En el FOR el n�mero " + i + " es m�ltiplo de 5");
			}
			
		}
		
		//WHILE
		System.out.println("========= WHILE ========");
		int nro = 0;
		
		while(nro <= 100) {
			
			if(nro % 5 == 0) {
				
			    System.out.println("En el WHILE el n�mero " + nro + " es m�ltiplo de 5");
			}
			
			nro++;
		}
		
		//DO WHILE
		System.out.println("========= DO WHILE ========");
		int nro1 = 0;
		
		do {
			
			if(nro1 % 5 == 0) {
				
			   System.out.println("En el DO WHILE el n�mero " + nro1 + " es m�ltiplo de 5");	
			}
			nro1++;
		}
		while(nro1 <= 100);

	}

}
