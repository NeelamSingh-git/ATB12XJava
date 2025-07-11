package EX_04_Operators;

public class lab63_TO_InterviewQstn {
    public static void main(String[] args) {
//nested Ternary
        // condition? expression1 :(condition1? expression3 : expression4);
        int age = 25;
        String result = age>18? (age>21? "you can drink":"You can not drink") : "You cant go to GOA";
        System.out.println(result);
    }
}
