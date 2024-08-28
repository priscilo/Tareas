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
public class Tarea1 {
    public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in); 
      double radio,diametro,area;
        System.out.println("Dame el radio del circulo: ");
        radio=teclado.nextDouble();
        diametro=radio*2;
        area=(3.1416)*(radio*radio);
        System.out.println("El diametro del circulo es: "+diametro);
        System.out.println("El area del circulo es: "+area);
    }
    
}
