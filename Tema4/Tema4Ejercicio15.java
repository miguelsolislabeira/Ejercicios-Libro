
public class Tema4Ejercicio15 {
	public static void main(String[] args) {
		
/*Escribe un programa que pinte una pirámide rellena con un carácter
introducido por teclado que podrá ser una letra, un número o un
símbolo como *, +, -, $, &, etc. El programa debe permitir al
usuario mediante un menú elegir si el vértice de la pirámide está
apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la
derecha.*/

System.out.printf("Bienvenido al programa mágico que pinta pirámides\n");
System.out.printf("Introduzca con qué caracter quiere que pinte su pirámide\n");

String c = System.console().readLine();

System.out.println("\nIntroduzca ahora hacia dónde quiere que apunte el vértice: ");
System.out.printf("1: arriba; 2: abajo; 3: derecha; 4: izquierda\n");

	int vertice = Integer.parseInt(System.console().readLine());
	
	switch (vertice)
	{
		case 1:
		
		System.out.println("    " + c);
		System.out.println("   " + c + c + c);
		System.out.println("  " + c + c + c + c +c);
		System.out.println(" " + c + c + c + c + c + c + c); 
	
		break;
	
		case 2:
		
				System.out.println(" " + c + c + c + c + c + c + c);
				System.out.println("  " + c + c + c + c +c);
				System.out.println("   " + c + c + c);
				System.out.println("    " + c);

		break;
		
		case 3:
	
				System.out.println("     " + c);
				System.out.println("     " + c + c);
				System.out.println("     " + c + c + c);
				System.out.println("     " + c + c + c + c);
				System.out.println("     " + c + c + c);
				System.out.println("     " + c + c);
				System.out.println("     " + c);

		break;

		case 4:
				System.out.println("   " + c);
				System.out.println("  " + c + c);
				System.out.println(" " + c + c + c);
				System.out.println("" + c + c + c + c);
				System.out.println(" " + c + c + c);
				System.out.println("  " + c + c);
				System.out.println("   " + c);					

		break;
		
		default: 
				System.out.println("Introduzca un número entre 1 y 4");
	}

 }
}
