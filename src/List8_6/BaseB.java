package List8_6;

public class BaseB extends Base {
    public BaseB() {
        super("Двойной факториал");
    }

    int F(int n) {
        if (n == 1 || n == 2) return n;
        else return n * F(n - 2);
    }
}
