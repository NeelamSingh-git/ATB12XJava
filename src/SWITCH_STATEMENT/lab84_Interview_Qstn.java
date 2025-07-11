package SWITCH_STATEMENT;

import java.util.Scanner;

public class lab84_Interview_Qstn {
    public static void main(String[] args) {
        // find what is the output
        //if enter 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num 1 to 7");
        int day = scanner.nextInt();

        switch(day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;

        }
    }
}
