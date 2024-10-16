package EjerciciosVectores;

public class ProductoEscalar {
    public static int calcular(int[] vec1, int[] vec2) {
        if (vec1.length != vec2.length) return -1;
        int resultado = 0;
        for (int i = 0; i < vec1.length; i++) {
            resultado += vec1[i] * vec2[i];
        }
        return resultado;
    }
}