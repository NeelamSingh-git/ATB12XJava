package EX_04_Operators;

public class lab60_type_casting_used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 12.50f;
       // int total_1 = course + GST;  narrowing implicit
        int total_1 = course + (int)GST ; // narrowing explicit
        System.out.println(total_1); // data loss

        float total_2 = (float) course + GST;
        System.out.println(total_2);

    }
}
