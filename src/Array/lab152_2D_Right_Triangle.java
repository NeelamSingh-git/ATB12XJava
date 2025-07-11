package Array;

import java.util.Scanner;

public class lab152_2D_Right_Triangle {
    public static void main(String[] args) {
        //how the pattern we want
        // n=3
        //*
        //**
        //***
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        for(int i= 0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
