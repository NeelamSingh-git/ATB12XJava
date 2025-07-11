package TASK;

public class task7_ID {
    public static void main(String[] args) {
        int a = 11;
        int b = 22;
        int c = a+b+a++ + b++ + ++a + ++b;  //  11+22+11+22+13+24
        System.out.println("a=" +a);            //a=13
        System.out.println("b=" +b);            //b=24
        System.out.println("c=" +c);            //c= 103
    }
}
