/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas;
import java.util.Scanner;

/**velocidad  Km/h a m/s
 *
 * @author PC
 */
public class Tarea4 {
    public static void main(String[] args) {
        
        double km = 1000, m;
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce km/h: ");
        m = sc.nextDouble();
        System.out.println("Velocidad "+m + " km/h, son: " + (m*km)/3600 +" m/s");
        
        
    }
    
}
