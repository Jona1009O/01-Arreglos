package EjerciciosVectores;

public class NumerosImpares {
    public static int[] obtenerImpares(int[] vec) {
        return java.util.Arrays.stream(vec)
                .filter(n -> n % 2 != 0)
                .toArray();
    }
}
