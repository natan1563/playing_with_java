package test;

import org.junit.jupiter.api.Test;
import util.Calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraDeMediaTest {

    @Test
    public void shouldBeReturnCorrectMedia()
    {
        int[] numbers = { 4, 8, 12 };

        double media = Calculadora.obterMedia(numbers);

        assertEquals(8, media);
    }
}
