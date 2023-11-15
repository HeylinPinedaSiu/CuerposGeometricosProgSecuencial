import java.util.Scanner;
public class Piramide {
   public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

     //Declaramos las variables
     double altura;
    double base;
    double areabase;
     //double perimetral;
     double lado;
     //double pbase;
   double areaLateral;
   double AreaTriangulo;
    double areatotal;
    double volumen;

    //pedimos los datos de entrada

    System.out.println("Ingrese la base de la piramide : ");
    base = lector.nextDouble();

    System.out.println("Ingrese la altura de la piramide: ");
    altura = lector.nextDouble();

     System.out.println("Ingrese la altura longitud de lado  de la piramide : ");
     lado  = lector.nextDouble();
     
     //proceso
     //area lateral
     base = lado;
     AreaTriangulo = base* altura /2;
     areaLateral = 4* AreaTriangulo;
     
    //area total
     areabase = (base * altura) /2;
    areatotal = areaLateral + areabase;
    // volumen
    volumen = (areabase * altura) / 3;
    
    System.out.println("El area Lateral de la piramide es : " +areaLateral);
    System.out.println("El area total de la piramide es: " +areatotal);
    System.out.println("El volumen de la piramide es: " + volumen);
      
    lector.close();

   }
}
