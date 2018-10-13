public class Tema4Ejercicio4bis {
public static void main(String [] arga) {

/*Escribe un programa que calcule el salario
*
semanal de un trabajador teniendo en cuenta que las horas
*
ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la
*
hora. A partir de la hora 41, se pagan a 16 euros la hora.*/

	System.out.println("Introduzca cuántas horas ha trabajado esta semana");
	int teclado = Integer.parseInt(System.console().readLine());
	
	
	
	if (teclado <= 40)
	{
	System.out.println("Su salario semanal es de: " + (teclado*12) + " euros"); 
	
    }else if (teclado > 40)
	  {
		  System.out.println("Su salario semanal será de: " + ((40 * 12) + 16 * (teclado -40) + " euros"));
	  }
	  
  }
}
