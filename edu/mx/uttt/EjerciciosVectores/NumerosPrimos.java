package EjerciciosVectores;

public class NumerosPrimos {
    public static int[] encontrarPrimos(int[] vec) {
        return java.util.Arrays.stream(vec)
                .filter(NumerosPrimos::esPrimo)
                .toArray();
    }

    private static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
