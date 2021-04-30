package proyecto.pkgfinal;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaracion e inicializacion de matrices
        int[][] matrizA = new int[4][6];
        int[][] matrizB = new int[4][6];
        // Declaracion e inicializacion de variables
        int primoMayor = 0;
        int repetidor=0;
        // Ingresar los valores de la matriz A
        System.out.println("Ingresar los valores de la matriz A");
        ingresarmatriz(matrizA);
        // Ingresar los valores de la matriz B
        System.out.println("Ingresar los valores de la matriz B");
        ingresarmatriz(matrizB);
        // Presentar la matriz A
        System.out.println("MATRIZ A");
        presentarMatriz(matrizA);
        // Presentar la matriz B
        System.out.println("MATRIZ B ");
        presentarMatriz(matrizB);
        // Proceso para saber cual es el mayor de los primos de una matriz en otra 
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                if (comprobarprimo(matrizA[i][j])) {
                    int mayor=matrizA[i][j];
                    for (int k = 0; k < 4; k++) {
                        for (int l = 0; l < 6; l++) {
                            int actual=matrizA[k][l];
                            if (comprobarprimo(actual)) {
                                if (actual > mayor) {
                                    mayor=actual;
                                }
                            }
                        }
                    }
                    primoMayor=mayor;
                }
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                if (primoMayor==matrizB[i][j]) {
                    repetidor++;
                }
            }
        }
        System.out.println("El numero primo "+primoMayor+" de la primera matriz se repite "+repetidor+" en la segunda matriz");   
    }
    // Proceso para ingresar la matriz
    static void ingresarmatriz(int matriz[][]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Ingresar el elemento de la posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    // Proceso para presentar la matriz
    static void presentarMatriz(int matriz[][]){
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
    // Proceso para comprobar primo
    static boolean comprobarprimo(int numero) {
        boolean valido = false;
        int cont=0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i ==0) {
                cont = cont + 1;
            }
        }
        if (cont == 2) {
            valido=true;
        }
        return valido;
    }
}