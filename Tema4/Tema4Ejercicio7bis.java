public class Tema4Ejercicio7bis {
public static void main(String[] args) {
	
	

//Realiza un programa que calcule la media de tres notas.

	System.out.println("Introduzca su primera nota");
	double nota1 = Double.parseDouble(System.console().readLine());
	
	System.out.println("Introduzca ahora su segunda nota");
	double nota2 = Double.parseDouble(System.console().readLine());
	
	System.out.println("Introduzca, por último, su tercera nota");
	double nota3 = Double.parseDouble(System.console().readLine());
	
	double notaMedia = ((nota1 + nota2 + nota3)/3);
	
		if ((nota1 < 0) || (nota2 < 0) || (nota3 < 0))
		{
			System.out.println("No introduzca números negativos");
			
		}else
		{
			System.out.println("Su nota media es: " + notaMedia);
		}
	}
}
