package Increment_Decrement;

public class lab68_Post_Increment {
    public static void main(String[] args) {
        // print first then increase
        int a_post = 10;
        int b = a_post++;
        System.out.println(a_post);
        System.out.println(b);

        // ERT
        //  line no     /  a_post   /    b
        //  6          /    10      / na
        //  7         /     11      /  10
        //  8         /     11      /  na
        //  9       /   na      /    10


        // int a_post = 10;
        //System.out.println(a_post++);   // 10
        //System.out.println(a_post);       // 11
    }
}
