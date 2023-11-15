import java.util.Scanner;
public class Cilindro {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

         //Declaramos las variables
         double radio;
         double altura;
         double  areaLateral;
         double areaTotal;
         double Volumen;
         double perimetroBase;
         double areaBase;
        
      
        //pedimos los datos de entrada
         System.out.println("Ingrese la altura del cilindro: ");
        altura = lector.nextDouble();

        System.out.println("Ingrese el radio del cilindro: ");
        radio = lector.nextDouble();

        //hacemos las operaciones correspondientes
        perimetroBase = 2*Math.PI*radio;
        areaLateral = perimetroBase*altura;
        areaBase= Math.PI* (radio*radio);
        areaTotal = 2*Math.PI*radio*(altura + radio);
        Volumen = areaBase*altura;

        //Imprimimos los resultados
        System.out.println("El Area Lateral del cilindro es: " + areaLateral);
      System.out.println("El Area Total del cubo es: " + areaTotal );
      System.out.println("El volumen del cubo es: " + Volumen );

       lector.close();
}

}
