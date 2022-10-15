package List11_4;

import java.util.Date;

public class MyClass {

    private int count;

    public MyClass() {
        count = 0;
    }

    void set(int count, String name) {
        this.count = count;
        System.out.println(name + "Установлено значение поля " + count + ": " + new Date());


    }

    int get(String name) {
        System.out.println(name + "Считано значение поля " + count + ": " + new Date());
        return count;
    }
}
