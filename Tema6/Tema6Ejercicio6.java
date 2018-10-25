public class Tema6Ejercicio6 {
	public static void main(String[] args) {
		
		/*Escribe un programa que piense un número al azar entre 0 y 100; el usuario
		debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
		fallido, el programa dirá cuántas oportunidades quedan y si el número intro-
		ducido es menor o mayor que el número secreto.*/
		
	int numeroSecreto = (int)(Math.random() *101);
	System.out.println(numeroSecreto);
	
	System.out.println("Adivine el número secreto");
	int numeroTeclado = Integer.parseInt(System.console().readLine());
	
	if(numeroTeclado == numeroSecreto)
	{
		System.out.println("Enhorabuena, ha acertado el número!");
	}
	








	}
}
