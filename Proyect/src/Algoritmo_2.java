import java.util.Scanner;

public class Algoritmo_2 {
    static Scanner entrada = new Scanner (System.in);
    public static void main(String[] args) {
        double hijo1, hijo2, hijo3, gasto_total;
        
        System.out.print("Ingresa el gasto del primer hijo: " );   
        hijo1 = entrada.nextDouble();
        System.out.print("Ingresa el gasto del segundo hijo: ");
        hijo2 = entrada.nextDouble();
        System.out.print("Ingresa el gasto del tercer hijo: ");
        hijo3 = entrada.nextDouble();
        
        gasto_total = hijo1 + hijo2 + hijo3;
        System.out.println("gasto total de los hijos = " + gasto_total);
    }
}
/***
 * Salida de resultados: 
 * debug:
Ingresa el gasto del primer hijo: 1
Ingresa el gasto del segundo hijo: 2
Ingresa el gasto del tercer hijo: 100,1
gasto total de los hijos = 103.1
BUILD SUCCESSFUL (total time: 11 seconds)
 */