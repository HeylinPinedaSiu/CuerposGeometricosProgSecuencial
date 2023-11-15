import java.util.Scanner;
 
public class Piramide{
 public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

        //declaramos las variables
        int lados;
        double areaLateral;
        double  areaTotal;
        double volumen;
        double altura;
        double apotemaPiramide;
        double perimetroBase;
        double Apotema;
        double areaBase;
        double longLados;

        //pedimos los datos al ussuario 
        System.out.print("Ingrese la altura de la pirámide: ");
        altura = lector.nextDouble();

        System.out.print("Ingrese la cantidad de lados de la pirámide: ");
        lados = lector.nextInt();

        System.out.print("Ingrese el apotema de la pirámide: ");
        apotemaPiramide = lector.nextDouble();

        System.out.print("Ingrese la Longitud de los lados : ");
        longLados = lector.nextDouble();

        System.out.print("Ingrese el apotema de la base: ");
        Apotema = lector.nextDouble();

        //procesamos los datos
        perimetroBase = lados * longLados;
        apotemaPiramide = (Math.sqrt(altura*altura)+(Apotema*Apotema));
        areaLateral = (perimetroBase*apotemaPiramide)/2;
        areaBase = perimetroBase*2*(Apotema+apotemaPiramide);
        areaTotal = (areaLateral+areaBase);
        volumen = (areaBase+altura)/3;
        
        //mostramos los resukltados en pantalla
       System.out.println("El area Lateral de la pirámide es: "+areaLateral);
       System.out.println("El area total de la pirámide es "+areaTotal);
       System.out.println("El volumen de la pirámide es: "+volumen);

       lector.close();



    }

}
