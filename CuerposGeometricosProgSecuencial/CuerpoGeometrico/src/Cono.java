import java.util.Scanner;
public class Cono {
    public static void main(String[] args) throws Exception {
    Scanner lector = new Scanner(System.in);
    
    //Declaramos las variables 
     double radio;
     double generatriz;
     double altura;
     double areabase;
     double arlateral;
     double areaTotal;
     double volumen;
      
     //pedimos los datos de entrada al usuario 
     System.out.println("Ingrese el radio del cono: ");
     radio = lector.nextDouble();

     System.out.println("Ingrese la genratriz del cono: ");
     generatriz = lector.nextDouble();

     System.out.println("Ingrese la altura del cono: ");
     altura = lector.nextDouble();

     //hacemos las operaciones
     areabase = (3.1416) * Math.pow(radio, 2);
     arlateral = (3.1416) * radio * generatriz;
     areaTotal = areabase + arlateral;
     volumen = (areabase * altura )/3;

     //mandamos a imprimir los resultados
      System.out.println("El area base es: " + areabase);
     System.out.println("El area Lateral es: " + arlateral);
     System.out.println("El area Total es: " + areaTotal);
     System.out.println("El volumen es: " + volumen);

     lector.close();

    
  }
}
