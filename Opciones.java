import java.util.ArrayList;
import java.util.Scanner;

public class Opciones {
   
   public class CargarListado {
    public static void cargar(ArrayList<String> productos, Scanner teclado) {
        System.out.println("¡Comencemos la carga!");
        String respuesta;
        do {
            System.out.println("Ingrese un producto:");
            String item = teclado.nextLine();
            productos.add(item);

            do {
                System.out.println("¿Desea ingresar otro producto? (s/n)");
                respuesta = teclado.nextLine();
            } while (!(respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n")));
        } while (respuesta.equalsIgnoreCase("s"));

        Volver.volver();
    }
}

public class ConsultarProducto {
    public static void consultar(ArrayList<String> productos, Scanner teclado) {
        String respuesta;
        do {
            System.out.println("¿Qué producto desea consultar?");
            String palabra = teclado.nextLine();
            int indice = productos.indexOf(palabra);

            if (indice != -1) {
                System.out.println("El producto " + palabra + " se encuentra en la lista");
            } else {
                System.out.println("El producto " + palabra + " no se encuentra en la lista");
            }

            do {
                System.out.println("¿Desea consultar otro producto? (s/n)");
                respuesta = teclado.nextLine();
            } while (!(respuesta.equalsIgnoreCase("s") || respuesta.equalsIgnoreCase("n")));
        } while (respuesta.equalsIgnoreCase("s"));

        Volver.volver();
    }
}

public class ListarProductos {
    public static void listar(ArrayList<String> productos) {
        for (String elemento : productos) {
            System.out.println(elemento);
        }

        Volver.volver();
    }
}
}
