package String;

public class lab132_Sub_Srting {
    public static void main(String[] args) {
        //substring return a string that start with the specified index
        String s = "java".substring(1);
        String s1 = "java".substring(1,3);
        System.out.println(s);  //ava
        System.out.println(s1);  //av

        // char[]   toCharArray  -> it divide into char
        char[] c= "java".toCharArray();
        System.out.println(c);  // 'j','a','v','a'
         //trim  -> remove extra space
        String tr = "   java  ".trim();
        System.out.println(tr);

        // isblank()
        boolean sp = "   ".isBlank();
        System.out.println(sp); //true

        // repeat()
        String rp = "ja".repeat(4);
        System.out.println(rp);

        // equalsIgnoreCase
        boolean b = "Java".equalsIgnoreCase("JAVA");
        System.out.println(b);  // true

        // format
        String s2 = String.format("%s = %d","age",20);
        System.out.println(s2); // age= 20

        // line count

        long count = "gh\na\nnm\n".lines().count();
        System.out.println(count);  // 3






    }
}
