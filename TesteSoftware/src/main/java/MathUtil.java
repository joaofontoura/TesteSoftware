public class MathUtil {
    public static double mdc(double a, double b){
        //P7
        a = Math.abs(a);
        b = Math.abs(b);

        //P6
        final double min = Math.min(a, b);
        a = Math.max(a, b);
        b = min;

        //P1 e P2
        if (b>0 && a%b == 0)
            return b;

        //P3
        if (b == 0)
            return Math.abs(a);

        //TODO: P12 - Considera que todo número que chegar aqui é ímpar
        return 1;

        //throw new UnsupportedOperationException("Impossível calcular com os valores informados");
    }
}
