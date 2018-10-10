public class Tema5Ejercicio9 {
	public static void main(String[] args) {
		
		//Realiza un programa que diga cuántos dígitos tiene un número introducido por teclado
		
		int numeroIntroducido;
		int digitos = 1;
		int n;
		System.out.println("Introduzca un número");
		numeroIntroducido = Integer.parseInt(System.console().readLine());
		
		n = numeroIntroducido;
		
		while (n > 10) {
			n/=10;
			digitos++;
		}
		
			System.out.println("El número introducido tiene " + digitos + " dígitos");
			
	}
}
	
