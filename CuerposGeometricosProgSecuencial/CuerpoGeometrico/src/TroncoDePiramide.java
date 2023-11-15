import java.util.Scanner;

public class TroncoDePiramide{

    public static void main(String [] args){
        Scanner lector = new Scanner(System.in);

      //Declaramos las variables 
        double areaLateral;
        double areaTotal;
        double PerimetroBase;
        double Pb;
        double e;
        double AreaBase;
        double Areabase;
        double altura;
        double volumen;
        double AristaM;
        double AristaMenor;
        double W;
        
        //pedimos los datos al usuario 
        System.out.print("Ingrese la longitud de la arista mayor: ");
        AristaM= lector.nextDouble();
        System.out.print("Ingrese la longitud de la arista menor: ");
        AristaMenor = lector.nextDouble();
        System.out.print("Ingresa el valor de la altura: ");
        altura = lector.nextDouble();

        //hacemos las operaciones
        W= (AristaM-AristaM)/2;
        e = Math.sqrt((altura*altura)+(W*W));
        PerimetroBase = AristaM*altura; 
        Pb = AristaMenor*altura;
        areaLateral = (PerimetroBase+Pb)/2*e;
        AreaBase = (AristaM*AristaM);
        Areabase = (AristaMenor*AristaMenor);
        areaTotal= areaLateral+AreaBase+Areabase;
        volumen = 1.0/3*altura*(AreaBase+Areabase+Math.sqrt(AreaBase*Areabase));

        //mostramos los resultados 
        System.out.println("El area lateral es igual a: "+areaLateral);
        System.out.println("El area total es igual a: "+areaTotal);
        System.out.println("El volumen es igual a: "+volumen);

       lector.close();

    }
}
