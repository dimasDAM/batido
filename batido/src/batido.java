import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;
import java.util.Scanner;

public class batido {
    static ArrayList<String> lista = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion; // INICIAMOS LA VARIABLE OPCION

        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                // case 1:
                // mirarNevera();
                // break;
                case 2:
                    llenarNevera();
                    break;
                // case 3:
                // prepararBatido();
                // break;

                // default:
                // System.out.println("Opcion no válida.");
                // break;
            }
        } while (opcion != 0);

    }

    public static void mostrarMenu() { // MOSTRAMOS UN MENU DE OPCIONES

        System.out.println("Bienvenido!");
        System.out.println("Que quieres hacer?");
        System.out.println("1. Mirar la nevera.");
        System.out.println("2. Llenar la nevera.");
        System.out.println("3. Preparar batido.");
        System.out.println("0. Salir");
    }

    public static void llenarNevera() {
        System.out.println("Que ingrediente quieres añadir? ");
        String ingrediente = sc.nextLine();
        lista.add(ingrediente);
        System.out.println("Añadiste: " + ingrediente);

    }

}
