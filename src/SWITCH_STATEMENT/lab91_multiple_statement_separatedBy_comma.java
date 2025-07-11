package SWITCH_STATEMENT;

public class lab91_multiple_statement_separatedBy_comma {
    public static void main(String[] args) {
        int item_code=001;
        switch(item_code){
            case 001,002,003:
                System.out.println("All of them are Eletronic gaget");
                break;
            case 006,007,014:
                System.out.println("this is Match");
                break;
            default:
                System.out.println("non of these");

        }
    }
}
