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
public class TipodeCambio {
    public static void main(String[] args) {
        double cambio = 3.75, monto;
           Scanner sc = new Scanner (System.in);
   System.out.println("Introduce el Dolar a cambiar 3.75: ");
   monto = sc.nextDouble();
   System.out.println("Tus " + monto + " Dolares, son " + (monto * cambio) + " Soles");
        
        
    }
    
}
