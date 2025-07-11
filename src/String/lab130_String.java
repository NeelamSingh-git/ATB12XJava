package String;

public class lab130_String {
    public static void main(String[] args) {
        String s = "Java";
        char c= s.charAt(2);
        System.out.println(c);  //v
        System.out.println(s.codePointAt(0)); //  gives unicode char  //74

            // compare to ignore case and gives integer value
        int result = "abc ".compareToIgnoreCase("ABC"); //  1
        int result1 = "abc ".compareTo("ABC"); //
        System.out.println(result);
        System.out.println(result1);
// indexOf
        int idx = "Java".indexOf("v");  // 2
        System.out.println(idx);

        // empty
        boolean b= "".isEmpty();  // true
        boolean b1= " ".isEmpty();  // false
        System.out.println(b);
         // join
        String s11 = String.join("-", "java","python");
        String s16 = String.join(",", "java","python");
        System.out.println(s11);
        System.out.println(s16);
        // last index of
        int idx1= "Java".lastIndexOf("a");  //3
        System.out.println(idx1);
        //replace
        String str11 = "Java".replace("a","o"); // Jovo
        System.out.println(str11);
        // startwith
        boolean b2= "Java".startsWith("Ja");
        boolean b3= "Java".startsWith("ja");
        System.out.println(b2);  // true
        System.out.println(b3);  // false
    }
}
