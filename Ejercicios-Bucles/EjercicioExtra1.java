public class EjercicioExtra1 {
public static void main(String[] args) {

/*Realice un programa que presente por pantalla una lista de números enteros consecutivos en orden creciente,
desde el 0 en adelante. El programa pedirá la cantidad de números que se van a mostrar.
Ejemplo:
Introduzca la cantidad de números: 7
1-2-3-4-5-6-7*/

	System.out.println("Introduzca cuántos números quiere que le muestre");
	int teclado = Integer.parseInt(System.console().readLine());
	int vueltas = 0;
	System.out.println();
	while (vueltas < teclado)
	{
		System.out.println(vueltas+1);
		vueltas ++;
	}
 }
}
