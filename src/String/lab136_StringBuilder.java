package String;

public class lab136_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb. append(" World");   // Hello World
        sb.reverse();           // dlroW olleW
        System.out.println(sb);
    }
}
