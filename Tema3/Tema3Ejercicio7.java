public class Tema3Ejercicio7 {
  public static void main(String[] args) {
    
    System.out.println("Por favor, introduzca aquí el precio sin IVA");
    
      double baseImp = Double.parseDouble(System.console().readLine());
      
      double total = ((baseImp + (baseImp * 21) / 100));
      
      System.out.printf("El total de su factura es %.2f euros", total);
      
  }
}
