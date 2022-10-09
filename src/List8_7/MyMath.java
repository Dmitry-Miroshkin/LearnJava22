package List8_7;

public class MyMath  implements Mathematica{

    @Override
    public int factorial(int n) {
        int s = 1, i;
        for (i = n; i > 0; s*= i--);
        return s;
    }

    @Override
    public double power(double x, int n) {
        double s =1;
        int i;
        for (i = 1; i <= n; s*= x, i++ );
        return s;
    }
    void show(double x, int n){
        System.out.println("первый аргумент "+ x);
        System.out.println("второй аргумент "+ n);
        System.out.println("Факториал: " + factorial(n));
        System.out.println("Возведение в степень: " + power(x, n));
    }
}
