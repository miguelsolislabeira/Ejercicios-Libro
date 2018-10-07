public class Tema1Ejercicio5 {
  public static void main(String[] args) {
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String celeste = "\033[36m";
    String blanco = "\033[37m";
    
    
    
    System.out.printf(naranja + " %-3s %8s %12s %8s %9s\n", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes");
    System.out.printf(verde + " %-8s %4s %10s %10s %8s\n", "SINF", "EEDD", "BBDD", "PROG", "FOL");
    System.out.printf(azul +" %-8s %4s %10s %10s %8s\n", "EEDD", "PROG", "HTML", "HTML", "FOL");
    System.out.printf(morado + " %-8s %4s %10s %10s %8s\n", "EEDD", "PROG", "HTML", "HTML", "FOL");
    System.out.printf(celeste + " %-8s %4s %10s %10s %8s\n", "SINF", "EEDD", "BBDD", "PROG", "SINF");
    System.out.printf(blanco + " %-8s %4s %10s %10s %8s\n", "PROG", "HTML", "PROG", "PROG", "SINF");
    
 }
}
