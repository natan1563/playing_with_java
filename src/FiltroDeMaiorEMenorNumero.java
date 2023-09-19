import java.util.ArrayList;
import java.util.List;

public class FiltroDeMaiorEMenorNumero {
    public static void main(String args[])
    {
       int[] numeros = { 1, 2, 9, 4, 5, 6, 8 };

       System.out.println("O maior numero é: " + obterNumero(numeros, false));
       System.out.println("O menor numero é: " + obterNumero(numeros, true));
    }

    public static int obterNumero(int[] listaDeNumeros, boolean menorNumero)
    {
        int numeroARetornar = listaDeNumeros[0];

        for (int index = 0; index < listaDeNumeros.length; index++) {
            numeroARetornar = retornarPorCondicional(numeroARetornar, listaDeNumeros[index], menorNumero);
            for (int segundIndex = 0; segundIndex < listaDeNumeros.length; segundIndex++) {
                numeroARetornar = retornarPorCondicional(numeroARetornar, listaDeNumeros[segundIndex], menorNumero);
            }
        }

        return numeroARetornar;
    }

    private static int retornarPorCondicional(int numeroAtual, int numeroParaComparar, boolean obterMenorNumero) {
            return (obterMenorNumero)
                                    ? (numeroAtual <= numeroParaComparar ? numeroAtual : numeroParaComparar)
                                    : (numeroAtual >= numeroParaComparar? numeroAtual : numeroParaComparar);
    }
}
