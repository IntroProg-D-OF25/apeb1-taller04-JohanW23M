import java.util.Scanner;
public class Algoritmo_1 {
    static Scanner entrada = new Scanner (System.in);
    public static void main(String[] args) {
        
        double base_t, altura_t,area_t;
        System.out.print("Ingresa la base:");
        base_t = entrada.nextDouble();
        System.out.print("Ingresa la altura; ");
        altura_t = entrada.nextDouble();
        
        area_t = (base_t * altura_t)/2;
       
        System.out.println("El area del trisngulo es " + area_t);
       
    }
}
 /**
         * Salida de resultados:
         * debug:
            Ingresa la base:6
            Ingresa la altura; 4
            El area del trisngulo es 12.0
            BUILD SUCCESSFUL (total time: 26 seconds)
         */