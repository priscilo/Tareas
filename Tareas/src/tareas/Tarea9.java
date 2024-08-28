/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas;
import java.util.Scanner;

/*Escribe un programa que calcule el costo
de una llamada telefónica dada
su duración en minutos y el costo por minuto
 *
 * @author PC
 */
public class Tarea9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la duración de la llamada en minutos 
         System.out.print("Ingrese la duracion de la llamada en minutos: ");
         int duracion = scanner.nextInt();
         
         // Solicitar el costo por minuto
         
            System.out.println("\"Ingrese el costo por minuto: ");
         double costoPorMinuto = scanner.nextDouble();
        
          
         // Calcular el costo total de la llamada
          double costoTotal = duracion * costoPorMinuto;

         // Mostrar el costo total
        System.out.printf("El costo total de la llamada es: S/ %.2f\n", costoTotal);  
     }
    
} 
