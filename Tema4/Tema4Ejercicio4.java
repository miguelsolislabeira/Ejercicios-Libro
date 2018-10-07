public class Tema4Ejercicio4 {
  public static void main(String[] args) {
    
    System.out.println("Introduzca aquí el número de horas trabajadas");
    
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    int sueldoSemanal;
    
    if ( horasTrabajadas <=40 ){
       sueldoSemanal = (horasTrabajadas * 12) ;
      System.out.println("Su salario semanal será de " + sueldoSemanal);
    
     }else {
       sueldoSemanal = ((40 * 12) + ((horasTrabajadas - 40) * 16));
       System.out.println("Su salario semanal será de " + sueldoSemanal);
    
    }
    
  }
}
