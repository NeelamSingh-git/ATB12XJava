package While_Loop;

import java.util.Scanner;

public class lab115_IQ_Factorial {
    public static void main(String[] args) {
        // take input from user
        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to Factorial Program");
        System.out.println("Enter the integer number whose factorial do you want");

        // check the number is integer or not
        if(!scanner.hasNextInt()){
            System.out.println("Enter the Integer no, Return the program");
        }
        int number = scanner.nextInt();
        int factorial = 1;
        if (number<=0){             // factorial of 0 and -num always 1
            System.out.println("Factorial is " +factorial);
        }

        //maximum number
        if(number>Integer.MAX_VALUE){
            System.out.println("can not get factorial as out of bound");
        }
        int i= 1;
        while(i<=number){
            factorial= factorial*i;
            i++;
        }
        System.out.println("factorial =" +factorial);

    }
}
