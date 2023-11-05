
/* Este programa me permite almacenar un listado de compras en un AL 
* cada dato se cargará por medio del teclado 
* Tendrá un menú donde nos dé opciones de:
* buscar los productos mediante palabras claves
* imprimir el array completo, 
* seguir cargando datos o 
* salir.
*
* En este práctico repasaremos:
* -Objeto ArrayLists
* -Objeto Scanner
* -Bucle for-each
* -Bucle do-while
*/
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<String> productos = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        System.out.println("** Bienvenidos a la app del super **");
        System.out.println("");

        boolean irMenu;
        do {
            irMenu = Menu.mostrarMenu(productos, teclado);
        } while (irMenu);

        teclado.close();
    }
}
