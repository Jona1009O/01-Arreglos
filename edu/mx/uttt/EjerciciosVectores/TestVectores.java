package EjerciciosVectores;

public class TestVectores {
    public static void main(String[] args) {
        int[] vec1 = {1, 2, 3, 4, 5};
        int[] vec2 = {5, 4, 3, 2, 1};
        int escalar = 3;

        // Suma de Vectores
        int[] suma = SumaVectores.sumar(vec1, vec2);
        System.out.println("Suma de vectores: " + java.util.Arrays.toString(suma));

        // Producto Escalar
        int producto = ProductoEscalar.calcular(vec1, vec2);
        System.out.println("Producto escalar: " + producto);

        // Inverso del Vector
        int[] inverso = VectorInverso.obtenerInverso(vec1);
        System.out.println("Vector inverso: " + java.util.Arrays.toString(inverso));

        // Multiplicación de Escalar por un Vector
        int[] multiplicacion = MultiplicacionEscalar.multiplicar(escalar, vec1);
        System.out.println("Multiplicación por escalar: " + java.util.Arrays.toString(multiplicacion));

        // Valor Máximo y Mínimo
        int[] maxMin = MaximoMinimo.obtener(vec1);
        System.out.println("Máximo y Mínimo: Max = " + maxMin[0] + ", Min = " + maxMin[1]);

        // Eliminar Duplicados
        int[] sinDuplicados = SinDuplicados.eliminar(new int[]{1, 2, 2, 3, 4, 4, 5});
        System.out.println("Vector sin duplicados: " + java.util.Arrays.toString(sinDuplicados));

        // Intercambio
        Intercambio.intercambiar(vec1, 0, 4);
        System.out.println("Vector tras intercambio: " + java.util.Arrays.toString(vec1));

        // Números Primos
        int[] primos = NumerosPrimos.encontrarPrimos(vec1);
        System.out.println("Números primos: " + java.util.Arrays.toString(primos));

        // Números Pares
        int[] pares = NumerosPares.obtenerPares(vec1);
        System.out.println("Números pares: " + java.util.Arrays.toString(pares));

        // Números Impares
        int[] impares = NumerosImpares.obtenerImpares(vec1);
        System.out.println("Números impares: " + java.util.Arrays.toString(impares));
    }
}
