package EX_04_Operators;

public class lab58_Narrowing_TypeCasting {
    public static void main(String[] args) {
        int val = 300;
       // byte b = val; // narrowing implicit, JVM will do it . data loss will be there
        byte b = (byte) val; // explicit type casting. JVM do it. data loss will be there.
        System.out.println(b);  // 44
    }
}
