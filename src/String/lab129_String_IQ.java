package String;

public class lab129_String_IQ {
    public static void main(String[] args) {
        String str1= "Hello";
        String str2= "Hello";
        String str3= new String("Hello");
        System.out.println(str1==str2); // true
        System.out.println(str1==str3); // false
        System.out.println(str1.equals(str2));  // true
        // concat
        System.out.println(str1.concat(str3)); //HelloHello
    }
}
