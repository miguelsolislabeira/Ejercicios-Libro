public class Tema4Ejercicio3 {
  public static void main(String[] args) {
    
    System.out.println("Di un número del 1 al 7");
    
    int dia = Integer.parseInt(System.console().readLine());
    
    switch (dia) {
      
      case 1: 
      System.out.println("El 1 corresponde al lunes");
      break;
      
      case 2:
      System.out.println("El 2 corresponde al martes");
      break;
      
      case 3:
      System.out.println("El 3 corresponde al miércoles");
      break;
      
      case 4:
      System.out.println("El 4 corresponde al jueves");
      break;
      
      case 5:
      System.out.println("El 5 corresponde a San Viernes");
      break;
      
      case 6:
      System.out.println("El 6 corresponde al sábado");
      break;
      
      case 7:
      System.out.println("El 7 corresponde al domingo");
      break;
      
      default:
      System.out.println("Lo siento, no te he entendido. Prueba otra vez");
      
    }
  }
}
