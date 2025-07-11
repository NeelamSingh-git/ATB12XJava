package TASK;

public class lab9_Hacker_Rank_Challenge {
    public static void main(String[] args) {
        // take inputs
        //String s1 = args[0];
        //String s2 = args[1];
        //String s3 = args[2];

       // System.out.println(s1);
        //System.out.println(s2);
        //System.out.println(s3);

        // convert into integer
        int s1 = Integer.parseInt(args[0]);
        int s2 = Integer.parseInt(args[1]);
        int s3 = Integer.parseInt(args[2]);

        String result =(s1==s2 && s2==s3)? "Acute Triangle" : (s1==s2 || s2==s3 || s3==s1)? " Isosceles Triangle" : "Scalean Triangle";
        System.out.println(result);
    }
}
