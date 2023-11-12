import java.util.Scanner;
public class TroncoDeCono {

    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

    //declaracion de variables
	double altura;
   double  generatriz;
    double  Radio1;
    double radio;

    double volumen;
    double  Area_B1;    
    double  Arealateral;
    double  Areatotal;
    double  Area_b;
	
	//solicitar las variables
    System.out.println("ingrese el valor de la radio menor: ");
	 radio = lector.nextDouble();
	System.out.println("ingrese el valor de la radio mayor: " );
	Radio1 = lector.nextDouble();
	System.out.println("ingrese el valor de la altura: ");
	altura = lector.nextDouble();
	
	//operaciones
    //Area lateral
    
	generatriz = radio + Radio1;
	Arealateral =    Math.PI * generatriz * (radio + Radio1);

	//area total
	Area_B1 = 2 * Math.PI * Radio1;
	Area_b = 2 * Math.PI * radio;
	Areatotal = Arealateral + Area_B1 + Area_b;

	//volumen
	volumen = (Math.PI * altura * ((Radio1 * Radio1) + (radio * radio) + (Radio1 + radio))) / 3;
	
	//resultado
	System.out.println ("El Area Lateral del tronco de cono es: "+Arealateral);
	System.out.println("El Area Total del tronco de cono es: "+ Areatotal);
	System.out.println("El Volumen del tronco de cono es: "+ volumen);

    lector.close();
    
}
}
