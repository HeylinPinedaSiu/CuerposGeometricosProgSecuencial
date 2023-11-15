import java.util.Scanner;

public class Octaedro{

    public static void main(String []args){
    Scanner lector = new Scanner(System.in);
    
	//declaramoslas varibles 
    int Arista;
    double areaTotal;
     double AreaCara;
	 double volumen;

	 //pedimos los datos al usuario
    System.out.print("Ingrese el valor de la arista: ");
    Arista = lector.nextInt();
    
	//hacemos las operaciones 
    areaTotal  = (2*(Arista*Arista)*Math.sqrt(3));
    AreaCara = areaTotal/8;
    volumen = Math.sqrt(2)/3*(Arista*Arista*Arista);

	//mostramos los resultados 
     System.out.println("El valor del area Total es: "+areaTotal);
     System.out.println("El valor del area de la cara es: "+AreaCara);
     System.out.println("El valor del volumen es: "+volumen);

     lector.close();
    }
}
