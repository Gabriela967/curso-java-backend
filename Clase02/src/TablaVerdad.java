
public class TablaVerdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LA TABLA DE VERDAD
				System.out.println("== Tabla de verdad ====");
				/*
				 * A B AND OR
				 * V V  V   V
				 * V F  F   V
				 * F V F    V
				 * F F  F   F
				 * */
				boolean A = true;
				boolean B = false;
				//AND
				
				if((A == true) && (B == true))
				{
				  System.out.println("V");
				}
				if((A == true) && (B == false))
				{
				  System.out.println("F");
				}
				if((A == false) && (B == true))
				{
				  System.out.println("F");
				}
				if((A == false) && (B == false))
				{
				  System.out.println("F");
				}
				
				//OR
				if((A == true) || (B == true))
				{
				  System.out.println("V");
				}
				if((A == true) || (B == false))
				{
				  System.out.println("V");
				}
				if((A == false) || (B == true))
				{
				  System.out.println("V");
				}
				if((A == false) || (B == false))
				{
				  System.out.println("F");
				}

	}

}
