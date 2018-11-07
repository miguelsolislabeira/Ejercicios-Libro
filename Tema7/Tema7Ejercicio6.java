/*Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array*/

public class Tema7Ejercicio6 {
  public static void main (String [] args) {
    
    int[] n = new int[15];
    
    System.out.println("Introduzca 15 números por teclado. INTRO para pasar al siguiente número");
    
    int i;
    
    for(i=0; i<15; i++)
    {
     n[i] = Integer.parseInt(System.console().readLine());
    }
    
    int posicion = n[14];
    
    for(i = 14; i>0; i--)
    {
      n[i] = n[i-1];
    }
    
    n[0] = posicion;
    
    System.out.println();
    
    for(i = 0; i<15; i++)
    {
      System.out.println(n[i]);
    }
    
  }
}
   
