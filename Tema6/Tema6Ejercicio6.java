public class Tema6Ejercicio6 {
	public static void main(String[] args) {
		
		/*Escribe un programa que piense un número al azar entre 0 y 100; el usuario
		debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
		fallido, el programa dirá cuántas oportunidades quedan y si el número intro-
		ducido es menor o mayor que el número secreto.*/
	
	
	int intentos = 5;
	int numeroSecreto = (int)(Math.random() *100) +1;
	System.out.println(numeroSecreto);
	System.out.println("Adivine el número secreto. Tiene 5 intentos");
	int numeroTeclado = Integer.parseInt(System.console().readLine());

	if (numeroTeclado == numeroSecreto)
	{
		System.out.println("Enhorabuena, ha acertado");
		}else if (numeroTeclado < numeroSecreto)
		{
			System.out.println("El numero secreto es mayor");
		
			}else if (numeroTeclado > numeroSecreto)
			{
				System.out.println("El número secreto es menor.");
	}
	
	while((numeroTeclado != numeroSecreto) && (intentos > 1))
	{
		
		intentos--;
		System.out.println("Le quedan " + intentos + " intentos");
		numeroTeclado = Integer.parseInt(System.console().readLine());
		
	
		if(numeroTeclado == numeroSecreto)
		{
			System.out.println("Enhorabuena, ha acertado!");
			}else if (numeroTeclado > numeroSecreto)
			{
				System.out.println("El número secreto es menor");
	
			}else if (numeroTeclado < numeroSecreto)
			{
				System.out.println("El numero secreto es mayor");
			}
		}
		
		
}
}
