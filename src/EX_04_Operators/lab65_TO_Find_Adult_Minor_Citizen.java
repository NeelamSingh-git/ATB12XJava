package EX_04_Operators;

public class lab65_TO_Find_Adult_Minor_Citizen {
    public static void main(String[] args) {
        String user_input = args[0];  // taking value from user using CLA
        System.out.println(user_input instanceof String);
        System.out.println(user_input);


        int age = Integer.parseInt(user_input); // converted into integer
        System.out.println(age);
        String result = (age<18)? "Minor": (age<65)? "Adult" : "SeniorCitizen";
        System.out.println(result);


    }
}
