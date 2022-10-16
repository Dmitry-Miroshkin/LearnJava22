package List12_3;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "/home/user/IdeaProjects/untitled/res/";
        filePath += JOptionPane.showInputDialog("Укажите имя файла");
        try {


            FileInputStream fin = new FileInputStream(filePath);
            FileOutputStream fout = new FileOutputStream("res/result.txt");
            int s = fin.read();
            while (s != -1) {
                switch (s) {
                    case 'T':
                        s = 't';
                        break;
                    case 'а':
                        s = '@';
                        break;
                    case '.':
                        fout.write('<');
                        fout.write('*');
                        s = '>';
                        break;
                }
                fout.write(s);
                s = fin.read();
            }
            JOptionPane.showMessageDialog(null, "Изменения в файл внесены!", " Программа закончила работу", JOptionPane.INFORMATION_MESSAGE);
            fin.close();
            fout.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null,"File not found!",
                    "ERROR!",JOptionPane.ERROR_MESSAGE);
        }
    }
}
