import java.util.Scanner;
public class Algoritmo_6 {
    static Scanner entrada = new Scanner (System.in);
    public static void main(String[] args) {
       double monto_prestamo, interes_mensual, numerador, denominador, pago_mensual;
        System.out.print("Ingresa el monto del prestamo: " );   
        monto_prestamo = entrada.nextDouble();
        System.out.print("Ingresa el interes mensual: ");
        interes_mensual = entrada.nextDouble() / 100;
  
        numerador = interes_mensual * Math.pow((1 + interes_mensual), 12);
        denominador = Math.pow((1 + interes_mensual), 12) - 1;
       pago_mensual = (monto_prestamo * (numerador /(denominador)));
       System.out.println("El pago mensual es: " + pago_mensual);
      }
}

/**
 * Salida:
 * compile-single:
Ingresa el monto del prestamo: 10000
Ingresa el interes mensual: 2
El pago mensual es: 945.5959662295144
debug-single:
BUILD SUCCESSFUL (total time: 9 seconds)

 */