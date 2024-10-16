package Arreglos.vectores;

public class Ejercicios {

    // Método para sumar los valores de un arreglo de doubles
    public static double sumarValores(double[] arr) {
        if (arr == null || arr.length == 0) {
            return 0; // Retorna 0 si el arreglo es nulo o vacío
        }
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    // Método para calcular la media de los valores de un arreglo de doubles
    public static double calcularMedia(double[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("El arreglo no debe ser nulo o vacío.");
        }
        double sum = sumarValores(arr);
        return sum / arr.length;
    }
    
    // Método para obtener el valor máximo de un arreglo de doubles
    public static double obtenerValorMaximo(double[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("El arreglo no debe ser nulo o vacío.");
        }
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
