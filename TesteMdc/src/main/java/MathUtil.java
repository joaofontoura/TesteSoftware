import java.util.Objects;

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

        //P5 e P7


        //TODO: P12 - Considera que todo número que chegar aqui é ímpar
        return  mdc(a - b, b);
    }

    public static double mdc(double ...valores){
        Objects.requireNonNull(valores, "O parâmetro valores não pode ser Nulo");

        if (valores.length == 0) {
            try {
                throw new IllegalAccessException("É preciso indicar ao menos um teste para calcular o mdc");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        double a = valores[0];
        for (double b : valores){
            a = mdc(a, b);
        }

        return a;
    }
}
