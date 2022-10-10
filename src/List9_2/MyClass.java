package List9_2;

public class MyClass {

    char[] code;
    int count;
    String name;

    public MyClass(char[] code, int count, String name) {

        int i;

        this.code = new char[code.length];
        this.count = count;
        this.name = new String(name);
        for (i = 0; i < code.length; i++) {
            this.code[i] = code[i];
        }

    }

    public String toString() {
        String text = "Значения полей объекта. \n ";
        text += "поле Name: " + name + "\n";
        text += "поле Count: " + count + "\n";
        text += "поле code: |";
        for (char c : code) {
            text += " " + c + " |";
        }
        return text;

    }
}
