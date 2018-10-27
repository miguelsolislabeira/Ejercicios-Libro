public class Tema6Ejercicio9{
	public static void main(String[] args) {
		
		/*Realiza un programa que vaya generando números aleatorios pares entre 0
		y 100 y que no termine de generar números hasta que no saque el 24. El
		programa deberá decir al final cuántos números se han generado*/
		
	
		int parada = 24;
		int numeros = (int)(Math.random()*100);
		
		while(numeros !=parada)
		{
			System.out.println(numeros);
		}
		
	}
}
