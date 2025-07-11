package String;

public class lab134_StringBuffer_StringBuilder_IQ {
    public static void main(String[] args) {
        StringBuffer stringBuffer= new StringBuffer("Piu");
        stringBuffer.append("Majhi");
        System.out.println(stringBuffer);  // only one string is created because StringBuffer /StringBuilder is mutable in nature
         String s1= "Piu";
         s1= s1+ "Majhi";
        System.out.println(s1);     // here two strings are created. because immutable nature
    }
}
