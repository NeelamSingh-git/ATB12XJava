package String;

public class lab137_StringBuffer_IQ {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");   //  Java Programming
        System.out.println(sb);
        sb.delete(5,16);  // delete substring
        System.out.println(sb);  // Java
        sb.replace(0,4, "C++");
        System.out.println(sb);  // C++
    }
}
