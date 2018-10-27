public class EjercicioExtra2 {
	public static void main(String[] args) {
		
		/*Realice un programa que presente por pantalla una lista de números enteros consecutivos en orden creciente.
		El programa pedirá la cantidad de números que se van a mostrar y a partir de qué número.
		Ejemplo:
		Introduzca la cantidad de números: 7
		Introduzca el primer número: 19
		19-20-21-22-23-24-25*/
		
		System.out.println("Introduzca la cantidad de números");
		int vueltas = Integer.parseInt(System.console().readLine());
		System.out.println("Introduzca el primer número");
		int primerNumero = Integer.parseInt(System.console().readLine());
		
		while (vueltas != 0)
		{
			System.out.println(primerNumero);
			vueltas--; 
			primerNumero = primerNumero+1;
		}
	}
}
