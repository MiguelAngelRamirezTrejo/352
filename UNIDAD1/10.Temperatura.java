/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.temperatura;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Temperatura {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double temperatura = scanner.nextDouble();
        
        String tipoClima = determinarClima(temperatura);
        
        System.out.println("El tipo de clima es: " + tipoClima);
    }
    
    public static String determinarClima(double temperatura) {
        if (temperatura < -10) {
            return "Muy frío";
        } else if (temperatura >= -10 && temperatura < 0) {
            return "Frío";
        } else if (temperatura >= 0 && temperatura < 10) {
            return "Fresco";
        } else if (temperatura >= 10 && temperatura < 20) {
            return "Templado";
        } else if (temperatura >= 20 && temperatura < 30) {
            return "Cálido";
        } else if (temperatura >= 30 && temperatura < 40) {
            return "Caluroso";
        } else {
            return "Muy caluroso";
        }
    }
}