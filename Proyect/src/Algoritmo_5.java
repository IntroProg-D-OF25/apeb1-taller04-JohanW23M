import java.util.Scanner;
public class Algoritmo_5 {
    static Scanner entrada = new Scanner (System.in);
    public static void main(String[] args) {
       double cpu, teclado, pantalla, raton, total_computadora;
       
        System.out.print("Ingresa el valor del CPU: " );   
        cpu = entrada.nextDouble();
        System.out.print("Ingresa el valor del teclado: ");
       teclado = entrada.nextDouble();
        System.out.print("Ingresa el valor de la pantalla: ");
        pantalla = entrada.nextDouble();
        System.out.print("Ingresa el valor del raton: ");
        raton = entrada.nextDouble();
       
       total_computadora = teclado + pantalla +raton  + cpu;
        System.out.println("El valor de la computadora es = " + total_computadora);
    }
}
/**
 * Salida:
 * compile-single:
Ingresa el valor del CPU: 350
Ingresa el valor del teclado: 45
Ingresa el valor de la pantalla: 20,5
Ingresa el valor del raton: 12,5
El valor de la computadora es = 428.0
debug-single:
BUILD SUCCESSFUL (total time: 26 seconds)
 */