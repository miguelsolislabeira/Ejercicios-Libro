public class Tema3Ejercicio2 {
  public static void main(String[] args) {
    

    System.out.println("Introduzca aquí la cantidad en euros a convertir: ");
    
    double euros = Double.parseDouble(System.console().readLine());
    
    int conv =(int)(euros * 166.386);
    
    System.out.println(euros + " Euros son: " + conv + " pesetas");

  }
}
