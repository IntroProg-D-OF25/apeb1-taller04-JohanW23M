import java.util.Scanner;
public class Algoritmo_8 {
    static Scanner entrada = new Scanner (System.in);
    public static void main(String[] args) {
       double servicio1, servicio2, servicio3, servicio4, descuento, total_servicios;
       
        System.out.print("Ingresa cuanto pagas por Netflix: " );   
        servicio1 = entrada.nextDouble();
        System.out.print("Ingresa cuanto pagas por Yuotube premium: ");
        servicio2 = entrada.nextDouble();
        System.out.print("Ingresa cunto pagas por Dopbox: ");
        servicio3 = entrada.nextDouble();
        System.out.print("Ingresa cunto pagas por Spotify: ");
        servicio4 = entrada.nextDouble();
        
        descuento =(servicio1 + servicio2 + servicio3 + servicio4) * 0.2;
       total_servicios = (servicio1 + servicio2 + servicio3 + servicio4) - descuento;
        System.out.println("total a pagar de servicios = " + total_servicios);
    }
}
/**
 * debug:
Ingresa cuanto pagas por Netflix: 1
Ingresa cuanto pagas por Yuotube premium: 4
Ingresa cunto pagas por Dopbox: 3,5
Ingresa cunto pagas por Spotify: 6
total a pagar de servicios = 11.6
BUILD SUCCESSFUL (total time: 11 seconds)
 */