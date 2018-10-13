public class Tema4Ejercicio12 {
	public static void main(String [] args) {
		
/*Realiza un minicuestionario con 10 preguntas tipo test sobre las
asignaturas que se imparten en el curso. Cada pregunta acertada*
sumará un punto. El programa mostrará al final la califcación
obtenida.*/

int contador = 0;
System.out.println("Bienvenido al mega cuestionario de 1º de DAW!\n");
System.out.println("Pregunta 1: ¿Cuál es el nombre del profesor de Programación? Introduzca a, b, c\n");
System.out.println(" a) Juan Antonio. b) Alberto; c) Felipe");

String respuesta1 = System.console().readLine();

	if (respuesta1.equals("a"))
	{
		System.out.println("Correcto\n");
		contador++;
	}else
	{
		System.out.println("Incorrecto\n");
	}
	
	System.out.println("Pregunta 2: ¿Cuál es el comando para compilar JAVA en la consola de comandos?\n");
	System.out.println(" a) compile; b)class; c) javac\n");
	
	String respuesta2 = System.console().readLine();
	if (respuesta2.equals("c"))
	{
		System.out.println("Correcto\n");
		contador ++;
	}else
	{
		System.out.println("Incorrecto\n");
	}
	

	System.out.println("Pregunta 3: ¿Qué significan las siglas HTML?\n");
	System.out.println("a) Hyper Text Marked Language; b)Hyper Text Markup Language; c) Hoy Te Mato Loco");
	
	String respuesta3 = System.console().readLine();
	if (respuesta3.equals("b"))
	{
		System.out.println("Correcto\n");
		contador++;
	}else
	{
		System.out.println("Incorrecto");
	}

	System.out.println("Pregunta 4: ¿Cuál es la medida más pequeña de almacenamiento de información?\n");
	System.out.println("a) Byte; b) Bit; c) Kb;");
	
	String respuesta4 = System.console().readLine();
	
	if (respuesta4.equals("b"))
	{
		System.out.println("Correcto");
		contador++;
	}else 
	{
		System.out.println("Incorrecto");
	}
	
	System.out.println("Pregunta 5: ¿Cómo se llama el código intermedio creado por la JVM?\n");
	System.out.println("a) Bytecode; b) Proxmox; c) Código Máquina\n");
	
	String respuesta5 = System.console().readLine();
	
	if(respuesta5.equals("a"))
	{
		System.out.println("Correcto");
		contador++;
	}else
	{
		System.out.println("Incorrecto");
	}

	System.out.println("Su puntuación final ha sido: " + contador + " puntos");





 }
}
