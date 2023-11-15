import java.util.Scanner;
public class ZonaEsferica {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

         //Declaramos las variables

        double radio;   
       double Area;
        double altura;
       double Volumen;
         double RadioM;

       //pedimos los datos de entrada
       System.out.println("Ingrese la altura: ");
       altura = lector.nextDouble();

       System.out.println("Ingrese el radio  mayor: ");
       RadioM = lector.nextDouble();

       System.out.println("Ingrese el rado menor");
       radio = lector.nextInt();

       
       Area = 2*Math.PI*RadioM*altura;
       Volumen  = Math.PI*altura*((altura*altura)+3*RadioM+3*radio)/6;
       
       //resultados de la zona esferica
       System.out.println("El area de la zona esferica es: " +Area);
       System.out.println("El volumen de la zona esferica es: " +Volumen);

      lector.close();
}
}
