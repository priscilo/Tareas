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
public class Tarea3 {
    public static void main(String[] args) {
        
        double segundo = 60, monto;
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el minuto: ");
        monto = sc.nextDouble();
        System.out.println("Tus "+monto + " Minutos, son: " + (monto*segundo) +" Segundos");
        
    }
    
}
