import java.util.Scanner;
public class ZonaEsferica {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

         //Declaramos las variables

        double radio;
        double radio_zf;
       double Area;
        double altura;
       double volumen;
       //double base;

       //pedimos ls datos de entrada
       System.out.println("Ingrese la altura: ");
       altura = lector.nextDouble();

       System.out.println("Ingrese el radio : ");
       radio = lector.nextDouble();

       

       //radio  de la zona esferica
       radio = altura;
       radio_zf = (radio * radio + altura * altura ) / (2 * altura);
       Area = 2 * Math.PI  *altura * altura;

       //volumen de la zona esferica
       volumen  = (Math.PI * (altura * altura )) * ((3 * radio ) - altura);
       
       //resultados de la zona esferica
       System.out.println("El area de la zona esferica es: " +Area);
       System.out.println("El volumen de la zona esferica es: " +volumen);

      lector.close();
}
}
