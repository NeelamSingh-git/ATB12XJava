package SWITCH_STATEMENT;

import java.util.Scanner;

public class lab82_Switch {
    public static void main(String[] args) {
        //you need to take user input and ask for entering number 1 to 7
        // if user enter 1 to 7 , tell which day it is.

        // Logic Building Formula
        //step1: using scanner class to take input
        // step2:  figure out expression and day
        // step 3: add rough logic
        // step 4: write fix logic and optimize
        // step 5: figure out edge cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day to 1 to 7");
        int day = scanner.nextInt();

       if(scanner.hasNextInt()){           // it will return true if it is integer
            day= scanner.nextInt();
        }
        else{
            System.out.println(" Why are you entering non integer value");
        }

        switch(day){
            case 1:
            System.out.println("Mon");
            break;
            case 2:
            System.out.println("Tue");
            break;
            case 3:
            System.out.println("Wed");
            break;
            case 4:
            System.out.println("Thu");
            break;
            case 5:
            System.out.println("Fri");
            break;
            case 6:
            System.out.println("Sat");
            break;
            case 7:
            System.out.println("Sun");
            break;
            default:
                System.out.println("Enter only integer number 1 to 7");
        }
        System.out.println("End of the Program");
    }

}
