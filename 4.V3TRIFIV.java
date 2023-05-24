/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.v3trifiv;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class V3TRIFIV {

    private static Readable source;

    public static void main(String[] args) {
   //Declaracion de variables
        Scanner entrada = new Scanner (System.in);
        int numero;
        //Entrada de datos
        System.out.println("Dame el numero: ");
        numero = entrada.nextInt();
        //Salida de datos
        System.out.println(retornaMultiplo(numero));
    }
    
    public static String retornaMultiplo(int num){
        //Declaracion de variables
        int mult3;
        int mult5;
        //Procesamiento de datos
        mult3 = num % 3 ;
        mult5 = num % 5 ;
        //Salida de datos
        if (mult3 == 0 && mult5 == 0){
            return "TRIFIV";
        } else if (mult3==0){
            return "Tri";
        } else if (mult5==0){
            return "Fiv";
        }
        return "Ningun caso";
    }
}