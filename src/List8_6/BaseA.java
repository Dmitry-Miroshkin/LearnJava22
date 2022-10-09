package List8_6;

 class BaseA  extends Base{

    BaseA() {
       super("Факториал");
    }

    @Override
    int F(int n) {
        if (n == 1) return 1;
        else return n*F(n-1);
    }
}
