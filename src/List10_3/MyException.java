package List10_3;

public class MyException extends Exception{
    static int count = 0;
    String name;
    MyException(String name){
        count++;
        this.name = name;
    }
    public  String toString(){
        String text = "Возникла ошибка!\n";
        text+= "Описание: " + name + "\n";
        text+= "Номер ошибки: " + count;
        return text;
    }
}
