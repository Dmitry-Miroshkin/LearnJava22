package List12_4;

import java.io.*;

public class FileInOutDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("res/file.txt");
            FileOutputStream fout = new FileOutputStream("res/result2.txt",true);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fout));
            String str;
            do {
                str = br.readLine();
                System.out.println(str);
                bw.newLine();
                bw.write(str.toLowerCase().replace(' ','_'));

            }while (!str.equalsIgnoreCase("Омар Хайям"));
            br.close();
            bw.close();
        }catch (IOException e){
            System.out.println("FILE NOT FOUND!" + e);
        }
    }
}
