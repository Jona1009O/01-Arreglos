import java.util.Scanner;

public class MultiplicacionPorEscalar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Pedir el tamaño de la matriz
        System.out.print("Ingrese el tamaño de la matriz (n*n): ");
        int n = scanner.nextInt();

        // Crear matriz de tamaño n*n
        int[][] matriz = new int[n][n];

        // Paso 2 y 3: Llenar la matriz
        matriz = llenarmatris(matriz);

        // Paso 4: Solicitar el escalar
        System.out.print("Ingrese el valor del escalar k: ");
        int k = scanner.nextInt();

        // Paso 5 y 6: Multiplicar la matriz por el escalar
        int[][] matrizResultado = multiplicar(matriz, k);

        // Paso 7: Imprimir la matriz resultante
        System.out.println("La matriz resultante es:");
        imprimir(matrizResultado);
        
        scanner.close();
    }

    // Método para multiplicar cada elemento de la matriz por un escalar
    public static int[][] multiplicar(int[][] x, int k) {
        int n = x.length;
        int[][] resultado = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = x[i][j] * k;
            }
        }
        
        return resultado;
    }

    // Método para imprimir la matriz
    public static void imprimir(int[][] x) {
        for (int[] fila : x) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }

    // Método para solicitar al usuario los valores de la matriz y llenarla
    public static int[][] llenarmatris(int[][] x) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = x.length;

            System.out.println("Ingrese los valores de la matriz:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("Elemento [" + i + "][" + j + "]: ");
                    x[i][j] = scanner.nextInt();
                }
            }
        }
        return x;
    }
}