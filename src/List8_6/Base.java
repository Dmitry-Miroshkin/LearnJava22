package List8_6;

abstract class Base {
    String operation;

     Base(String str) {
        operation = str;
    }
    abstract int F(int n);
     void  show(int n){
         System.out.println("Операция "+ operation);
         System.out.println("Аргумент " + n);
         System.out.println("Значение " + F(n));
     }
}
