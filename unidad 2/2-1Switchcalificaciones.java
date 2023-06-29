/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.switchcalificaciones;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class App {

    public static void main(String[] args) {
               
        //Definir Variables
    Scanner entrada=new Scanner(System.in);
        int calificacion;
        
        //Datos de Entrada
        System.out.println("Introduce la Calificacion");
        calificacion = entrada.nextInt();
        
        //Proceso de Operacion Matematica.
        
        //Datos de Salida.
        switch(calificacion){
            case 0 -> System.out.println("Muy Mal");
            case 1, 2, 3, 4, 5 -> System.out.println("Insuficiente");
            case 6 -> System.out.println("Suficiente");
            case 7, 8 -> System.out.println("Bien");
            case 9 -> System.out.println("Notable");
            case 10 -> System.out.println("Sobre Saliente");
            default -> System.out.println("Error de Calificacion");
                 
        }
        
        
        
        
        
    }
}