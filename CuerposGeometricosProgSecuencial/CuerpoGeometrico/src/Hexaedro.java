import java.util.Scanner;
public class Hexaedro {
     
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

      //declaracion de variables
	double Area_1;
   double  Volumen;
   double  Diagonal;
   double  ar2; 

   //solicitar las variables
   System.out.println("Ingrese el valor de la longitud de lado: ");
   ar2 = lector.nextDouble();

   //Proceso 
   Area_1  = 6*(ar2 * ar2);
   //volumen
   Volumen = ar2  * ar2 * ar2;

   //diagonal
   Diagonal = ar2 * Math.sqrt(3);
   
   //resultado
   System.out.println("El area del hexaedro es: "+Area_1);
   System.out.println("volumen del hexaedro es: "+ Volumen);
   System.out.println("La diagonal del hexaedro es: "+Diagonal);

   lector.close();

}
}
