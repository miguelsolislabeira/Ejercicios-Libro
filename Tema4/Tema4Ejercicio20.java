public class Tema4Ejercicio20 {
public static void main (String [] args) {
		
/*Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
se califica como apto o no apto, por tanto se debe preguntar al usuario
¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el
resultado de la recuperación es apto, la nota será un 5; en caso
contrario, se mantiene la nota media anterior*/


System.out.println("Introduzca la nota del primer examen");
double nota1 = Integer.parseInt(System.console().readLine());

System.out.println("Introduzca la nota del segundo examen");
double nota2 = Integer.parseInt(System.console().readLine());
   
    double notaMedia = ((nota1 + nota2) /2); 
    String respuesta = System.console().readLine();
  
  if (notaMedia >= 5)
  {
	  System.out.println("Su nota media es: " + notaMedia);
  
  }else
  {
	  System.out.println("¿Cuál ha sido el resultado de la recuperación? Introduzca Apto o No apto");
	  System.console().readLine(respuesta);
	 
  }if (respuesta.equals("Apto"))
  {
	  System.out.println("Su nota final es un 5");
  
  }else if (respuesta.equals("No apto"));
  {
	  System.out.println("Su nota media es " + notaMedia);
  }
 }
}
