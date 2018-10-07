public class Tema3Ejercicio10 {
  public static void main(String[] args) {
    
    System.out.println("Introduzca los Mb que quiere convertir: ");
    int megas = Integer.parseInt(System.console().readLine());
    
    System.out.printf( megas + " Mb son %d Kb", (megas * 1024));
    
  }
}
