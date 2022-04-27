import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MathUtilTest {

    @Test
    void mdcP1Pares() {
        final double a = 8, b = 2;
        final double valorEsperado = b;
        final double valorObtido = MathUtil.mdc(a, b);
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    void mdcP1Iguais() {
        final double a = 4, b = 4;
        final double valorEsperado = b;
        final double valorObtido = MathUtil.mdc(a, b);
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    void mdcP1Impares() {
        final double a = 9, b = 3;
        final double valorEsperado = b;
        final double valorObtido = MathUtil.mdc(a, b);
        assertEquals(valorEsperado, valorObtido);
    }

    @Test
    void mdcP2() {
        final double a = 8, b = 4, divisor = 2;
        final double valorObtido = MathUtil.mdc(a, b);
        assertTrue(valorObtido%divisor == 0);
    }

    @Test
    void mdcP3Positivo() {
        final double a = 7;
        final double esperado = 7;
        final double obtido = MathUtil.mdc(a, 0);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcP3Negativo() {
        final double a = -7;
        final double esperado = 7;
        final double obtido = MathUtil.mdc(a, 0);
        assertEquals(esperado, obtido);
    }
}
