import java.util.Scanner;
public class Esfera {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

           //declaramos las variables
             double area;
            double volumen;
            double radio;
         
             //pedimos los datos al usuario
             System.out.println("Ingresa el radio de la Esfera: ");
             radio = lector.nextDouble();
 
            area = 4 * (3.1416) * Math.pow(radio, 2);
            volumen = (3.1416) * Math.pow(radio, 3);
 
            System.out.println("El area de la Esfera es: " +area);
            System.out.println("El volumen de una esfera es: "+volumen);
 
            lector.close();
}
}
