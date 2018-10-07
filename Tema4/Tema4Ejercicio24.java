public class Tema4Ejercicio24 {
  public static void main(String[] args) {
    
    
    System.out.println("Introduzca 1 para Programador Jr. 2 para Programador Sr. y 3 para Jefe de Proyecto");
    int cargo = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca ahora su estado civil: 2 soltero. 1 casado");
    int estadoCivil = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca ahora cuántos días ha estado de viaje: ");
    int diasVisita = Integer.parseInt(System.console().readLine());
    
    
    double sueldoBase = 0;
    
    switch (cargo) {
      
      case 1:
      
        sueldoBase = 950;
      break;
        
      case 2:
      
      sueldoBase = 1200;
      break;
      
      case 3:
      
      sueldoBase = 1600;
      break;
      
     default:
  }     
  
  
  
  
  double sueldoDietas = diasVisita * 30;
  double sueldoBruto = sueldoBase + sueldoDietas;
  double irpf = 0;
  
    if (estadoCivil == 1) {
      irpf = 20;
      
    } else if (estadoCivil == 2) {
      irpf = 25;
    } else {
      System.out.println("No ha elegido correctamente el estado civil");
    }
    
    double cuantiaIrpf = (sueldoBruto * irpf) / 100;  
    
    System.out.printf("Sueldo base %7.2f\n", sueldoBase);
    System.out.printf("Dietas (%2d viajes) %7.2f\n", diasVisita, sueldoDietas);
    System.out.printf("Sueldo bruto %7.2f\n", sueldoBruto);
    System.out.printf("Retención IRPF (%.0f%%) %7.2f\n", irpf, cuantiaIrpf);
    System.out.printf("Sueldo neto %7.2f\n", sueldoBruto - cuantiaIrpf);
 }   
}
