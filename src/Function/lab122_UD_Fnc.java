package Function;

import java.util.Scanner;

public class lab122_UD_Fnc {
    public static void main(String[] args) {
        // 4Types of Func
        //1. Without Parameter and without Return type.

        WP_WR();

        //2. Without Parameter and with Return type.

        String msg = WP_RT();
        System.out.println(msg);
        //3. With Parameter and without Return type.
         P_WR_detail("Aman" ,25,20);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= scanner.next();
        System.out.println("Enter your age: ");
        int age=scanner.nextInt();
        System.out.println("Enter your salary: ");
        double salary= scanner.nextDouble();
        P_WR_detail(name,age,salary);



        //4. With Parameter and with Return type.

        int sum1=sum_of_two_number(9,4);
        System.out.println(sum1);
        float sum2 = sum_of_three_number(5.2f,9.7f,12.75f);
        System.out.println(sum2);

    }
    // //1. Without Parameter and without Return type.
    static void WP_WR(){
        System.out.println("Hi. How r u");
    }
    //2. Without Parameter and with Return type.
    static String WP_RT(){
        System.out.println("HI");
        return "Hi how are you";
    }

    //3. With Parameter and without Return type.

    static void P_WR_detail(String name, int age, double salary){
        System.out.println("Your Name is: " + name +"\n Your Age is: "+ age+ "\n Your Salary is:" +salary);
    }

    //4. With Parameter and with Return type.
    static int sum_of_two_number(int a, int b){
        return a+b;
    }
    static float sum_of_three_number(float x,float y,float z){
        return x+y+z;
    }

}
