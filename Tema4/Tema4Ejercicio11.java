public class Tema4Ejercicio11 {
  public static void main(String[] args) {
    
    String teclado;
    
    System.out.println("Introduce la hora");
    teclado = System.console().readLine();
    int hora = Integer.parseInt(teclado);
    
    
    System.out.println("Introduce los minutos");
    teclado = System.console().readLine();
    int minutos = Integer.parseInt(teclado);
    
    int segundos = ((hora * 3600) + (minutos * 60));
    int faltan = ((86400 - segundos));
      System.out.println("Faltan " + faltan + " segundos para la medianoche");
      
 }
}    
    
