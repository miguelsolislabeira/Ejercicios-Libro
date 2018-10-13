public class Tema4Ejercicio5bis {
	public static void main(String[] args) {
		
		//Realiza un programa que resuelva una ecuación de primer grado
		//(del tipo ax + b = 0).

		System.out.println("Este programa resuelve ecuaciones de primer grado");
		System.out.println("Introduzca el primer número: ");
		int a = Integer.parseInt(System.console().readLine());
		
		System.out.println("Introduzca ahora el segundo número: ");
		int b = Integer.parseInt(System.console().readLine());
		
		
		
			if (a == 0)
			{
				System.out.println("La ecuación no tiene solución");
			
			}else
			{
				System.out.println("El resultado de la ecuación es: x = " + -b/a);
			}
			
	
 }
}
