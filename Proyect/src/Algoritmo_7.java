import java.util.Scanner;
public class Algoritmo_7 {
    static Scanner entrada = new Scanner (System.in);
    public static void main(String[] args) {
       double costo_k, kilovatio_consumido, descuento, precio_planilla;
       
        System.out.print("Ingresa el costo del kilovatio/hora: " );   
        costo_k = entrada.nextDouble();
        System.out.print("Ingresa la cantidad de kilovatios consumidos: ");
        kilovatio_consumido = entrada.nextDouble();
        
        
        descuento =(kilovatio_consumido * costo_k ) * 0.10;
        precio_planilla =(kilovatio_consumido * costo_k ) - descuento ;
        System.out.println("Total a pagar = " + precio_planilla);
    }
}