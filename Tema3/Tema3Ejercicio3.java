public class Tema3Ejercicio3 {
  public static void main(String[] args) {
    
    System.out.println("Introduzca la cantidad en pesetas a convertir");
    int pesetas = Integer.parseInt(System.console().readLine());
    
    double conv = (pesetas / 166.386);
    
    System.out.printf(pesetas + " pesetas son: %.2f euros", conv);
    
    
  }
}
