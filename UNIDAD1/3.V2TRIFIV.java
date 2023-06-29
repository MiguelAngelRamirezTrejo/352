/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.v2trifiv;

/**
 *
 * @author migue
 */
public class V2TRIFIV {

    public static void main(String[] args) {
   //Declaracion de variables
       int numero;
       int mult3;
       int mult5;
       BufferdReader bufEntrada= new BufferdReader (new InputStreamReader (System.in));
       //Entrada de datos 
       System.out.println("Dame el numero");
       numero=Integer.parseInt(bufEntrada.readLine());
       //Procesamiento de datos 
       mult3=numero%3;
       mult5=numero%5;
       //Salida de datos 
       else if(mult3==0){System.out.println("TRI");}
               else if(mult5==0){System.out.println("FIV");}
               else if(mult3==0 && mult5==0){System.out.println("TRIFIV");}
    }
}
