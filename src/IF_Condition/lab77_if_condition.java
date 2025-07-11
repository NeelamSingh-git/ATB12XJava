package IF_Condition;

public class lab77_if_condition {
    public static void main(String[] args) {
        int age= Integer.parseInt(args[0]);  // convert into integer
        if(age>18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("you cant vote");
        }
    }
}
