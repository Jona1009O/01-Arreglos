package MetodosOrdenamiento;

public class Test {
    public static void main(String[] args) {
    int x [] = {8,7,5,2};
    Sort s1 = new Sort(x.length);
    s1.setArr(x);
    s1.imprimir();
    System.out.println("Metodo Burbuja");
    System.out.println();
    s1.burbleAsc();
    s1.imprimir();

    System.out.println("Metodo Seleccion");

    }
}
