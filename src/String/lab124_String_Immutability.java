package String;

public class lab124_String_Immutability {
    public static void main(String[] args) {
        String name= "Pramod";// SCP - STRING cONSTANT pOOL
        name.toUpperCase(); // Another string is created
        System.out.println(name);
        // Pramod  // because we not assigned
    }
}
