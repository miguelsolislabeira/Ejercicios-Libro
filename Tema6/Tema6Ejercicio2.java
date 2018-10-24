public class Tema6Ejercicio2 {
public static void main(String[] args) {

		/*Realiza un programa que muestre al azar el nombre de una carta de la
		baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
		diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
		cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
		sería el 1). Para convertir un número en una cadena de caracteres podemos
		usar String.valueOf(n) */
		
		/* Creamos dos bucles Switch, uno para cada posibilidad (palo y carta)
		 * Almacenamos en strings los cuatro casos de palo. También los cuatro de carta que pueden no ser números
		 * Como default en el bucle de carta, ponemos que nos retorne la función random de la clase Math*/



	String palo = "";
	String carta = ""; 
	//creamos dos cadenas de caracteres vacías para almacenar el resultado del case de ambos switch
	
	int numeroPalo = (int)(Math.random() * 4) +1; //creamos variable entera e inicializamos con la función para que escupa 4 números
													//empezando por el 1
	
	switch(numeroPalo) //abrimos switch para contemplar los 4 casos (los 4 palos)
	{
		case 1:
		palo = "picas";
		
		break;
		
		case 2:
		palo = "corazones";
		
		break;
		
		case 3:
		palo = "treboles";
		
		break;
		
		case 4:
		palo = "rombos";
		
		default:
		
	}
	
		int numeroCarta = (int)(Math.random() *13) +1; //creamos variable con la función empezando por 1 y hasta el 13
														//, que es el número de cartas que hay
		
		switch (numeroCarta) //abrimos Switch con los casos especiales que almacenaremos en String carta
		{
			case 1:
			carta = "As";
			
			break;
			
			case 11:
			carta = "J";
			
			break;
			
			case 12:
			carta = "Q";
			
			break;
			
			case 13:
			carta = "K";
			
			default:
			carta = String.valueOf(numeroCarta); //En los casos que no se almacenen en String, le damos a carta el valor de la funcion
		}
		
		System.out.println(carta + " de " + palo); //imprimimos los dos strings con el resultado que hayan almacenado.
	
}
}
