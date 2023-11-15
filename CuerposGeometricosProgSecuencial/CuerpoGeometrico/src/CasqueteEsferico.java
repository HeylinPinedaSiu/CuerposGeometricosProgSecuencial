import java.util.Scanner;

public class CasqueteEsferico{

    public static void main(String [] args){
    Scanner lector = new Scanner(System.in);    


  //declaramos las variables 
   double area;
   double Volumen;
   double  volumem;
   double radio;
   double radioM;
   double altura;
   double aream;

   //pedimos al usuiario los datos 
   System.out.print("Ingrese la altura: ");
   altura = lector.nextDouble();

   System.out.print("Ingrese el radio Mayor: ");
   radioM = lector.nextDouble();

   System.out.print("Ingrese el radio menor: ");
   radio = lector.nextDouble();

    //hacemos las operaciones correspondientes 
    area = 2*Math.PI*radioM*altura;
    aream = Math.PI*((radio*radio)+(altura*altura));
    Volumen = Math.PI*(altura*altura)*(3*radioM-altura)/3;
    volumem = Math.PI*altura/6*(3*(radio*radio)+(altura*altura));

    //mostramos los resultados 
    System.out.println("Area en funcion del radio de la esfera: "+area);
    System.out.println("Area en funcion del radio menor: "+aream);
    System.out.println("volumen en funcion del radio de la esfera: "+Volumen);
    System.out.println("Area en funcion del radio menor: "+volumem);

    lector.close();

}

}
   
