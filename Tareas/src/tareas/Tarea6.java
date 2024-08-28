/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Tarea6 {
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
       
        double f,c;
        System.out.println("Ingrese los Celsius ");
        c = input.nextDouble();
        f = 9/5.0 * c + 32;
        
        System.out.println(c+" grados Celcius equivalen a " + f+
                " grados Fahrenheit");
       
        
        
    }
    
}
