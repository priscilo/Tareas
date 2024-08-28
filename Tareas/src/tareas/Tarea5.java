/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas;
import java.util.Scanner;
//Programa que calcule el sueldo de un trabajador
//El programa mostrara el numero de horas que has trabajado
//en un mes, las horas se pagan a s/20 
public class Tarea5 {
    public static void main(String[] args) {
      int numero_1;
      int numero_2;
      int resultado;
      Scanner constructor=new Scanner(System.in);
     
  
        System.out.println("Ingrese el primer numero");
        numero_1=constructor.nextInt();
        
        System.out.println("Ingrese el segundo numero");
         numero_2=constructor.nextInt();
         
         resultado = numero_1 * numero_2;
         System.out.println("El resutado es: "+resultado);
      
      
     
      
              
     
    }
}
        