package util;

public class Calculadora {
    public static double obterMedia(int[] numeros) {
        int total = 0;

        for (int numeroAtual : numeros) {
            total += numeroAtual;
        }

        return (double) total / numeros.length;
    }
}
