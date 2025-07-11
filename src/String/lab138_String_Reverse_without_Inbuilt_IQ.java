package String;

public class lab138_String_Reverse_without_Inbuilt_IQ {
    public static void main(String[] args) {
        String name= "Disha";
        for(int i= name.length()-1; i>=0; i--)
        {
            System.out.print(name.charAt(i));
        }
    }
}
