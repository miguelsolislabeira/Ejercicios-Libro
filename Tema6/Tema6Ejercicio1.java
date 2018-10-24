public class Tema6Ejercicio1 {
	public static void main(String[] args) {
		
		/*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
		también la suma total (los puntos que suman entre los tres dados).*/
		
		System.out.println("¡Que rulen esos dados!");
		
		int tirada;
		int suma = 0;
		int i = 0;
		for( ;i<3; i++)
		{
			tirada = (int)(Math.random() * 6) +1;
			System.out.println(tirada);
			
			suma+=tirada;
	
		}
		
		System.out.println("La suma de las tiradas es: " + suma);
	}
			
}		


