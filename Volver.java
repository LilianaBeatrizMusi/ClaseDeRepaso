import java.util.Scanner;

public class Volver {

    public static void volver(){
        String respuesta;
        do{
            Scanner teclado = new Scanner (System.in);
            System.out.println("Para volver al menú principal presione S, para salir de la app presione Q");
            respuesta = teclado.nextLine();
            
        }while(!(respuesta.equalsIgnoreCase("s")|| respuesta.equalsIgnoreCase("q")));

        // Analizamos si contesta con Q
        if(respuesta.equalsIgnoreCase("q")){
            System.out.println("Gracias por utilizar esta app");
            System.out.println("** El programa ha finalizdo **");
            System.exit(0);
        }


    }
}