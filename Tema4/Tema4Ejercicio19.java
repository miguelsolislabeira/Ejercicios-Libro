public class Tema4Ejercicio19 {
	public static void main(String[] args) {
		
		/*Realiza un programa que nos diga cuántos dígitos tiene un número
		entero que puede ser positivo o negativo. Se permiten números de
		hasta 5 dígitos.*/
		
		//Nota mental: Aprender a utilizar la función Math.abs()
		
		System.out.println("Por favor, introduzca aquí un número de hasta cinco cifras");
		
		int numero = Integer.parseInt(System.console().readLine());
		
		if ((numero > -10) && (numero < 10))
		{
			System.out.println("El número introducido tiene una cifra");
		
		} else if ((numero >= 10) && (numero < 100))
		{
			System.out.println("El número tiene dos cifras");
			
		} else if ((numero >= 100) && (numero < 1000))
		{
			System.out.println("El número tiene tres cifras");
			
		} else if ((numero >= 1000) && (numero < 10000))
		{
			System.out.println("El número tiene cuatro cifras");
			
		}else if ((numero >= 10000) && (numero < 100000))
		{
			System.out.println("El número tiene cinco cifras");
			
		}else if ((numero < 0) && (numero > -10))
		{
			System.out.println("El número tiene una cifra");
		
	    }else if ((numero <= -10) && (numero > -100))
	    {
			System.out.println("El número tiene dos cifras");
		
		}else if ((numero <= -100) && (numero > -1000))
		{
			System.out.println("El número tiene tres cifras");
			
		}else if ((numero <= -1000) && (numero > -10000))
		{
			System.out.println("El número tiene 4 cifras");
			
		}else if ((numero <= 10000) && (numero > -100000))
		{
			System.out.println("El número tiene cinco cifras");
			
		}else
		{
			System.out.println("El número introducido no es correcto");
		}
 }
}
