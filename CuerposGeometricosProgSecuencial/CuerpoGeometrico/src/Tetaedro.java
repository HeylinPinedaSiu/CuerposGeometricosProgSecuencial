import java.util.Scanner;

public class Tetaedro{

    public static void main(String [] args){
    Scanner lector = new Scanner(System.in);

    //declaramos las variables 
    int arista;
    double altura,Area,volumen;

    //pedimos los datos al usuario 
   System.out.print("Ingrese el valor de la arista: ");
   arista = lector.nextInt();

   //procesamos los datos 
   Area = ((arista*arista)*Math.sqrt(3));
   altura = (arista*(Math.sqrt(6)/3));
   volumen = ((Math.sqrt(2)/12)*(arista*arista*arista));

   //mosytramos en pantalla
   System.out.println("El valor del area es: "+Area);
   System.out.println("El valor de la altura es: "+altura);
   System.out.println("El valor del volumen es: "+volumen);

   lector.close();
  }


}
