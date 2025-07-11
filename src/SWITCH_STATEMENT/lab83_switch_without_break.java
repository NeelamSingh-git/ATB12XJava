package SWITCH_STATEMENT;

import java.util.Scanner;

public class lab83_switch_without_break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day num(1 to 7)");
        int day = scanner.nextInt();
        switch(day){
            case 1:
                System.out.println("mon");
            case 2:
                System.out.println("tue");
            case 3:
                System.out.println("wen");
            case 4:
                System.out.println("thu");
            case 5:
                System.out.println("fri");
            case 6:
                System.out.println("sat");
            case 7:
                System.out.println("sun");
            default:
                System.out.println("Enter only 1 to 7");

        }
    }
}
