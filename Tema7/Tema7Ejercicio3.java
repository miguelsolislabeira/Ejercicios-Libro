/*Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en
mostrarse y viceversa.*/

public class Tema7Ejercicio3 {
  public static void main (String[] args) {
  
    int [] n;
    n = new int[10];
  
    for (int i = 0; i<10; i++){
    System.out.println("Introduzca un número. Cuando llegue a 10 se los mostraré al revés: ");
    n[i] = Integer.parseInt(System.console().readLine());
    }
  
    for(int j = 9; j>=0; j--)
    {
    System.out.print(n[j] + " ");
    }
  
  }
}
  
