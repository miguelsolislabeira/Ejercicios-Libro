public class Tema4Ejercicio14 {
	public static void main(String[] args) {
		
	/*Realiza un programa que diga si un número introducido por teclado
	es par y/o divisible entre 5*/
	
	System.out.println("Introduzca un número sin decimales y te diré si es par o impar y divisible entre 5: ");
	int numero = Integer.parseInt(System.console().readLine());
	
	if ((numero < 9) && (numero % 2 == 0))
	{
		System.out.println("El número introducido es par y no divisible entre 5");
		
	}if ((numero %2 == 0) && (numero % 5 == 0))
	{
		System.out.println("El número introducido es un número par y divisible entre 5");
	
	}else if ((numero %5 !=0) && (numero %2 != 0))
	{
		System.out.println("El número introducido no es par ni divisible entre 5");
		
	} else if ((numero %2 != 0) && (numero % 5 == 0))
	{
		System.out.println("El número introducido no es par, pero sí es divisible entre 5");
	}
	
	
 }
}






