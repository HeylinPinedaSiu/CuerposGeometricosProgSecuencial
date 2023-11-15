import java.util.Scanner;
public class Ortoedro {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

          //declaracion de variable
	 double area;
      double  base;
      double  cara;
      double Area_1;
      double diagonal;
      double vertice;
      
	//solicitar las variables
	System.out.println("Ingrese el valor de la longitud: ");
	area = lector.nextDouble();

	System.out.println("Ingrese el valor del ancho: ");
	base = lector.nextDouble();

	 System.out.println("Ingrese el valor de la altura: ");
	cara = lector.nextDouble();


	//Proceso angulo diedro
	Area_1 = 2 * (area * base + area * cara + base * cara);

	//diagonal
	diagonal = Math.sqrt(area * area + base * base + cara * cara);
    
	//vertice
	vertice = area * base * cara;

	//resultado
	System.out.println("El angulo diedro es: "+ Area_1);
	System.out.println("la diagonal es: "+diagonal);
	System.out.println("el vertice es: "+vertice);
    
    lector.close();  
    
}
}
