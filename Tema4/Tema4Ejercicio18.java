public class Tema4Ejercicio18 {
	public static void main(String[] args) {
		
		/*Escribe un programa que diga cuál es la primera cifra de un número
		 * entero introducido por teclado. Se permiten números de hasta 5 cifras.*/
		 
		 System.out.println("Por favor, introduzca un número: ");
		 
		 int num = Integer.parseInt(System.console().readLine());
		 
		if ((num >=10) && (num <100))
		{	 
			
			 System.out.printf("El primer número es: %d", (num/10));
			 
		 }else if ((num >100) && (num < 1000))
		 {
			 System.out.printf("El primer número es: %d", (num/100));
			 
		 }else if ((num >=1000) && (num <10000))
		 {
			 System.out.printf("El primer número es: %d", (num/1000));
			 
		 } else if ((num > 10000) && (num < 100000))
		 {
			 System.out.printf("El primer número es: %d", (num / 10000));
			 
		 } else if ((num > 0 ) && (num <= 9))
		 {
			 System.out.println("El " + num + " es el primer y único número introducido");

		 } else
		 {
			 System.out.println("Número introducido no válido");
		 }
 }
}
