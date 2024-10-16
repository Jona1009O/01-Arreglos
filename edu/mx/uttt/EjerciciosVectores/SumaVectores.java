package EjerciciosVectores;

public class SumaVectores {
    public static int[] sumar(int[] vec1, int[] vec2) {
        if (vec1.length != vec2.length) return null;
        int[] resultado = new int[vec1.length];
        for (int i = 0; i < vec1.length; i++) {
            resultado[i] = vec1[i] + vec2[i];
        }
        return resultado;
    }
}
