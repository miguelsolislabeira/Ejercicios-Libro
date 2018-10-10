public class Tema5Ejercicio14 {
	public static void main(String [] args) {
		
		int base;
		int exponente;
		int solucion = 1;
		
		System.out.println("Introduzca la base");
		base = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca el exponente");
		exponente = Integer.parseInt(System.console().readLine());
		
		for (int i=1; i<=exponente; i++) {
			
		
		solucion = solucion * base;
		}
		
		System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + solucion);
		
	}
} 
