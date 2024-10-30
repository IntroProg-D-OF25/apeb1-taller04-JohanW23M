import java.util.Scanner;

public class Algoritmo_9 {
     static Scanner entrada = new Scanner (System.in);
    public static void main(String[] args) {
        float base_t, altura_t,area_t, area_c, area_r, area_total;
        
        System.out.println("Ingresa la base del triangulo: "  );
        base_t = entrada.nextFloat();
        System.out.println("Ingresa la altura del triangulo:");
        altura_t = entrada.nextFloat();
        area_t = ((base_t * altura_t)/2)* 3;
        area_c = base_t * base_t;
        area_r = base_t * altura_t;
        area_total = area_c + area_r + area_t;
        System.out.println("area_total = " + area_total);
       
                }
    
}
/***
 * Salida de resultados:
 * debug:
Ingresa la base del triangulo: 
2
Ingresa la altura del triangulo:
1
area_total = 9.0
BUILD SUCCESSFUL (total time: 4 seconds)
 */