package List10_2;

import java.util.Random;

public class UsingCatchesDemo {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 0, 8, 10, 12, 12, 15};
        int n = 120, count = 0;
        while (count < 5) {
            try {
                System.out.print(n / arr[rnd.nextInt(arr.length + 2) - 1]+" ");
            } catch (ArithmeticException eObj) {
                System.out.println("\nОшибка: Деление на ноль! Описание: " + eObj);
                count++;
            } catch (ArrayIndexOutOfBoundsException eObj) {
                System.out.println("\nОшибка: Неверный индекс! Описание: " + eObj);
                count++;
            }
        }
    }
}
