public class MathUtil {
    public static double mdc(double a, double b){
        //P1 e P2
        if (b>0 && a%b == 0)
            return b;

        //P3
        if (b == 0)
            return Math.abs(a);

        return -1;
    }
}
