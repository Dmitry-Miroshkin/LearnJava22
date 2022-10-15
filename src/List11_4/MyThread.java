package List11_4;

import java.util.Random;

public class MyThread extends Thread {
    private final boolean upDown;
    private final String name;
    private final MyClass obj;

    public void run() {
        Random rnd = new Random();
        int number;
        for (int i = 1; i <= 3; i++) {
            synchronized (obj) {
                try {
                    number = obj.get(name);
                    if (upDown) number++;
                    else number--;
                    sleep(1000 + rnd.nextInt(9000));
                    obj.set(number, name);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }

        }
    }

    MyThread(boolean upDown, MyClass obj) {
        this.upDown = upDown;
        if (upDown) name = "UP-поток";
        else name = "DOWN-поток";
        this.obj = obj;
        start();
    }
}
