public class Tema3Ejercicio5 {
  public static void main(String[] args) {
    
    
    System.out.println("Por favor. introduce la base del rectángulo en centímetros");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.println("Por favor, introduce ahora la altura del rectángulo en centímetros");
    double altura = Double.parseDouble(System.console().readLine());
    
    double area = (base * altura);
    
    System.out.printf("El área de su rectángulo es %.2f centímetros", area);
    
  }
}
