/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cifras;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Cifras {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int cifras = contarCifras(numero);

        System.out.println("El número " + numero + " tiene " + cifras + " cifras.");
    }

    public static int contarCifras(int numero) {
        int cifras = 0;
        if (numero == 0) {
            cifras = 1;
        } else {
            while (numero != 0) {
                numero = numero / 10;
                cifras++;
            }
        }
        return cifras;
    }
}