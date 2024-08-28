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
public class Minutosasegundos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("minuto: ");
        double minuto =sc.nextDouble();
        double convertir = minuto * 60;
        System.out.println(convertir + " s");
        
    }
    
}
