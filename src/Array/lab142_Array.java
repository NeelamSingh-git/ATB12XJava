package Array;

public class lab142_Array {
    public static void main(String[] args) {
        int marks[]= {51,20,80,65,98};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //--------------------------------

        for(int i = 0; i< marks.length-1; i++){
            System.out.println(marks[i]);
        }

        //-------------------------Enhanced forloop

        for( int mark: marks){
            System.out.println(mark);
        }


    }
}
