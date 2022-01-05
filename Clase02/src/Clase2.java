
public class Clase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Operadores aritméticos:
		
		int nro1=10;
		int nro2=2;
		
		//sysou ctrl + barra
		System.out.println("nro1 = "+ nro1 + " nro2 = " + nro2);
		
		//Suma
		
		System.out.println("Suma: ");
		System.out.println(nro1 + nro2);
		
		//Resta
		System.out.println("Resta: ");
		System.out.println(nro1 - nro2);
		 
		//División
		System.out.println("División: ");
		System.out.println(nro1/nro2);
		
		//Multiplicación
		System.out.println("Multiplicación: ");
		System.out.println(nro1 * nro2);
		
		//Modulo o resto de la división
		System.out.println("Modulo o resto de la división: ");
		System.out.println(nro1 % nro2);
		
		//Operadores de asignación
		System.out.println("Operadores de asignación");
		
		// +=
		System.out.println("+=");
		System.out.println(nro1 += 2);
		
		// -=
		System.out.println("-=");
		System.out.println(nro1 -= 2);
		
		// *=
		System.out.println("*=");
		System.out.println(nro1 *= 2);
		
		// /=
		System.out.println("/=");
		System.out.println(nro1 /= 2);
		
		//ctrl + shift + f -> ordenar el código
		
		//Opradores incrementales ++ y decrementales --
		
		System.out.println("++");
		nro1 = 10;
		nro1++;
		System.out.println(nro1);
		
		System.out.println("--");
		//nro1 = 10;
		nro1--;
		System.out.println(nro1);
		
		//Operadores relacionales
		
		nro1 = 10;
		nro2 = 20;
		
		System.out.println(">");
		System.out.println(nro1 > nro2);
		
		System.out.println("<");
		System.out.println(nro1 < nro2);
		
		System.out.println(">=");
		System.out.println(nro1 >= nro2);
		
		System.out.println("<=");
		System.out.println(nro1 <= nro2);
		
		System.out.println("==");
		System.out.println(nro1 == nro2);
		
		System.out.println("==============");
		boolean p1 = true;
		boolean p2 = false;
		
		System.out.println("AND &&");
		System.out.println(p1 && p2);
		
		System.out.println("OR ||");
		System.out.println(p1 || p2);
		
		System.out.println("NOT !");
		System.out.println(!p1);
		
		
		//Estructura IF
		
		int nro3 = 155;
		int nro4 = 155;
		
		System.out.println("Esctructura del IF");
		
		if(nro3 == nro4) {
			System.out.println("Son iguales");
		}
		
		
		if (nro3 > nro4) {
			System.out.println("Es mayor");
		}
		else if (nro3 < nro4) {
			System.out.println("No es mayor");
		}
		else {
			System.out.println("Son iguales");
		}
		
		nro4 = 4;
		
		if(nro3 != nro4) {
			System.out.println("Son distintos");
		}
		
		if(12 < 4) {
			System.out.println("Es menor");
		}else {
			System.out.println("No es menor");
		}
		
		
		//SWITCH
		System.out.println("==============");
		System.out.println("Ejemplo de Switch");
		int dia = 14;
		
		switch(dia) {
			case 1:{
				System.out.println("El día es 1");
				break;
			}
			case 2:{
				System.out.println("El día es 2");
				break;
			}
			case 3:{
				System.out.println("El día es 3");
				break;
			}
			case 14:{
				System.out.println("El día es 14");
				break;
			}
			default:
				System.out.println("No conozco que valor es");
		}
		
		
		
	}

}
