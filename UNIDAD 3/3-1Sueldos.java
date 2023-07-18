/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.sueldos;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Sueldos {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] sueldos = new double[10];

        // Pedir los 10 sueldos
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el sueldo " + (i + 1) + ": ");
            sueldos[i] = scanner.nextDouble();
        }

        // Calcular la suma de los sueldos
        double sumaSueldos = 0;
        for (double sueldo : sueldos) {
            sumaSueldos += sueldo;
        }

        // Contar cuántos sueldos son mayores a 1000
        int contadorSueldosMayores = 0;
        for (double sueldo : sueldos) {
            if (sueldo > 1000) {
                contadorSueldosMayores++;
            }
        }

        // Calcular el promedio de los sueldos
        double promedioSueldos = sumaSueldos / sueldos.length;

        // Encontrar el sueldo máximo y mínimo
        double sueldoMaximo = sueldos[0];
        double sueldoMinimo = sueldos[0];
        for (double sueldo : sueldos) {
            if (sueldo > sueldoMaximo) {
                sueldoMaximo = sueldo;
            }
            if (sueldo < sueldoMinimo) {
                sueldoMinimo = sueldo;
            }
        }

        // Mostrar los resultados
        System.out.println("Suma de sueldos: " + sumaSueldos);
        System.out.println("Cantidad de sueldos mayores a 1000: " + contadorSueldosMayores);
        System.out.println("Promedio de sueldos: " + promedioSueldos);
        System.out.println("Sueldo máximo: " + sueldoMaximo);
        System.out.println("Sueldo mínimo: " + sueldoMinimo);
    }
}