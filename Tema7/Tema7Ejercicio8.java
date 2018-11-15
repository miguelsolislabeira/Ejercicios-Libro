
public class Tema7Ejercicio8 {
  public static void main(String[] args){
  
    int[] temperatura = new int[12];

    System.out.println("Bienvenido a la tabla anual de temperaturas medias");
    System.out.println();

    for (int x = 0; x< 12; x++)
    {
      System.out.println("Introduce la temperatura del mes "+ (x+1) + "º: " );
      temperatura[x] = Integer.parseInt(System.console().readLine());
    }
    
    int pintada = 0;

    System.out.println("Temperaturas medias por mes.");
    while(pintada < 12)
    {
      System.out.print((pintada+1) + ": ");
      for(int x = 0; x < temperatura[pintada]; x++)
      {
        System.out.print("*");
      }
      
      pintada++;
     System.out.println();
    }

  }
}
