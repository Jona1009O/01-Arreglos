package Arreglos.vectores;

import javax.swing.JOptionPane;

public class TestVectores {
/* 
   public static void main(String[] args) {
    // Declaracion Vectores
    //int tam = 4; 

    //int [] x = new int[3];
    //System.out.println(x[1]);

    //double y [] = new double[tam];
    //System.out.println(y[3]);

    //boolean z1 [];
    //z1 = new boolean[4];
    //System.out.println(z1[3]);

    //char x1[], x2[], x3[];
    //x1 = new char[tam];
    //tam = 8;
    //x2 = new char[tam];

    //System.out.println(x2[3]);

    //String zz [] = {"Luis", "William", "Ezequiel", "Arcadia"};


   // try {
   //     System.out.println(zz[4]);
   // }catch(ArrayIndexOutOfBoundsException expected){
   //     System.out.println("Error: " + expected.getMessage());
    //}
  
    //zz[1] = "Mark";
    //System.out.println(zz[1]);
*/
    

 
   public static void main(String[] args) {
    
    int tam = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño del arreglo"));
    double estaturas [] = new double [tam];
    implimir(estaturas);
   }

   public static void implimir(double arr []){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + "->");
    }
    
}

    public static void llenarArreglo (double arr []) {
        int i = 0;
        while(i < arr.length){
            arr[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del arreglo[" + (i+1) + "]"));
            i++;
        }
   }

   public class Ejercicios {

    // Ejercicio 1: Sumar todos los valores en el arreglo usando un bucle for
    public static double sumarValores(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Ejercicio 2: Calcular la media de los valores del arreglo usando un bucle while
    public static double calcularMedia(double[] arr) {
        double sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        return sum / arr.length;
    }

    // Ejercicio 3: Obtener el valor máximo en el arreglo usando un bucle do-while
    public static double obtenerValorMaximo(double[] arr) {
        double max = arr[0];
        int i = 1;
        do {
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        } while (i < arr.length);
        return max;
    }

    public static void main(String[] args) {
        double[] arr = {5.3, 7.2, 4.8, 6.1, 9.5}; // Ejemplo de arreglo
        
        System.out.println("Suma de los valores: " + sumarValores(arr));
        System.out.println("Media de los valores: " + calcularMedia(arr));
        System.out.println("Valor máximo en el arreglo: " + obtenerValorMaximo(arr));
    }
}

   
}