package TASK;

public class task5_TO_Adult_Minor_Senior {
    public static void main(String[] args) {
        int age = 10;
        String result = age>18?((age>65)? "Senior Citizen" : "Adult")  :"Minor";
        System.out.println(result);

    }
}
