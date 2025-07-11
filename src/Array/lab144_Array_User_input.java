package Array;

import java.util.Scanner;

public class lab144_Array_User_input {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of an array (int)");
        int size= scanner.nextInt();

        String[] number_marks= new String[size];    // give size
      //  float[] number_marks1= new float[size];
        //boolean[] number_marks2= new boolean[size];
         for(int i =0; i<number_marks.length; i++){
             System.out.println("Enter the element ->"+i);
             number_marks[i]= scanner.next();   // store user value
         }
        System.out.println("Print the value----------------");
          for(String mark: number_marks){
              System.out.println(mark);
          }
          scanner.close();
    }
}
