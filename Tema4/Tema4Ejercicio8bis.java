public class Tema4Ejercicio8bis {
	public static void main(String[] args) {
		
		/*Amplía el programa anterior para que diga la nota del boletín
		(insuficiente, suficiente, bien, notable o sobresaliente) */

	System.out.println("Introduzca su primera nota");
	double nota1 = Double.parseDouble(System.console().readLine());
	
	System.out.println("Introduzca su segunda nota");
	double nota2 = Double.parseDouble(System.console().readLine());
	
	System.out.println("Introduzca su tercera nota");
	double nota3 = Double.parseDouble(System.console().readLine());
	
	double notaMedia = (nota1 + nota2 + nota3) /3;
	
	if ((nota1 <0) || (nota2 <0) || (nota3 <0))
	{
		System.out.println("No introduzca números negativos");
		
	} else if ((notaMedia >= 0) && (notaMedia < 5)) 
	{
			System.out.println("Insuficiente");
			
	}else if ((notaMedia >= 5) && (notaMedia <7))
	{
			System.out.println("Bien");
		
	} else if ((notaMedia >= 7) && (notaMedia < 9))
	{
			System.out.println("Notable");
			
	} else if ((notaMedia >=9) || (notaMedia == 10))
	{
			System.out.println("Sobresaliente");
	
	}
		
  }
}

