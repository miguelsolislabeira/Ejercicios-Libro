public class Tema5Ejercicio11 {
	public static void main(String[] args) {
		
		/* Escribe un programa que muestre en tres columnas el cuadrado
		 * y el cubo de los 5 primeros números enteros a partir de uno introducido por teclado*/
		 
		 System.out.println("Introduzca aquí un número");
		 int numeroIntroducido = Integer.parseInt(System.console().readLine());
		
		for (int n = numeroIntroducido; n < numeroIntroducido + 5; n++) {
		System.out.printf("%d %d %d\n", n, n*n, n*n*n);
		}
		 
		 
 }
}
