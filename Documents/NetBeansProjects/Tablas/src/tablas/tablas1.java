/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import java.util.Scanner;
/**
 *
 * @author Usuario iTC
 */
public class tablas1 {
   public static void main(String[] args)
    {
        Scanner Numero = new Scanner(System.in);
        int numero,j;
        System.out.print("Indica la tabla de multiplicar: ");
        numero = Numero.nextInt();
            for(j = 1; j <= 10; j++)
            {
                System.out.println(numero + " X " + j + " = " + numero*j);
            }
        System.out.println();
    }
}

