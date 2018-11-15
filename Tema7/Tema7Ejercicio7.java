/*Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces
por teclado dos valores y a continuación cambiará todas las ocurrencias del
primer valor por el segundo en la lista generada anteriormente. Los números
que se han cambiado deben aparecer entrecomillados.*/

public class Tema7Ejercicio7 {
  public static void main (String [] args) {
    
    int [] n = new int [100];
    int valor1=0;
    int valor2=0;
    int aux=0;
   
    for(int i = 0; i<100; i++)
    {
      n[i] = (int)(Math.random()*21);
      System.out.print(n[i] + " ");
    }
      System.out.println();
      System.out.println();
      
      System.out.println("Escoja ahora una posición del 1 al 20: ");
      valor1 = Integer.parseInt(System.console().readLine());
      
      System.out.println("Escoja otra posición e intercambiaré las dos: ");
      valor2 = Integer.parseInt(System.console().readLine());
     
      
      aux = valor1;
      valor1=valor2;
      valor2 = aux;
      
     
     
      for(int i = 0; i<100; i++)
      {
          System.out.print(n[i] + " ");
      
      }
  }
}
