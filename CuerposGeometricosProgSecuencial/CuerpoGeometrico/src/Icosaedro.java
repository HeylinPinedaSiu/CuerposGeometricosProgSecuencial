import java.util.Scanner;
public class Icosaedro {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

            //declaracion de variables
	  double area_1;
      double Volumen;
     double lado;  
	
	    //solicitar las variables
	    System.out.println("Digite la longitud lado: ");
	    lado = lector.nextDouble();

	    //Proceso de area 
	    area_1 = 5* lado * lado * Math.sqrt(3);

	    //volumen
	    Volumen  = (5*(3 + Math.sqrt(5))*(lado * lado * lado ))/12;

	    //resultado
	    System.out.println("El area del Icosaedro es: "+ area_1);
	    System.out.println("El volumen del Icosaedro es: "+Volumen);
    
     lector.close();
    
}
}
