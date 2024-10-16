package EjerciciosVectores2;

public class TestVectores {
    public static void main(String[] args) {
        int[] vec1 = {1, 2, 3, 4, 5};
        int[] vec2 = {5, 4, 3, 2, 1};
        int escalar = 3;

        // Suma de Vectores
        int[] suma = VectorOperations.sumaVectores(vec1, vec2);
        System.out.println("Suma de vectores: " + java.util.Arrays.toString(suma));

        // Producto Escalar
        int producto = VectorOperations.productoEscalar(vec1, vec2);
        System.out.println("Producto escalar: " + producto);

        // Inverso del Vector
        int[] inverso = VectorOperations.vectorInverso(vec1);
        System.out.println("Vector inverso: " + java.util.Arrays.toString(inverso));

        // Multiplicación de Escalar por un Vector
        int[] multiplicacion = VectorOperations.multiplicacionEscalar(escalar, vec1);
        System.out.println("Multiplicación por escalar: " + java.util.Arrays.toString(multiplicacion));

        // Valor Máximo y Mínimo
        int[] maxMin = VectorOperations.maximoMinimo(vec1);
        System.out.println("Máximo y Mínimo: Max = " + maxMin[0] + ", Min = " + maxMin[1]);

        // Eliminar Duplicados
        int[] sinDuplicados = VectorOperations.sinDuplicados(new int[]{1, 2, 2, 3, 4, 4, 5});
        System.out.println("Vector sin duplicados: " + java.util.Arrays.toString(sinDuplicados));

        // Intercambio
        VectorOperations.intercambio(vec1, 0, 4);
        System.out.println("Vector tras intercambio: " + java.util.Arrays.toString(vec1));

        // Números Primos
        int[] primos = VectorOperations.numerosPrimos(vec1);
        System.out.println("Números primos: " + java.util.Arrays.toString(primos));

        // Números Pares
        int[] pares = VectorOperations.numerosPares(vec1);
        System.out.println("Números pares: " + java.util.Arrays.toString(pares));

        // Números Impares
        int[] impares = VectorOperations.numerosImpares(vec1);
        System.out.println("Números impares: " + java.util.Arrays.toString(impares));
    }
}
