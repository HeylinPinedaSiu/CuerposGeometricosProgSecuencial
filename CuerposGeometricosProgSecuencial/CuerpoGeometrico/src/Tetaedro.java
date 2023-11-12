import java.util.Scanner;
public class Tetaedro {
    public static void main(String[] args) throws Exception {
     Scanner lector = new Scanner(System.in);

    //declaracion de variables
	//double area;
    //double A2;
    double A1;
    double  Volumen;
    double altura;
     double A; 
 
     //solicitar las variables
     System.out.println("Digite la longitud de lado: ");
     A1 = lector.nextDouble();
 
     //Proceso 
     A = A1 * A1 * A1  * Math.sqrt(3);
 
     //volumen
     Volumen = (Math.sqrt(2) * (A1 * A1 * A1 ))/3;
 
     //altura
     altura = (A1  * Math.sqrt(6)) / 3;
 
     //resultado
     System.out.println("El area del tetraedro es: " + A);
 
     lector.close();
  }

}
