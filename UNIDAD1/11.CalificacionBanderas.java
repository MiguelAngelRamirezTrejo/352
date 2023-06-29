/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calificacionbanderas;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class CalificacionBanderas {

    public static void main(String[] args) {
              Scanner Guardado =new Scanner(System.in);
    int Calificacion1=0;
    int  Calificacion2=0;
    int  Calificacion3=0;
    int  Calificacion4=0;
    int  Calificacion5=0;
    boolean bandera1; 
    boolean bandera2; 
    boolean bandera3; 
    boolean bandera4; 
    boolean bandera5; 
    
         
   System.out.println("Introduce la Calificacion 1:");
    Calificacion1 = Guardado.nextInt();
   System.out.println("Introduce la Calificacion 2:");
    Calificacion2 = Guardado.nextInt();
   System.out.println("Introduce la Calificacion 3:");
    Calificacion3 = Guardado.nextInt();
   System.out.println("Introduce la Calificacion 4:");
    Calificacion4 = Guardado.nextInt();
   System.out.println("Introduce la Calificacion 5:");
    Calificacion5 = Guardado.nextInt();
    
    
       bandera1=false;
       bandera1=(Calificacion1<=6);
       System.out.println("Calificiacion1 Reprobatoria:"+bandera1);
      
       bandera1=true;
       bandera1=(Calificacion1>=7);
       System.out.println("Calificiacion1 Aprovatoria:"+bandera1);
//********************

       bandera2=false;
       bandera2=(Calificacion2<=6);
       System.out.println(" Calificiacion2 Reprobatoria:"+bandera2);
      
       bandera2=true;
       bandera2=(Calificacion2>=7);
       System.out.println("Calificiacion2  Aprovatoria:"+bandera2);
    //********************
    
       bandera3=false;
       bandera3=(Calificacion3<=6);
       System.out.println("Calificiacion3  Reprobatoria:"+bandera3);
       
       bandera3=true;
       bandera3=(Calificacion3>=7);
       System.out.println("Calificiacion3 Aprovatoria:"+bandera3);
     //********************
     
       bandera4=false;
       bandera4=(Calificacion4<=6);
       System.out.println("Calificiacion4 Reprobatoria:"+bandera4);
       
       bandera4=true;
       bandera4=(Calificacion4>=7);
       System.out.println("Calificiacion4 Aprovatoria:"+bandera4);
      //********************
      
      
       bandera5=false;
       bandera5=(Calificacion5<=6);
       System.out.println("Calificiacion5 Reprobatoria:"+bandera5);
       
       bandera5=true;
       bandera5=(Calificacion5>=7);
       System.out.println("Calificiacion5 Aprovatoria:"+bandera5);





}

}