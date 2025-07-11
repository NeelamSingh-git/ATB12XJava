package Array;

import java.util.Arrays;

public class lab139_Array {
    public static void main(String[] args) {
        int a =10;
        int [] marks= {90,97,89,79,85};
        boolean [] is_married = {true,false,true};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);
       // System.out.println(marks[-1]); // not support negative index
char c = 'A';
String name = "Avinash";
String[] each_element_char = name.split("");
        System.out.println(Arrays.toString(each_element_char));
    }
}
