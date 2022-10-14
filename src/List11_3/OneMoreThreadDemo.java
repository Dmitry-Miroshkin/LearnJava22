package List11_3;

import java.util.Date;
import java.util.Random;

public class OneMoreThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Главный поток начал работу:" + new Date());
        Random rnd = new Random();
        new MyThread();
        for (int i = 1; i <5 ; i++) {
            Thread.sleep(5000+rnd.nextInt(5000));
            System.out.println("Главный поток: "+ new Date());
        }
        System.out.println("Главный поток завершил работу:" + new Date());
    }
}
