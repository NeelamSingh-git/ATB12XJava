package Array;

import java.util.Arrays;

public class lab147_IQ_2nd_Heighest {
    public static void main(String[] args) {
        int number[]= {41,102,57,89,20};
        Arrays.sort(number);
        System.out.println(number[number.length-2]);
    }
}
