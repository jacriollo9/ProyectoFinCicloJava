package proyecto.pkgfinal;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanio;
        System.out.println("Ingresar el tamaño de la matriz");
        tamanio = sc.nextInt();
        int[][] matriz = new int[tamanio][tamanio];
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                System.out.print("Ingresar el elemento de la posicion [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("MATRIZ INGRESADA");
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                System.out.print(matriz[i][j]+"\t");    
            }
            System.out.println();
        }
        
        int pSilla=encontrarPuntoSilla(matriz, tamanio);
        System.out.print("La matriz tiene "+pSilla+" puntos de silla en total");
        System.out.println();
    }

    static int encontrarPuntoSilla(int matriz[][], int tamanio) {
        
        int numeroSillas = 0;
        int [] mayor=new int[tamanio];
        int [] menor=new int[tamanio];
        
        for (int i = 0; i < tamanio; i++) {
            menor[i]=matriz[i][0];
            for (int j = 0; j < tamanio; j++) {
                if(menor[i] > matriz[i][j]){
                    menor[i] = matriz[i][j];
                }
                if (i==0){ 
                    mayor[j]=matriz[i][j];
                }else
                    if (mayor[j] < matriz[i][j]){
                    mayor[j] = matriz[i][j];
                }
            }
        }
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (mayor[i]==menor[j]) {
                    numeroSillas++;
                    System.out.println("Se encontro en la posicion: ("+(i+1)+", "+(j+1)+")");
                }
            }
        }
        return numeroSillas;
    }
}

