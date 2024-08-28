/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas;
//Escribe un programa que calcule el costo total
//de una compra dada la cantidad de articulos y el
//precio unitario de cada uno
import java.util.List;
import java.util.Scanner;

//
public class NewClass23 {
public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         // Precios de los productos
         double precioMesa = 200;
         double precioSilla = 50;
         double precioCama = 600;
         double precioRepostero = 700;
         
         //Cantidad consumidas
         System.out.print("Cantidad mesas es 200.00 :");
         int cantMesa = scanner.nextInt();
         System.out.print("Cantidad sillas es 50.00 :");
         int cantSilla = scanner.nextInt();
         System.out.print("Cantidad camas es 600.00 :");
         int cantCama = scanner.nextInt();
         System.out.print("Cantidad reposteros es 700.00 :");
         int cantRepostero = scanner.nextInt();
         
         // Cálculo del total
         double total = (cantMesa * precioMesa) +
                        (cantSilla * precioSilla) +
                        (cantCama * precioCama) +
                        (cantRepostero * precioRepostero);
                 
 //Mostrae el total
        System.out.print("El total de la cuenta es: S/ %  .2f\n"+total);
}
   
}
