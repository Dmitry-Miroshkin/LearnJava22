package List9_3;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String text = "Очень простой текст: состоит из слов, и без цифр!";
        StringTokenizer str = new StringTokenizer(text);
        while (str.hasMoreTokens()){
            String s = str.nextToken(" ,!:");
            System.out.println(s);
        }
    }
}
