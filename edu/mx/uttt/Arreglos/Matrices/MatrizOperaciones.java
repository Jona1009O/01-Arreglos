import java.util.Scanner;

public class MatrizOperaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el tamaño de la matriz
        System.out.print("Ingrese el número de filas (n): ");
        int n = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (m): ");
        int m = scanner.nextInt();

        // Crear y llenar la matriz
        int[][] matriz = new int[n][m];
        llenarMatriz(matriz, scanner);

        // Verificar si la matriz es cuadrada
        if (esCuadrada(matriz)) {
            System.out.println("La matriz es cuadrada.");
        } else {
            System.out.println("La matriz no es cuadrada.");
        }

        // Calcular y mostrar el promedio de todos los elementos de la matriz
        double promedioTotal = promedioTotal(matriz);
        System.out.println("Promedio de todos los elementos de la matriz: " + promedioTotal);

        // Calcular y mostrar el promedio de cada fila
        double[] promedioFilas = promedioFilas(matriz);
        System.out.println("Promedio de cada fila:");
        for (int i = 0; i < promedioFilas.length; i++) {
            System.out.println("Fila " + (i + 1) + ": " + promedioFilas[i]);
        }

        // Calcular y mostrar el promedio de cada columna
        double[] promedioColumnas = promedioColumnas(matriz);
        System.out.println("Promedio de cada columna:");
        for (int j = 0; j < promedioColumnas.length; j++) {
            System.out.println("Columna " + (j + 1) + ": " + promedioColumnas[j]);
        }
        
        scanner.close();
    }

    // Método para llenar la matriz con valores ingresados por el usuario
    public static void llenarMatriz(int[][] matriz, Scanner scanner) {
        System.out.println("Ingrese los valores de la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    // Método para verificar si la matriz es cuadrada
    public static boolean esCuadrada(int[][] matriz) {
        return matriz.length == matriz[0].length;
    }

    // Método para calcular el promedio total de la matriz
    public static double promedioTotal(int[][] matriz) {
        int suma = 0;
        int totalElementos = matriz.length * matriz[0].length;

        for (int[] fila : matriz) {
            for (int valor : fila) {
                suma += valor;
            }
        }
        return (double) suma / totalElementos;
    }

    // Método para calcular el promedio de cada fila
    public static double[] promedioFilas(int[][] matriz) {
        double[] promedios = new double[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j];
            }
            promedios[i] = (double) sumaFila / matriz[i].length;
        }
        
        return promedios;
    }

    // Método para calcular el promedio de cada columna
    public static double[] promedioColumnas(int[][] matriz) {
        int columnas = matriz[0].length;
        double[] promedios = new double[columnas];

        for (int j = 0; j < columnas; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j];
            }
            promedios[j] = (double) sumaColumna / matriz.length;
        }
        
        return promedios;
    }
}
