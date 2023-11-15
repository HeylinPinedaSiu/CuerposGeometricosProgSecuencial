import java.util.Scanner;
public class Prisma {
    public static void main(String[] args) throws Exception {
     Scanner lector = new Scanner(System.in);
      
         //Declaramos las variables del prisma
       int longlados; 
       int lados;
        double altura;
        double areaLateral;
         double areaTotal;
         double volumen;
         double perimetroBase;
         double areaBase;
         double apotema;

       //Pedimos los datos de entrada
       System.out.println("Ingrese la cantidad de lados del prisma");
        lados =lector.nextInt();

       System.out.println("Ingrese la altura del prisma: ");
       altura = lector.nextDouble();
  
       System.out.println("Ingrese la longitud de lados  del prisma: ");
       longlados = lector.nextInt();

       //Hacemos las operaciones 
       
       perimetroBase = lados * longlados;
       areaLateral = perimetroBase * altura;
       double alfa = (Math.PI/180) * (360/lados);
       apotema = longlados / (2 * Math.tan((alfa)/2));
       areaBase = (perimetroBase * apotema)/2;
       areaTotal = areaLateral + 2 * areaBase;
       volumen = areaBase * altura;

       //mostramos en pantalla los resultados
       System.out.println("Area lateral: " + areaLateral);
       System.out.println("Area total: " + areaTotal);
       System.out.println("Volumen: " + volumen);

        lector.close();

    }
}
