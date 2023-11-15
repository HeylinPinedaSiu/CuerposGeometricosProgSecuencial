import java.util.Scanner;

public class Icosaedro{
   
    public static void main(String []args){
        Scanner lector = new Scanner(System.in);

		//declaramos las variables
        int arista;
        double areaTotal;
		double areaCara;
		double volumen;

		//pedimos los datos al usuario
        System.out.print("Ingrese el valor de la arista: ");
        arista = lector.nextInt();

		//hacemos las operaciones
        areaTotal = (5*(arista*arista)*Math.sqrt(3));
        areaCara = areaTotal/20;
        volumen = ((5.0/12)*(3+ Math.sqrt(5)*arista*arista*arista));

		//mostramos los resultados 
        System.out.println("El area Toltal del Icosaedro es: " + areaTotal );
        System.out.println("Las caras del Icosaedro son : "+areaCara);
        System.out.println("El volumen del Icosaedro es: "+volumen);  
  
		lector.close();
	}
}
