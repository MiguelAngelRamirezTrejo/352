/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.determinaetapas;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Determinaetapas {

    public static void main(String[] args) {
       Pedir();
Resultado();
    }
    public static void Pedir(){
        //pedir datos
           Scanner Guardado =new Scanner(System.in);
            System.out.println("Dame Edad:");
        int Edad = Guardado.nextInt();
    }
    public static void Resultado(){
        int Edad=0;
        //operaciones
        if (Edad<=5 && Edad >=0  )
        {
           System.out.println("Eres un infante");  
        }
   
          if (Edad<=17 && Edad>=6)
        {
           System.out.println("Eres un niño");  
        }
            if (Edad>=18)
        {
           System.out.println("Eres un adolecente/adulto");  
        }
             if (Edad<0)
        {
           System.out.println("No puedes crecer de manera negativa");  
        }
    }
}