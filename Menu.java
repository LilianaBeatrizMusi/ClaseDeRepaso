import java.util.ArrayList;
import java.util.Scanner;

/**
 * Menu
 */
public class Menu {
    
    public static boolean mostrarMenu(ArrayList<String> productos, Scanner teclado) {
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1- Quiero cargar un listado");
        System.out.println("2- Quiero consultar un producto");
        System.out.println("3- Quiero ver el listado");
        System.out.println("4- Salir");

        String opcion = teclado.nextLine();

        switch (opcion) {
            case "1":
                Opciones.CargarListado.cargar(productos, teclado);
                return true;
            case "2":
                Opciones.ConsultarProducto.consultar(productos, teclado);
                return true;
            case "3":
                Opciones.ListarProductos.listar(productos);
                return true;
            case "4":
                System.out.println("Gracias por utilizar esta app");
                System.out.println("** El programa ha finalizado **");
                System.exit(0);
        }
        return false;
    }
}

    

