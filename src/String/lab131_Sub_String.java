package String;

public class lab131_Sub_String {
    public static void main(String[] args) {
        // subsequence
        // it does not return string , it returns a character sequence.
         CharSequence s = "java".subSequence(1,3);  // av
         CharSequence s1 = "java".subSequence(1,1);  // nothing
        System.out.println(s);
        System.out.println(s1);

    }
}
