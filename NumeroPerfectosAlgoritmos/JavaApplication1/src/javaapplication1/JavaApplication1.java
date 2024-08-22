package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int numero = 777777777;
        double numeroPerfecto = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                numeroPerfecto = i + numeroPerfecto;
            }
        }
        if (numero == numeroPerfecto) {
            System.out.println(numero + " es un numero Perfecto");
        } else {
            System.out.println(numero + " No es un numero perfecto");
        }
        long endTime = System.nanoTime();
        System.out.println("Demoró " + (endTime - startTime) + " nanosegundos");
    }

}
