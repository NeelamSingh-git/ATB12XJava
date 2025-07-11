package SWITCH_STATEMENT;

public class lab87_Interview_Qstn {
    public static void main(String[] args) {
        //is it valid output? what is the output?
        char ch ='A';
        switch(ch){
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");
        }
    }
}
// char is also integer.
// match ascii is output
