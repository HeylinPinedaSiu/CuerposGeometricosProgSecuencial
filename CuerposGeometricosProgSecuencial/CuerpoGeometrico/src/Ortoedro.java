import java.util.Scanner;

public class Ortoedro{

    public static void main(String [] args){
    Scanner lector = new Scanner(System.in);

	//declaramos las variables 
     double e;
	 double f;
	 double W;
     double area;
	 double volumen;
	 double diagonal;

	 //pedimos los datos al usuario 
     System.out.print("Ingrese el valor de e: ");
     e =lector.nextDouble();
     System.out.print("Ingrese el valor de f: ");
     f =lector.nextDouble();
     System.out.print("Ingrese el valor de W: ");
     W =lector.nextDouble();

	 //procesamos los datos 
     area = 2*(e*f+e*W+f*W);
     diagonal = Math.sqrt((e*e)+(f*f)+(W*W));
     volumen = e*f*W;

	 //mostramos en pantalla los resultados 
     System.out.println("El valor del area es: "+area);
     System.out.println("El valor del volumen es: "+volumen);
     System.out.println("El valor de la diagonal es: "+diagonal);
     
     lector.close();

 }

}
 
