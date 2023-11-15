import java.util.Scanner;
public class Octaedro {

    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

    //declaracion de variables
	double area; 
   double Volumen;
    //double m;
    double lado;

	//solicitar las variables 
	System.out.println("Ingrese el valor de la longitud de lado: ");
	lado = lector.nextDouble();

	//Proceso 
	area = 2 * (lado * lado ) * Math.sqrt(3);

	//volumen
	Volumen = (Math.sqrt(2) * (lado * lado * lado )) / 3;

	//resultado
	System.out.println("El area del octaedro es: "+area);
	System.out.println ("El volumen del octaedro es: "+Volumen );

	lector.close();

}
}