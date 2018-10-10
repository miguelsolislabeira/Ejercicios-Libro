public class Tema5Ejercicio8 {
public static void main(String[] args) {

//Muestra la tabla de multiplicar de un número introducido por teclado


	System.out.println("Introduzca un número: ");
	
	int numero = Integer.parseInt(System.console().readLine());
	
	for ( int x = 0; x <=10; x++) {
		
		System.out.println(numero + " x " + x + " = " + numero * x);
		
	}
	
 }
}
