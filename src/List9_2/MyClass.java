package List9_2;

public class MyClass {

    char[] code;
    int count;
    String name;

    public MyClass(char[] code, int count, String name) {

        int i;

        this.code = new char[code.length];
        this.count = count;
        this.name = name;
        for (i = 0; i < code.length; i++) {
            this.code[i] = code[i];
        }

    }

    public String toString() {
        StringBuilder text = new StringBuilder("Значения полей объекта. \n ");
        text.append("поле Name: ").append(name).append("\n");
        text.append("поле Count: ").append(count).append("\n");
        text.append("поле code: |");
        for (char c : code) {
            text.append(" ").append(c).append(" |");
        }
        return text.toString();

    }
}
