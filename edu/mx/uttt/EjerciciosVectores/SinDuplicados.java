package EjerciciosVectores;

public class SinDuplicados {
    public static int[] eliminar(int[] vec) {
        return java.util.Arrays.stream(vec).distinct().toArray();
    }
}
