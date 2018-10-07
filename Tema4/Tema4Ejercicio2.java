public class Tema4Ejercicio2 {
  public static void main(String[] args) {
    
    System.out.println("¿Qué hora es?");
    
    int hora = Integer.parseInt(System.console().readLine());
    
    if ((hora >= 6 ) && (hora <= 12)) {
      System.out.println("Buenos días!");
   
      
      if ((hora >= 12) && (hora <= 20)){
      System.out.println("Buenas tardes!");
      
     
        
        if ((hora >= 21) && ( hora <= 5)) {
        System.out.println("Buenas noches!");
        
          if ((hora < 0) && (hora > 24)) {
          System.out.println("Lo siento, no te he entendido. Prueba otra vez");  
          }
        }
      }
    }  
  }  
}
