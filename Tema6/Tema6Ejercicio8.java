public class Tema6Ejercicio8 {
	public static void main(String[] args ){
		
/* 
* 6. Números aleatorios
* 8. Modifica el programa anterior para que la probabilidad de que salga un "1" sea de 1/2,
la probabilidad de que salga "x" sea de 1/3 y la probabilidad de que salga "2" sea de 1/6.
Nótese que 1/2 = 3/6 y 1/3 = 2/6.*/

/* 6/6 -- 3/6 -1; 2/6 -x; 1/6 -2;*/


	for(int i = 0; i<14; i++)
		{
			System.out.print("Equipo 1 - Equipo 2");
			
			
			int apuesta = (int)(Math.random() * 6) +1;
	
			switch(apuesta)
			{
				
				case 1:
					
				System.out.print("  1");
				
				break;
				
				case 2:
					
				System.out.print("  1");
				
				break;
				
				case 3:
						
				System.out.print("  1");
				
				break;
				
				case 4:
				
				System.out.print("   x");
				
				break;
				
				case 5:
				
				System.out.print("   x");
				
				break;
				
				default:
				
				System.out.print("    2");

				
			}
	   		
				int apuesta1 = (int)(Math.random() * 6) +1;
	
			switch(apuesta1)
			{
				
				case 1:
					
				System.out.print("  1");
				
				break;
				
				case 2:
					
				System.out.print("  1");
				
				break;
				
				case 3:
						
				System.out.print("  1");
				
				break;
				
				case 4:
				
				System.out.print("   x");
				
				break;
				
				case 5:
				
				System.out.print("   x");
				
				break;
				
				default:
				
				System.out.print("    2");
			
			}	
	
				int apuesta2 = (int)(Math.random() * 6) +1;
		
			switch(apuesta2)
			{
				
				case 1:
					
				System.out.println("  1");
				
				break;
				
				case 2:
					
				System.out.println("  1");
				
				break;
				
				case 3:
						
				System.out.println("  1");
				
				break;
				
				case 4:
				
				System.out.println("   x");
				
				break;
				
				case 5:
				
				System.out.println("   x");
				
				break;
				
				default:
				
				System.out.println("    2");
			
	        }
    			
		}
 }				
}
