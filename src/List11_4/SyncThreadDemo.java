package List11_4;

public class SyncThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        MyClass obj = new MyClass();
        MyThread thA = new MyThread(true, obj);
        MyThread thB = new MyThread(false, obj);
        thA.join();
        thB.join();
        System.out.print("Окончательно: ");
        obj.get("");
    }
}
