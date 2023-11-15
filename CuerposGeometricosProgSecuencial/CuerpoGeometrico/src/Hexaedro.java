import java.util.Scanner;

public class Hexaedro{

    public static void main(String [] args) throws Exception{
    Scanner lector = new Scanner(System.in);

    //declaramos las variables 
    int Arista;
    double area;
    double volumen;
    double diagonal;

    //pedimos los datos al usuario 
    System.out.print("Ingrese el valor de la arista del Hexaedro: ");
    Arista = lector.nextInt();

    //hacemos las operaciones 
    area = (6*(Arista*Arista));
    volumen = (Arista*Arista*Arista);
    diagonal = (Arista*Math.sqrt(3));

    //mostramos los resultados 
    System.out.println("El area del Hexaedro es: "+area); 
    System.out.println("El volumen del Hexaedro es: "+volumen);
    System.out.println("La diagonal del Hexaedro es: "+area);
    
      lector.close();

    }


}
