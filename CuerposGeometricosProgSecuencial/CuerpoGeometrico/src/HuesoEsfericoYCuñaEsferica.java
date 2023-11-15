import java.util.Scanner;

public class HuesoEsfericoYCuñaEsferica{
   
    public static void main(String []args){
        Scanner lector = new Scanner(System.in);

        //declaramos las variables 
       int angulo;
       double radio;
       double area;
       double  volumen;

       //pedimos los datos al usuario 
       System.out.print("Ingrese el valor del radio: ");
       radio = lector.nextDouble();
	    
       System.out.print("ingrese el valor del angulo: ");
       angulo = lector.nextInt();

       //procesamos los datos 
       area = 4*(Math.PI*(radio*radio)*angulo/360);
       volumen = (4.0/3.0)*(Math.PI*(radio*radio*radio)*angulo/360);

       //mostramos los resultados 
       System.out.println("El area del uso esferico es: "+area);
       System.out.println("El volumen de una cuña esferica es: "+volumen);

       lector.close();

    }

}
