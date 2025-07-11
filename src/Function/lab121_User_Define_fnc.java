package Function;

public class lab121_User_Define_fnc {
    public static void main(String[] args) {

int result = sum_of_two_no(4,6);
int result1 = sum_of_two_no(5,7);
        System.out.println(result);
        System.out.println(result1);

    }

    static int sum_of_two_no(int first, int sec){
        return first + sec;
    }
}
