/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.funmayordeedad;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Funmayordeedad {

    public static void main(String[] args) {
        //Declaracion de variables
        Scanner entrada = new Scanner (System.in);
        int numero;
        //Entrada de datos
        System.out.println("Dame tu edad: ");
        numero = entrada.nextInt();
        //Salida de datos
        System.out.println(retornaMultiplo(numero));
    }
    
    public static String retornaMultiplo(int numero){
        //Declaracion de variables
        int edad;
        //Procesamiento de datos
          edad=numero;
        //Salida de datos
       if(edad>=18)
       {
         
           return"Mayor de edad";
       }
       
        return"Menor de edad";
                
        
    }
}