/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gestionfacturas;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class GestionFacturas {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadFacturas = 5;
        int[] numFacturas = new int[cantidadFacturas];
        String[] codProductos = new String[cantidadFacturas];
        int[] cantidades = new int[cantidadFacturas];
        double[] precios = new double[cantidadFacturas];

        // Capturar las facturas
        for (int i = 0; i < cantidadFacturas; i++) {
            System.out.println("Factura " + (i + 1));
            System.out.print("Número de factura: ");
            numFacturas[i] = scanner.nextInt();
            System.out.print("Código del producto: ");
            codProductos[i] = scanner.next();
            System.out.print("Cantidad de litros comprados: ");
            cantidades[i] = scanner.nextInt();
            System.out.print("Precio del producto: ");
            precios[i] = scanner.nextDouble();
        }

        // Calcular el importe total de las facturas
        double importeTotal = 0;
        for (int i = 0; i < cantidadFacturas; i++) {
            importeTotal += cantidades[i] * precios[i];
        }

        // Calcular la cantidad de litros comprados del producto 1
        int litrosProducto1 = 0;
        for (int i = 0; i < cantidadFacturas; i++) {
            if (codProductos[i].equals("1")) {
                litrosProducto1 += cantidades[i];
            }
        }

        // Contar las facturas mayores a 10000 pesos
        int facturasMayores10000 = 0;
        for (int i = 0; i < cantidadFacturas; i++) {
            if (cantidades[i] * precios[i] > 10000) {
                facturasMayores10000++;
            }
        }

        // Encontrar el valor máximo y mínimo de las facturas
        double maxFactura = precios[0] * cantidades[0];
        double minFactura = precios[0] * cantidades[0];
        for (int i = 1; i < cantidadFacturas; i++) {
            double factura = precios[i] * cantidades[i];
            if (factura > maxFactura) {
                maxFactura = factura;
            }
            if (factura < minFactura) {
                minFactura = factura;
            }
        }

        // Mostrar el resumen de ventas
        System.out.println("\nResumen de Ventas:");
        System.out.println("Importe total de las facturas: " + importeTotal);
        System.out.println("Litros comprados del producto 1: " + litrosProducto1);
        System.out.println("Facturas mayores a 10000 pesos: " + facturasMayores10000);
        System.out.println("Valor máximo de las facturas: " + maxFactura);
        System.out.println("Valor mínimo de las facturas: " + minFactura);
    }
}