import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void mdcP6(){
        final double a = 8, b = 2;
        final double esperado = MathUtil.mdc(a, b);
        final double obtido = MathUtil.mdc(b, a);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcP7(){
        final double a = 10, b = 2;
        final double esperado = MathUtil.mdc(-a, b);
        final double obtido = MathUtil.mdc(a, -b);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcP7Primos(){
        final double a = 11, b = 7;
        final double esperado = MathUtil.mdc(-a, b);
        final double obtido = MathUtil.mdc(a, -b);
        assertEquals(esperado, obtido);
    }

    @Test
    void mdcP12UmNumeroPrimo(){
        final double p = 11, a = 2;
        final double obtido = MathUtil.mdc(p, a);
        assertEquals(1, obtido);
    }

    @Test
    void mdcP12PrimosIguais(){
        final double p = 7;
        final double a = p;
        final double obtido = MathUtil.mdc(p, a);
        assertEquals(p, obtido);
    }

    @Test
    void mdcMultiplosValoresA1(){
        final double a = 30;
        final double b = 12;
        final double c = 4;
        final double esperado = 2;
        final double obtido = MathUtil.mdc(a, b, c);
        assertEquals(esperado, obtido);
    }

    @Test
    void MdcNenhumParametro(){
        assertThrows(RuntimeException.class, () -> MathUtil.mdc());
    }

    @Test
    void mdcNulo(){
        //MathUtil.mdc(null);
        assertThrows(NullPointerException.class, () -> MathUtil.mdc(null));
    }
}
