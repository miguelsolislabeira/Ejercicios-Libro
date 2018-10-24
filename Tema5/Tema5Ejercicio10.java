public class Tema5Ejercicio10 {
	public static void main(String[] args) {
		
		//Escribe un programa que calcule la media de unos números introducidos por teclado.
		//El programa no sabe cuántos números se introducirán.
		
		int acumulador = 0;
		double valor;
		int conteo = 0;
		double media;
		
		do {
			System.out.println("Introduce un valor (negativo para terminar)");
			valor = Integer.parseInt(System.console().readLine());
			if (valor > 0) {
				acumulador +=valor;
				conteo++;
				
			}
			
		} while (valor >0);
		
		media = acumulador / conteo;
		System.out.println("La media de los valores introducidos es " + media);
		
}
}
