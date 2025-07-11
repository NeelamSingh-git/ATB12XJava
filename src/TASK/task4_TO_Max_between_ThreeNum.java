package TASK;

public class task4_TO_Max_between_ThreeNum {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        int c = 12;
        int Max = (a>b)?((a>c)?a:c):((b>c)?b :c);
        System.out.println(Max);
    }
}
