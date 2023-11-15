import java.util.Scanner;
public class Cono {
    public static void main(String[] args) throws Exception {
    Scanner lector = new Scanner(System.in);
    
    //Declaramos las variables 
     double radio;
     double generatriz;
     double altura;
     double perimetroBase;
     double areaLateral;
     double areaBase;
     double areaTotal;
     double Volumen;
      
     //pedimos los datos de entrada al usuario 
     System.out.println("Ingrese el radio del cono: ");
     radio = lector.nextDouble();

     System.out.println("Ingrese la altura del cono: ");
     altura = lector.nextDouble();

     //hacemos las operaciones
     perimetroBase = (Math.PI*radio);
     generatriz = Math.sqrt((radio*radio)+(altura*altura));
     areaLateral = perimetroBase*generatriz;
     areaBase = (Math.PI*(radio*radio));
     areaTotal = areaLateral + areaBase;
     Volumen = areaBase*altura/3;
 

     //mandamos a imprimir los resultados
      System.out.println("El area base es: " + areaBase);
     System.out.println("El area Lateral es: " + areaLateral);
     System.out.println("El area Total es: " + areaTotal);
     System.out.println("El volumen es: " + Volumen);

     //mostramos los datos 
     System.out.println("El area lateral el cono es: "+ areaLateral);
     System.out.println("El area total del cono es: "+ areaTotal);
     System.out.println("el volumen del cono es: "+ Volumen );
   
     lector.close();

    
  }
}
