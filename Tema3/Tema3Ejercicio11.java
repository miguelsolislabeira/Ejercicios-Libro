public class Tema3Ejercicio11 {
  public static void main(String[] args) {
    
    System.out.println("Introduzca los Kb que quiere convertir");
    double kb = Double.parseDouble(System.console().readLine());
    
    System.out.printf( kb + "Kb son %.3f Mb", (kb / 1024));
    
  }
}
