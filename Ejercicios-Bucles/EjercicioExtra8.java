public class EjercicioExtra8 {
	public static void main(String[] args) {
		
		/*Realice un programa que capture números enteros por teclado, y que presente su cuadrado por pantalla.
		Debe hacer esto de manera repetitiva, hasta que el usuario introduzca un cero.
		Ejemplo:
		Introduzca un número entero (0 para salir): 7
		El cuadrado de 7 es 49
		Introduzca un número entero (0 para salir): 2
		El cuadrado de 2 es 4
		Introduzca un número entero (0 para salir): 0*/
		
		int numeroTeclado;
		System.out.println("Introduzca un número entero. 0 para salir");
		numeroTeclado = Integer.parseInt(System.console().readLine());
		
		while(numeroTeclado != 0)
		{
			System.out.println("El cuadrado de " + numeroTeclado + " es: " + (numeroTeclado*numeroTeclado));
			System.out.println("Introduzca un número entero: ");
			numeroTeclado = Integer.parseInt(System.console().readLine());
		}
	}
}
