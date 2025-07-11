package While_Loop;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class lab116_While_Gussing_Game {
    public static void main(String[] args) {
            // guess the number between 1 to 100
        Random random = new Random();       // this take any random number
        int number_to_Guess= random.nextInt(100)+1; // generate a random number and stored it in variable
                                                            // number_to_Guess

            //take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempts= 0;

        while(true){            // the loop is run infinitely until you guess the correct number.

            // check valid integer input before reading
            if (!scanner.hasNextInt()){
                System.out.println("Invalid input. Please enter a number");
                scanner.next();  // consume invalid input
                continue;
            }
            guess = scanner.nextInt();  //ask user to give guess number/ read valid guess
            attempts ++;

            // check if guess is out of valid range
            if(guess <0|| guess>100){
                System.out.println("Please enter the number between 1 to 100");
                continue;
            }


            if(guess<number_to_Guess){
                System.out.println("The Number is too less. Try again...");
            }else if(guess>number_to_Guess){
                System.out.println("The Number is too high. Try again...");
            }else{
                System.out.println("Correct... You found it in "+attempts +"attempts");
                break;
            }
        }
scanner.close();    // close the scanner
    }
}
