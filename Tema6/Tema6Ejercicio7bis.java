public class Tema6Ejercicio7bis {
	public static void main(String [] args) {
		
		/*Escribe un programa que muestre tres apuestas de la quiniela en tres colum-
		nas para los 14 partidos y el pleno al quince (15 filas).*/
		
		
		
		for(int i = 0; i<14; i++)
		{
			System.out.print("Equipo 1 - Equipo 2");
			
			int apuesta = (int)(Math.random() * 3) +1;
	
	
			switch(apuesta)
			{
				
				case 1:
					
				System.out.print("  1");
				
				break;
				
				case 2:
					
				System.out.print("    2");
				
				break;
				
				default:
						
				System.out.print("   x");
				
			}
	   		
				int apuesta1 = (int)(Math.random() * 3) +1;
	
			switch(apuesta1)
			{
				
				case 1:
					
				System.out.print("  1");
				
				break;
				
				case 2:
					
				System.out.print("    2");
				
				break;
				
				default:
						
				System.out.print("  x");
			
			}	
	
				int apuesta2 = (int)(Math.random() * 3) +1;
		
			switch(apuesta2)
			{
				
				case 1:
					
				System.out.println("  1");
				
				break;
				
				case 2:
					
				System.out.println("    2");
				
				break;
				
				default:
						
				System.out.println("   x");
			
	        }
    			
		}
 }				
}

 


