package Array;

public class lab143_Array_Max_No {
    public static void main(String[] args) {
        int[] array= {40,50,60,70,90};
        int max = array[0];
        int min = array[0];
        // logic
        for(int i=0; i< array.length; i++){
            if (array[i]>max){
                max=array[i];
            }

            }
        for(int i=0; i<array.length; i++){
            if(array[i]<min){
                min= array[i];
            }
        }
        System.out.println("maximum no is- "+max);
        System.out.println("minimum no is- "+min);
        }

    }

