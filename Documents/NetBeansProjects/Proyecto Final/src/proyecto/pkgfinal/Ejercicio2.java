package proyecto.pkgfinal;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrizA = new int[4][6];
        int[][] matrizB = new int[4][6];
        int primoMayor = 0;
        int repetidor=0;
        System.out.println("Ingresar los valores de la matriz A");
        ingresarmatriz(matrizA);
        System.out.println("Ingresar los valores de la matriz B");
        ingresarmatriz(matrizB);
        System.out.println("MATRIZ A");
        presentarMatriz(matrizA);
        System.out.println("MATRIZ B ");
        presentarMatriz(matrizB);
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
    static void ingresarmatriz(int matriz[][]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("Ingresar el elemento de la posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    static void presentarMatriz(int matriz[][]){
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j]+"\t");
                
            }
            System.out.println();
        }
    }
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