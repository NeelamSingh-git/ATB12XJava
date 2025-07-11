package Array;

public class lab146_Array_Sum {
    public static void main(String[] args) {
        int[] number= {10,23,2,78};
        int sum= 0;
        for(int i = 0;i< number.length; i++){
            sum= sum+number[i];
        }
        System.out.println("the sum is: "+sum);
    }
}
