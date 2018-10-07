public class Tema4Ejercicio1 {
  public static void main(String[] args) {
    
    String dia;
    
    System.out.println("Introduzca en minúscula un día de la semana para conocer su primera clase");
    
    dia = System.console().readLine();
    dia.toLowerCase();
    
    switch (dia) {
    case "lunes" :
    System.out.println("FOL");
    break;
    
    case "martes":
    System.out.println("PROGRAMACIÓN");
    break;
    
    case "miercoles":
    System.out.println("EEDD");
    break;
    
    case "jueves":
    System.out.println("HTML");
    break;
    
    case "viernes":
    System.out.println("SINF");
    break;
    
    default:
    System.out.println("No te he entendido, prueba otra vez");

    }  
  }
}
