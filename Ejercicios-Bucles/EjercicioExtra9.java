public class EjercicioExtra9 {
	public static void main(String[] args) {
		
		/* Realice un programa que capture números enteros por teclado, y que presente su cuadrado por pantalla.
		Debe hacer esto de manera repetitiva, hasta que el usuario introduzca un cero o hasta que el usuario haya
		introducido 4 números*/
			
			
			int numeroTeclado;
			System.out.println("Introduzca un número entero. 0 para salir");
			numeroTeclado = Integer.parseInt(System.console().readLine());
			int contador = 0;
			
		if (numeroTeclado == 0)
		{
			System.out.println("Adiós");	
		
		}else
		{
			System.out.println("El cuadrado de " + numeroTeclado + " es: " + (numeroTeclado*numeroTeclado));
			
			while((numeroTeclado != 0) && (contador<3))
			{
				contador++;
				
				System.out.println("Introduzca un número entero: ");
				numeroTeclado = Integer.parseInt(System.console().readLine());
				
				if(numeroTeclado == 0)
				{
					System.out.println("Adiós");
				
				}else
				{
				
					System.out.println("El cuadrado de " + numeroTeclado + " es: " + (numeroTeclado*numeroTeclado));
				}
			}
		}
	}
}
