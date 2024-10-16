package Arreglos.vectores;

import java.util.Scanner;

public class SumaVectores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño de los vectores: ");
        int tamaño = sc.nextInt();
        
        int[] vec1 = new int[tamaño];
        int[] vec2 = new int[tamaño];
        int[] vecResultado = new int[tamaño];
        
        System.out.println("Carga del primer vector.");
        cargarVector(vec1, sc);
        
        System.out.println("Carga del segundo vector.");
        cargarVector(vec2, sc);
        
        sumarVectores(vec1, vec2, vecResultado);
        
        System.out.println("Resultado de la suma de vectores:");
        imprimirVector(vecResultado);
        
        System.out.println("\n--- Producto escalar de vectores ---");
        int resultadoProductoEscalar = productoEscalar(vec1, vec2);
        System.out.println("El producto escalar de los vectores es: " + resultadoProductoEscalar);
        
        System.out.println("\n--- Invertir vector ---");
        int[] vecInvertido = new int[tamaño];
        invertirVector(vec1, vecInvertido);
        System.out.println("Primer vector invertido:");
        imprimirVector(vecInvertido);
        
        System.out.println("\n--- Multiplicar vector por escalar ---");
        System.out.print("Ingrese el escalar para la multiplicación: ");
        int escalar = sc.nextInt();
        int[] vecEscalarResultado = new int[tamaño];
        multiplicarPorEscalar(vec1, vecEscalarResultado, escalar);
        System.out.println("Primer vector multiplicado por el escalar:");
        imprimirVector(vecEscalarResultado);
        
        sc.close();
    }

    public static void cargarVector(int[] vec, Scanner sc) {
        for (int i = 0; i < vec.length; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vec[i] = sc.nextInt();
        }
    }

    public static void sumarVectores(int[] vec1, int[] vec2, int[] vecResultado) {
        for (int i = 0; i < vec1.length; i++) {
            vecResultado[i] = vec1[i] + vec2[i];
        }
    }

    public static void imprimirVector(int[] vec) {
        for (int num : vec) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int productoEscalar(int[] vec1, int[] vec2) {
        int resultado = 0;
        for (int i = 0; i < vec1.length; i++) {
            resultado += vec1[i] * vec2[i];
        }
        return resultado;
    }

    public static void invertirVector(int[] vec, int[] vecInvertido) {
        for (int i = 0; i < vec.length; i++) {
            vecInvertido[i] = vec[vec.length - 1 - i];
        }
    }

    public static void multiplicarPorEscalar(int[] vec, int[] vecResultado, int escalar) {
        for (int i = 0; i < vec.length; i++) {
            vecResultado[i] = vec[i] * escalar;
        }
    }
}
