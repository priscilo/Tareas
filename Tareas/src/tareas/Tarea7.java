package tareas;
//Escribe un programa que calcule el costo total
//de una compra dada la cantidad de articulos y el
//precio unitario de cada uno 



        import java.util.List;
        import java.util.Scanner;

public class Tarea7 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Precios de los productos
        double precioHamburguesa = 12.00;
        double precioHamburguesaQueso = 15.00;
        double precioHamburguesaDoble = 17.00;
        double precioPapas = 5.00;
        double precioMalteada = 6.00;
        double precioRefresco = 5.00;
        double precioCafe = 6.00;

        // Cantidades consumidas
        System.out.print("Cantidad de hamburguesas es 12.00 : ");
        int cantHamburguesa = scanner.nextInt();
        System.out.print("Cantidad de hamburguesas con queso es 15.00 : ");
        int cantHamburguesaQueso = scanner.nextInt();
        System.out.print("Cantidad de hamburguesas dobles es 17.00 : ");
        int cantHamburguesaDoble = scanner.nextInt();
        System.out.print("Cantidad de papas a la francesa es 5.00 : ");
        int cantPapas = scanner.nextInt();
        System.out.print("Cantidad de malteadas 6.00: ");
        int cantMalteada = scanner.nextInt();
        System.out.print("Cantidad de refrescos 5.00 : ");
        int cantRefresco = scanner.nextInt();
        System.out.print("Cantidad de cafes 6.00: ");
        int cantCafe = scanner.nextInt();

        // Cálculo del total
        double total = (cantHamburguesa * precioHamburguesa) +
                       (cantHamburguesaQueso * precioHamburguesaQueso) +
                       (cantHamburguesaDoble * precioHamburguesaDoble) +
                       (cantPapas * precioPapas) +
                       (cantMalteada * precioMalteada) +
                       (cantRefresco * precioRefresco) +
                       (cantCafe * precioCafe);

        // Mostrar el total
        System.out.printf("El total de la cuenta es: S/%.2f\n", total);



}
}
