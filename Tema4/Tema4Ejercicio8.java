public class Tema4Ejercicio8 {
public static void main(String[] args) {
  
 String teclado;
 String nota;
 
  System.out.println("Introduzca su primera nota: ");
    teclado = System.console().readLine();
    double x = Double.parseDouble(teclado);
  
  System.out.println("Introduzca su segunda nota: ");
    teclado = System.console().readLine();
    double y = Double.parseDouble(teclado);
    
    System.out.println("Introduzca su tercera nota: ");
    teclado = System.console().readLine();
    double z = Double.parseDouble(teclado);
    
    double notamedia = (x + y + z) / 3;
    
    System.out.println("Su nota media es de: " + notamedia);
    
    if (notamedia <5){
      System.out.println("Lo siento, has suspendido, caraalfombra");
    }else {
    }
    
      if ((notamedia >=6) && (notamedia < 7)) {
        System.out.println("Bien");
      }else {
      } 
         
        if ((notamedia >=7) && (notamedia < 9)) {
        } else {
        }
          if ((notamedia >=9) && (notamedia <= 10)) {
          } else {
          }
      
    
    
  
  }
 }   


