import java.util.Scanner;
public class Cilindro {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

         //Declaramos las variables
         double radio;
         double altura;
         //double base;
         double area;
        double volumen;

        //pedimos los datos de entrada

        System.out.println("Ingresea el  radio del cilindro: ");
        radio = lector.nextDouble();

         System.out.println("Ingrese la altura del cilindro: ");
        altura = lector.nextDouble();

        System.out.println("Ingrese la area del cilindro: ");
         area = lector.nextDouble();

        //hacemos las operaciones correspondientes
        area = ((2) * (3.1416) * (radio)) * (altura * radio);
        volumen = ((3.1416) * (radio * radio ) * altura );

        //Imprimimos los resultados
        System.out.println("El area del cilindro es : " + area+ "cm2");
        System.out.println("El volumen del cilindro es :" + volumen+ "cm3" );

        lector.close();
}
}

