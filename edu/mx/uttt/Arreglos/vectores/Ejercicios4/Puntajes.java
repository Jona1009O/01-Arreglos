import java.util.Random;

public class Puntajes {
    private int[] puntajes;

    public Puntajes(int n) {
        puntajes = new int[n];
        Random rand = new Random();
        for (int i = 0; i < puntajes.length; i++) {
            puntajes[i] = rand.nextInt(21); // Números entre 0 y 20
        }
    }

    public void clasificarPuntajes() {
        int deficientes = 0, regulares = 0, buenos = 0, excelentes = 0;

        for (int puntaje : puntajes) {
            if (puntaje <= 5) deficientes++;
            else if (puntaje <= 10) regulares++;
            else if (puntaje <= 15) buenos++;
            else excelentes++;
        }

        System.out.println("Puntajes Generados: " + java.util.Arrays.toString(puntajes));
        System.out.println("Deficientes (0-5): " + deficientes);
        System.out.println("Regulares (6-10): " + regulares);
        System.out.println("Buenos (11-15): " + buenos);
        System.out.println("Excelentes (16-20): " + excelentes);
    }
}
