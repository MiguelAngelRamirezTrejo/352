/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.presenciaoperadores;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class PresenciaOperadores {

    public static void main(String[] args) {
              calcularoperaciones();  
     
    
    
    } 
        
 public static void calcularoperaciones(){
       
     //Entrada de datos
      double a,b,c,d,f,g,h,j,e,i,m,n,q,r,s;
      float x,y,p;
      int opci;
   Scanner laura = new Scanner(System.in);
   System.out.println("Dame los Valores:");
             System.out.println("ValorA:"); 
                a = laura.nextInt();
            System.out.println("ValorB:");  
                b = laura.nextInt();
            System.out.println("ValorC:"); 
                c = laura.nextInt();
            System.out.println("ValorD:");
                d = laura.nextInt();
            System.out.println("ValorE:"); 
                e = laura.nextInt();
           System.out.println("ValorF:");  
                f = laura.nextInt();
            System.out.println("ValorG:");  
                g = laura.nextInt();
            System.out.println("ValorH:");
                h = laura.nextInt();
            System.out.println("ValorI:");  
                i = laura.nextInt();
            System.out.println("ValorJ:"); 
                j = laura.nextInt();
            System.out.println("ValorX:"); 
                x =laura.nextInt();
            System.out.println("valorY:"); 
                y = laura.nextInt();
            System.out.println("ValorM:"); 
                m = laura.nextInt();    
            System.out.println("ValorN:"); 
                n = laura.nextInt();  
            System.out.println("ValorS:"); 
                s = laura.nextInt(); 
            System.out.println("ValorP:"); 
                p = laura.nextInt(); 
            System.out.println("ValorQ:"); 
                q = laura.nextInt(); 
            System.out.println("ValorR:"); 
                r = laura.nextInt(); 

 // Ejercicio A
double calcularA;
calcularA=((1.5)+(1.3));
System.out.println("a)"+ calcularA);

// Ejercicio B
double calcularB;
calcularB= ((1/(x-5)) - ((3*x*y)/4));
System.out.println("b)"+ calcularB);

// Ejercicio C
double calcularC;
calcularC= ((.5)+7);
System.out.println("c)"+ calcularC);

// Ejercicio D
double calcularD;
calcularD=(.5+7);
System.out.println("d)"+ calcularD);

// Ejercicio E
double calcularE;
calcularE= (((a*a) / (b-c))+ (d-e) / (f-((g*h) / j)));
System.out.println("e)"+ calcularE);
// Ejercicio F
double calcularF; 
calcularF= ((m/n)+p);
System.out.println("f)"+ calcularF);
//Ejercicio G
double calcularG; 
calcularG= (m+(n/(p-q)));
System.out.println("g)"+ calcularG);

// Ejercicio H
double calcularH; 
calcularH = (((a*a)/(b*b))+ ((c*c)/(d*d)));
System.out.println("H)"+ calcularH);

// Ejercicio I
double calcularI; 
calcularI = ((m+(n/p))/(q-(r/s)));
System.out.println("i)"+ calcularI);

// Ejercicio J
double calcularJ; 
calcularJ = (((3*a)+b)/c-(d+(5*e))/(f+(g/(2*h))));
System.out.println("j)"+ calcularJ);

// Ejercicio K
double calcularK; 
calcularK = (((a*a)+(2*a*b)+(b*b))/((1/(x*x))+2));
System.out.println("k)"+ calcularK);

    
        
        }
}
