package proyecto.pkgfinal;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Declaracion e inicializacion de variables
        int n = 0;
        
        // Limite del vector
        System.out.println("Ingrese el tamaño del vector");
        n = sc.nextInt();
        
        //Declarar vector
        int[] vector = new int[n];

        // Ingreso de datos del vector
        System.out.println("Ingrese los elementos del vector");
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el elemento A[" + i + "] ");
            vector[i] = sc.nextInt();
        }
        int numero_buscar;
        boolean n_encontrado = false;
        
        // Ingreso del numero a verificar
        System.out.println("Ingresar el numero que desea verificar si se encuentra en el vector ingresado anteriormente");
        numero_buscar = sc.nextInt();
        
        // Proceso para verificar el numero en el vector mayor a 10
        if (n >= 10) {
            for (int i = 0; i <= 10 - 1; i++) {
                if (vector[i] == numero_buscar) {
                    n_encontrado = true;
                    if (n_encontrado) {
                        System.out.println("El numero " + numero_buscar + " si se encuentra en el vector, en la posicion " + i);
                    } else {
                        System.out.println("El numero " + numero_buscar + " no se encuentra en el vector ");
                    }
                }
            }
        }
        // Proceso para verificar el numero en el vector menor a 10
        if (n < 10) {
            for (int i = 0; i < n ; i++) {
                if (vector[i] == numero_buscar) {
                    n_encontrado = true;
                    if (n_encontrado) {
                        System.out.println("El numero " + numero_buscar + " si se encuentra en el vector, en la posicion " + i);
                    } else {
                        System.out.println("El numero " + numero_buscar + " no se encuentra en el vector ");
                    }
                }
            }
        }
    }
}
