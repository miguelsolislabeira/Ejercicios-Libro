public class EjercicioExtra3 {
	public static void main(String [] args) {
		
		/*Realice un programa que presente por pantalla una lista de números enteros en orden creciente. Los números
		no serán consecutivos, sino que irán saltando según se le indique al programa. El programa pedirá la cantidad
		de números que se van a mostrar, a partir de qué número se inicia la lista y el “salto” entre los números.
		Ejemplo:
		Introduzca la cantidad de números: 7
		Introduzca el primer número: 18
		Introduzca el salto: 3
		18-21-24-27-30-33-36 */
		
		System.out.println("Introduzca la cantidad de números");
		int vueltas = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca el primer número");
		int primerNumero = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca el salto");
		int salto = Integer.parseInt(System.console().readLine());
		
		System.out.println();
		
		while (vueltas != 0)
		{
			System.out.print(primerNumero + " ");
			vueltas--;
			primerNumero = primerNumero + salto;		
			
		}	
	}
}
