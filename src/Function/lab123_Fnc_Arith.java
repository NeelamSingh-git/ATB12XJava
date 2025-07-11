package Function;

import java.util.Scanner;

public class lab123_Fnc_Arith {
    public static void main(String[] args) {
        // create a func sub,sum,mul,div with the parameter a,b from user
// first verify it is integer or not
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num1 ");
        int num1= scanner.nextInt();
        if(scanner.hasNextInt()){
            num1= scanner.nextInt();
        }else{
            System.out.println("Enter only integer value");
            System.exit(0);
        }
        // verify the 2nd num is integer or not

        System.out.println("Enter second num2");
        int num2= scanner.nextInt();
        if(scanner.hasNextInt()){
            num2= scanner.nextInt();
        }else{
            System.out.println("Enter only integer value");
            System.exit(0);
        }

        int sum= sum(num1, num2);
        System.out.println("sum: "+sum );

        int sub = sub(num1, num2);
        System.out.println( "sub:" +sub);

        int mul= mul(num1, num2);
        System.out.println("mul: "+ mul);

        int div= div(num1,num2);
        System.out.println( "div: " +div);

        int mod = mod(num1,num2);
        System.out.println("mod: "+mod);


    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b) throws ArithmeticException{
        if (b==0){

            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a/b;
    }
    static int mod(int a,int b){
        return a%b;
    }

}
