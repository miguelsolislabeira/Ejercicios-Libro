public class Tema3Ejercicio9 {
  public static void main(String[] args) {
    
    //H=(Pi*R (cuadrado)) /3
    
    System.out.println("Introduzca aquí el radio del cono en centímetros: ");
    int r = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca ahora la altura del cono en centímetros: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    double volumen = (3.14 * Math.pow(r, 2) * altura /3);
    
    
  System.out.printf("El volumen del cono es: %.2f ", volumen);
  }
}
