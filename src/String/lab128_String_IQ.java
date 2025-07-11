package String;

public class lab128_String_IQ {
    public static void main(String[] args) {
        String s1= "Hello";   // SCP
        String s4 ="Hello";    // SCP  // 1string in SCP
        String s9 ="Hello";    // SCP  // still 1string
        String s11 ="hello";    // SCP  // now 2 string


        String s2= new String("Hello"); // OA
        String s3= new String("Hello"); // OA   // THERE ARE 2 STRING IN OA
        String s10= new String("Hello"); // OA   //  now 3 string
        String s12= new String("hello"); // OA   //  now 4 string
        // ==   -> in string it checks references location
        System.out.println(s1==s3);     // false because s1 is present in SCP and s3 is in OA
        System.out.println(s1==s2); // false
        System.out.println(s2==s3); // false  because they both are in OA but separate.

        System.out.println(s1==s4); // true because they both are pointed to one object
        System.out.println(s3==s10);  // false


        // equals  -> check content
        System.out.println(s1.equals(s2));  // true
        System.out.println(s1.equals(s3));  // true
        System.out.println(s3.equals(s12));  // false
        // equalsIgnoreCase
        System.out.println(s3.equalsIgnoreCase(s12));   // true

    }
}
