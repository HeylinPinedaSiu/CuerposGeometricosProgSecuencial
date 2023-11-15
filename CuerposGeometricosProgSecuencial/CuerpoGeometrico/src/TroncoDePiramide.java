import java.util.Scanner;
public class TroncoDePiramide{

    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

    //declaracion de variables
    double Al;
    double Areatotal;
    double  Volumen;
     double  Perimetro_B1;
     double  Perimetro_b;
     double  Area_p1;
    double  Area_B1;
     double  Area_b;
     double  altura;
     double  lateral;
     double  Latera_1;
     double  apot;
 
     //solicitar las variables
     System.out.println("Digite la altura del Tronco de Piramide: ");
      altura = lector.nextDouble();
 
     System.out.println("Digite la longitud del lado menor del Tronco de Piramide: ");
      lateral = lector.nextDouble();
 
      System.out.println("Digite la longitud del lado mayor del Tronco de Piramide: ");
    Latera_1 = lector.nextDouble();
  
 
    // operacones area lateral
     apot = (Latera_1 - lateral) / 2;
     Area_p1 = Math.sqrt(apot * apot + altura * altura);
     Perimetro_B1 = (Latera_1 * altura) / 2;
    Perimetro_b = (lateral * altura) / 2;
     Al = ((Perimetro_B1 + Perimetro_b) / 2) * Area_p1;
 
    //area total
    Area_B1 = 4 * lateral;
    Area_b = 4 * Latera_1;
      Areatotal = Al + Area_B1 + Area_b;
 
    //volumen
    Volumen = (altura * ( Area_B1 + Area_b + Math.sqrt(Area_B1 * Area_b))) / 3;
 
     //resultado
    System.out.println("El Area Lateral del tronco de piramide es: "+ Al);
     System.out.println("El Area Total del tronco de piramide es: "+ Areatotal);
     System.out.println("El volumen del tronco de piramide es: "+ Volumen);
     lector.close();
}
}