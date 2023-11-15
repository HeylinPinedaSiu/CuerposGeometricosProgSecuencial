import java.util.Scanner;

public class Dodecaedro{

    public static void main(String [] args){
    Scanner lector = new Scanner(System.in);
   
    //declaramos las variables 
    int arista;
    double Apent;
    double area;
    double Volumen;
    double apotema;

    //pedimos losa datos al usuario 
    System.out.print("ingrese el valor de la arista: ");
    arista = lector.nextInt();


    //hacemos las operaciones 
    double alfa = 36*(Math.PI/180);
    apotema = (arista/2*Math.tan(alfa));
    area = 3*(arista*arista)*Math.sqrt(25+10*Math.sqrt(5));
    Apent = 5/2*arista*apotema;
    Volumen = 1.0/4*(15+7*Math.sqrt(5))*(arista*arista*arista);

    //mostramos los resultados 
    System.out.println("El area del Dodecaedro es: "+ area );
    System.out.println("El area de un pentagono del Dodecaedro es: "+ Apent );
    System.out.println("El volumen del Dodecaedro es: "+ Volumen);

    lector.close();



    }
}
