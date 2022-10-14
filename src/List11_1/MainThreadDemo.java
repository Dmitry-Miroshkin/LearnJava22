package List11_1;

public class MainThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t;
        long time = 2500;
        t=Thread.currentThread();

        System.out.println(t);

        t.setName("This is MAIN thread!");

        int p = t.getPriority();
        t.setPriority(++p);
        System.out.println(t);
        System.out.println("Выполнение потока приостановлено на " + (double) time/1000 + " секунд");
        Thread.sleep(time);
        System.out.println("Program is done!");
    }
}
