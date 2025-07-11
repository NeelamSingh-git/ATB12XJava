package TASK;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lab10_Switch_Grade_Find {
    public static void main(String[] args) {
        // Find the grade.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the grade from A to F");
        char grade = scanner.next().charAt(0);  // read first char
        switch(grade){
            case 'A','a' :
                System.out.println("Execellent");
                break;
            case 'B','b' :
                System.out.println("Very Good");
                break;
            case 'C','c' :
                System.out.println("Good");
                break;
            case 'D','d' :
                System.out.println("Need Improvement");
                break;
            case 'F','f' :
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade input");
                break;

        }
        scanner.close();
    }
}
