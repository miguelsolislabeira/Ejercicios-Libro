public class Tema3Ejercicio6 {
  public static void main(String[] args) {
    
    System.out.println("Por favor, introduce la base del triángulo en centímetros");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.println("Introduzca ahora la altura del triángulo en centímetros");
    double altura = Double.parseDouble(System.console().readLine());
    
    double area = ( (base * altura) / 2);
    
    System.out.printf("El área de su triángulo es %.2f centímetros", area);
    
    
  }
}
