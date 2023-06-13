/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fuemayordeedad;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Fuemayordeedad {

    public static void main(String[] args) {
         //Delaracion de variables
        int edad;
        Scanner norma =new Scanner(System.in);
        //entrada de datos
        System.out.println("Edad a calcular");
        edad=norma.nextInt();
        System.out.println(May (edad));
        //Salida
    }
    public static String May (int edad)
    {
        //Salida de datos
        if(edad>=18){
        return "Mayor de edad";
        }else if(edad<18){
         return "Menor de edad";

        }
        
        return "default";
    }
}