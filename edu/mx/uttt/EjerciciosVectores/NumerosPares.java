package EjerciciosVectores;

public class NumerosPares {
    public static int[] obtenerPares(int[] vec) {
        return java.util.Arrays.stream(vec)
                .filter(n -> n % 2 == 0)
                .toArray();
    }
}
