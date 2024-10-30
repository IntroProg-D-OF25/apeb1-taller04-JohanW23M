import java.util.Scanner;
public class Algoritmo_4 {
    static Scanner entrada = new Scanner (System.in);
    public static void main(String[] args) {
       int minutos_consumidos;
        double costo_minuto, valor_total;
        
        System.out.print("Ingresa los minutos consumidos: " );   
        minutos_consumidos = entrada.nextInt();
        System.out.print("Ingresa el costo por minuto: ");
        costo_minuto = entrada.nextDouble();
        
        valor_total = minutos_consumidos * costo_minuto;
        System.out.println(" total a pagar = " + valor_total);
    }
}

