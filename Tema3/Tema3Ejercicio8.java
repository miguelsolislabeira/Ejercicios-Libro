public class Tema3Ejercicio8 {
  public static void main(String[] args) {
    
    System.out.println("Introduzca aquí el número de horas trabajadas esta semana");
    double horas = Double.parseDouble(System.console().readLine());
    
    System.out.println("CALCULADORA DE SUELDO SEMANAL");
    System.out.println("==============================");
    System.out.printf("Horas trabajadas: %5.1f\n", horas);
    System.out.println("Precio de la hora: 12€");
    System.out.printf("Sueldo semanal: %8.1f euros", (horas * 12));
    
  }
}
