
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//¿ Cuántas veces se ejecuta el cuerpo del siguiente bucle ?
		 int i = 0;
				
		 while (true) {
			 System.out.println("========= MOSTRAR ALGO ========");
				i ++;
			if (i < 10)
				continue;
				i ++;
			if (i == 10)
				break;
		}	
		
		 //El bucle se ejecuta permanentemente (no sale).
		
		
		
	}

}
