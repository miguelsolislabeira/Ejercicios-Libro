public class EjercicioExtra4 {
	public static void main(String [] args) {
		
	/*Realice un programa que presente por pantalla una lista de números enteros en orden decreciente. El
		programa pedirá el valor más alto, el valor más bajo y el salto que habrá entre número y número.
		Ejemplo:
		Introduzca el número más alto: 86
		Introduzca el número más bajo: 68
		Introduzca el salto: 4
		86-82-78-74-70*/
		
		System.out.println("Introduzca el número más alto: ");
		int numAlto = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca el número más bajo: ");
		int numBajo = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca el salto: ");
		int salto = Integer.parseInt(System.console().readLine());
		
		System.out.println(numAlto);
		
		while ((numAlto - salto) >= numBajo)
		{
			
			System.out.println(numAlto - salto);
			numAlto = numAlto - salto;
	
		}
	}
}
