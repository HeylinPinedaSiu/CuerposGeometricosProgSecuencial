import java.util.Scanner;
public class Prisma {
    public static void main(String[] args) throws Exception {
     Scanner lector = new Scanner(System.in);
      
         //Declaramos las variables del prisma
        double base;
        double area;
        double altura;

        //double volumen;
       //Pedimos los datos de entrada
       System.out.println("Ingrese la base del prisma: ");
       base = lector.nextDoubl  e();
  
       System.out.println("Ingrese el area el prisma: ");
       area = lector.nextDouble();


       System.out.println("Ingrese la altura del prisma: ");
       altura = lector.nextDouble();

       //Hacemos las operaciones 
        //volumen = base *  area * altura /2;
        System.out.println( "El volumen de un prisma es: " + base * area * altura /2 );
        lector.close();

    }
}
