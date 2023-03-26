package ejemplos;

public class DivideTwoIntegers {
    public static void main(String[] args) {
        int dividend = 7;
        int divisor = -3;
        System.out.println(divide(dividend,divisor));
    }

    public static int divide(int dividend, int divisor) {
        int acum = 0;
        int res = 0;
        int iter=0;
        if (dividend > 0 && divisor>0) {
            for (int i = 0; acum < dividend; i++) {
                acum += divisor;
                iter=i;
            }
            res = iter;
        }
        if (dividend < 0){
                int dividend2=-dividend;
            for (int i = 0; acum < dividend2; i++) {
                acum += divisor;
                iter=i;
            }
            res = -iter;

        }
        if (divisor < 0){
                int divisor2=-divisor;
            for (int i = 0; acum < dividend; i++) {
                acum += divisor2;
                iter=i;
            }
            res = -iter;

        }
        return res;
    }
}
