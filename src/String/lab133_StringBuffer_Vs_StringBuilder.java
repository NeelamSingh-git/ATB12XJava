package String;

public class lab133_StringBuffer_Vs_StringBuilder {
    public static void main(String[] args) {
        //90% use normal string
        String s="Apple";
        String s1 = new String("Apple");

        // <10% use StringBuffer, StringBuilder

        StringBuffer stringBuffer= new StringBuffer("Apple");
        StringBuilder stringBuilder= new StringBuilder("Apple");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());


    }
}
