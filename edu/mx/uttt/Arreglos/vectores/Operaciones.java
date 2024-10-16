package Arreglos.vectores;

public class Operaciones {
    // Método para sumar todos los valores en el arreglo
    public static double sumarValores(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Método para calcular la media de los valores en el arreglo
    public static double calcularMedia(double[] arr) {
        double sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        return sum / arr.length;
    }

    // Método para obtener el valor máximo del arreglo
    public static double obtenerValorMaximo(double[] arr) {
        double max = arr[0];
        int i = 1;
        do {
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        } while (i < arr.length);
        return max;
    }

    // Método main para probar las funciones
    public static void main(String[] args) {
        double[] arr = {5.3, 7.2, 4.8, 6.1, 9.5}; // Ejemplo de arreglo
        
        System.out.println("Suma de los valores: " + sumarValores(arr));
        System.out.println("Media de los valores: " + calcularMedia(arr));
        System.out.println("Valor máximo en el arreglo: " + obtenerValorMaximo(arr));
    }
}
