/*Escribe un programa que pida 10 números por teclado y que luego muestre
los números introducidos junto con las palabras “máximo” y “mínimo” al lado
del máximo y del mínimo respectivamente.*/

public class Tema7Ejercicio5 {
  public static void main (String [] args) {
    
    int [] numero = new int [10];
    
    int i;
    int minimo = Integer.MAX_VALUE;
    int maximo = Integer.MIN_VALUE;
    
    System.out.println("Introduzca los números y pulse INTRO después de cada uno");
    
    for(i=0; i<10; i++)
    {
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    
    for(i=0; i<10; i++)
    {
     
      if(numero[i] < minimo)
      {
        minimo = numero[i];
      }
    
      if(numero[i] > maximo)
      {
        maximo = numero[i];
      }
    }
        System.out.println();
      
    for(i = 0; i<10; i++)
    {
      System.out.print(numero[i]);
      
      if(numero[i] == minimo)
      {
        System.out.println(" Mínimo");
      }
      
      if(numero[i] == maximo)
      {
        System.out.println(" Máximo");
      }
  
        System.out.println();
   }
  }
}
      
    
