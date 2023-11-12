import java.util.Scanner;
public class CasqueteEsferico { 
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);

    //solicitar variables del casquete
    double  A_casquete;
    // double altura;
    double altura_c;
    double Radio_c;
    double radio_c;
    double Volumen_casquete;

      //solicitamos los datos de entrada
     System.out.println( "Digite la altura del casquete: ");
     altura_c = lector.nextDouble();
     
     //Area del casquete
     radio_c = altura_c;
     Radio_c = (radio_c*radio_c + altura_c*altura_c) / (2*altura_c);
     A_casquete = 2 * Math.PI * Radio_c * altura_c;
 
     //volumen del casquete
     Volumen_casquete = (Math.PI * (altura_c*altura_c) * ((3*Radio_c) - altura_c)) / 3;
     
     //resultados del casquete
     
     System.out.println ("El area del casquete es: "+A_casquete);
     System.out.println ("volumen del casquete es: "+ Volumen_casquete);
     
     lector.close();
    
}
}
