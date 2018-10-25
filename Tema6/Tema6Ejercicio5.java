public class Tema6Ejercicio5 {
	public static void main(String[] args) {
		
		/*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
		separados por espacios. Muestra también el máximo, el mínimo y la media
		de esos números*/
		
		int numero = 0;
		int suma = 0;
		int maximo = 100;
		int minimo = 199;
		
		for(int i = 0; i<50; i++)
		{
			numero =(int)(Math.random() *100) + 100;
			
				numero =(int)(Math.random() *100) + 100;
				System.out.print(numero + " ");
			
			suma += numero;
			
			if (numero < minimo)
			{
				minimo = numero;
			}
			
			if (numero > maximo)
			{
				maximo = numero;
			}
					
	
		}		
			System.out.println("\n");
			System.out.println("La media es: " + suma/50);
			System.out.println("El numero máximo es: " + maximo);
			System.out.println("El numero mínimo es: "+ minimo);
	}
}

