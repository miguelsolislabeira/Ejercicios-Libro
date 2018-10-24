public class EjercicioClase {
	public static void main(String[] args) {
		
		
/*Hacer un programa que nos muestre por pantalla la tabla de multiplicar del número que el usuario, previa petición, indique*/

	System.out.println("Introduce un número entero: ");
	int numero;

	numero = Integer.parseInt(System.console().readLine());
	
	for (int i = 0; i <= 10; i++) 
	{
	System.out.println(numero + " x " + i + " = " + (numero * i));
    }
    
 }
}
	
