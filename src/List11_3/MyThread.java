package List11_3;

import java.util.Date;
import java.util.Random;

public class MyThread  extends Thread {

    public MyThread() {
        start();
    }

    public void run(){
        System.out.println("Дочерний поток начал работу: "+ new Date());
        Random rnd = new Random();
        for (int i = 1; i <= 10 ; i++) {
            try {
                sleep(1000+rnd.nextInt(4000));
                System.out.println("Дочерний поток: " + new Date());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Дочерний поток завершил работу: " + new Date());
        }
    }
}
