package Array;

public class lab148_IQ_2nd_Heighest_Without_Sort {
    public static void main(String[] args) {
        int numbers[]= {10,20,45,7,52,22};
        int highest= Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for(int num: numbers){
            if(num>highest){
                secondHighest = highest;
                highest= num;
            }else if
            (    num> secondHighest && num != highest){
                secondHighest= num;
            }

        }
        System.out.println(secondHighest);
    }
}
