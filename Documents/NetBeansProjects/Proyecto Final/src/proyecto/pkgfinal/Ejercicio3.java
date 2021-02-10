package proyecto.pkgfinal;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        int contador;
        int digito;
        int i;
        boolean terminaen;
        int vector[];
        vector = new int[10];
        System.out.println("Ingrese el dígito a analizar: ");
        digito = sc.nextInt();
        contador = 0;
        terminaen = false;
        System.out.println("Ingrese los valores del vector: ");
        for (i = 1; i <= 10; i++) {
            System.out.println("Ingrese el " + i + " valor");
            vector[i - 1] = sc.nextInt();
            if (comprobardigito(vector[i - 1], digito)) {
                contador = contador + 1;
            }
        }
        System.out.println("El digito " + digito + " se repite " + contador + " veces en el vector, en las posiciones: ");
        for (i = 1; i <= 10; i++) {
            if (comprobardigito(vector[i - 1], digito)) {
                System.out.print(i + " , ");
            }
        }
    }

    public static boolean comprobardigito(double num, double digito) {
        boolean res = false;
        if ((num % 10 == digito)) {
            res = true;
        }
        return res;
    }
}
