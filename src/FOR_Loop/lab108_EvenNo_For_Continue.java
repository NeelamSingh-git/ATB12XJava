package FOR_Loop;

public class lab108_EvenNo_For_Continue {
    public static void main(String[] args) {
        for (int i = 0; i <=50 ; i++) {
            if(i%2==1){
                continue;
            }
            System.out.println("Even->" +i);
        }
    }
}
