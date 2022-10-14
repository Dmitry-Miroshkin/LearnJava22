package List11_2;

import java.util.Date;
import java.util.Random;

public class MyThread  implements  Runnable {

    @Override
    public void run() {
        System.out.println("Дочерний поток начал работу: " + new Date());
        Random rnd = new Random();
        for (int i =1; i<=10; i++){
            try {
                Thread.sleep(1000+ rnd.nextInt(4000));
                System.out.println("Дочерний поток: "+ new Date());
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Дочерний поток завершил работу: " + new Date());
        }
    }
    MyThread(){
        new Thread(this).start();
    }
}
