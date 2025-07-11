package EX_04_Operators;

public class lab59_Type_casting {
    public static void main(String[] args) {
        long phn_no = 933068478;
       // short s = phn_no; // narrowing implicit
        short s = (short) phn_no; // narrowing explicit
        System.out.println(s);
    }
}
