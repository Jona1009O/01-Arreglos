package EjerciciosVectores;

public class MaximoMinimo {
    public static int[] obtener(int[] vec) {
        int max = vec[0];
        int min = vec[0];
        for (int val : vec) {
            if (val > max) max = val;
            if (val < min) min = val;
        }
        return new int[]{max, min};
    }
}
