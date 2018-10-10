public class Tema5Ejercicio7 {
	public static void main(String[] args) {
		
			
		int intentos = 4;
		int numeroIntroducido;
		boolean acertado = false;

		do {
			System.out.println("Introduzca la combinación");
			numeroIntroducido = Integer.parseInt(System.console().readLine());
			
				if (numeroIntroducido == 1234) {
					acertado = true;
					
				} else {
					System.out.println("Clave incorrecta.");
					
				}
					intentos --;
					
		} while ((intentos > 0) && (!acertado));
		
		if (acertado) {
		System.out.println("Ha abierto la caja fuerte.");
		
		} else {
			System.out.println("Lo siento, ha agotado las 4 oportunidades.");
		}
	}
}
	

