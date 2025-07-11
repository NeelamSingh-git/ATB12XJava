package EX_04_Operators;

public class lab66_multiple_input {
    public static void main(String[] args) {
        // take inputs
       // String age = args[0];
       String a = args[1];
        String b = args[2];
        String c = args[3];

      //  System.out.println(age);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // if the arguments are less then we have issue
        // convert into integer
        int age = Integer.parseInt(a);//
        System.out.println(age);
        float f = Float.parseFloat(c);
        System.out.println(f);
    }
}
