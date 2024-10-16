/*import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Análisis de Números Aleatorios");
            System.out.println("2. Clasificación de Puntajes");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                NumAle numAle = new NumAle();
                numAle.showAnalysis();
            } else if (opcion == 2) {
                System.out.print("¿Cuántos puntajes deseas generar? ");
                int n = scanner.nextInt();
                Puntajes puntajes = new Puntajes(n);
                puntajes.clasificarPuntajes();
            } else if (opcion == 3) {
                System.out.println("Saliendo del programa.");
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }
        scanner.close();
    }
}
*/