/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas;
import java.util.List;
import java.util.Scanner;


/**Escribe un programa que convierte una
 * cantidad de años a dias
 * (suponiendo que un año tiene 65 dias)
 *
 * 
 */
public class Tarea8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Ingrese la cantidad de anos: ");
        int años = scanner.nextInt();

        
        int diasPorAños = 365;

       
        int totalDias = años * diasPorAños;

     
        System.out.printf("La cantidad de dias es: %d\n", totalDias);
        
        
    }
    
}
