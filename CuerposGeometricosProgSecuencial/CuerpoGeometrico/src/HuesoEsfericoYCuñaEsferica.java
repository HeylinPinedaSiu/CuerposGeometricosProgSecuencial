import java.util.Scanner;
public class HuesoEsfericoYCuñaEsferica {

    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

     //declaracion de variables
	double  Area;
    double  Volumen;
    double  n;
    double  radio;

	//solicitar las variables
	System.out.println("Ingrese el radio:");
    radio = lector.nextDouble();

    //Proceso //area
    n = 15;
	Area = (4 * Math.PI * (radio * radio ) * n) / 360;

	//volumen
	Volumen = (4 * Math.PI * (radio * radio * radio) * n) / 1080;

	//resultado
	System.out.println( "El Area del huso esferico es: "+Area);
	System.out.println ("El volumen del huso esferico es: "+Volumen);

    lector.close();
}
}
