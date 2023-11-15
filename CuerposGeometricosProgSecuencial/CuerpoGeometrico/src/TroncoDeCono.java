import java.util.Scanner;

public class TroncoDeCono{

    public static void main(String [] args){
    Scanner lector = new Scanner(System.in);

	//declaramos las variables 
    double AreaLateral;
	double  areaTotal;
	double  volumen;
	double areaBase;
	double areab;
    double altura;
	double radio;
	double radioM;
	double generatriz;


	//pedimos los datos al usuario 
    System.out.print("Ingrese la altura: ");
    altura = lector.nextDouble();
    System.out.print("Ingrese el radio menor: ");
    radio = lector.nextDouble();
    System.out.print("Ingrese el radio Mayor: ");
    radioM = lector.nextDouble();

	//hacemos las operaciones 
    generatriz = Math.sqrt((altura*altura)+(radioM*radioM-radio*radio));
    AreaLateral = Math.PI*generatriz*(radioM+radio);
    areaBase = Math.PI*radioM;
    areab = Math.PI*radio;
    areaTotal = AreaLateral + areaBase + areab;
    volumen = 1.0/3*Math.PI*altura*((radioM*radioM)+(radio*radio)+radioM*radio);

		//mostramos los resultados 
      System.out.println("El area lateral es: "+AreaLateral);
      System.out.println("El area total es: "+ areaTotal );
      System.out.println("El volumen es: "+volumen);

      lector.close();
 
 }

}
