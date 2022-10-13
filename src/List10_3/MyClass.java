package List10_3;

public class MyClass {

    private int number;

    void show() {
        System.out.println("Значение поля: " + number);
    }

    MyClass(int number) {
        try {
            if (number > 10) {
                number = 10;
                throw new MyException("Слишком большое число!");
            }
            if (number < 0) {
                number = 0;
                throw new MyException("Отрицательное число!");
            }
        } catch (MyException obj) {
            System.out.println(obj);
            this.number = number;
            show();
        }
    }

    void set(int number) throws MyException {
        if (number > 10 || number < 0) throw new MyException("Неверный аргумент!");
        this.number = number;
        System.out.println("Всё в порядке!");
        show();
    }
}

