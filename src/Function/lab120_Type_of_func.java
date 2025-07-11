package Function;

public class lab120_Type_of_func {
    public static void main(String[] args) {
        // no return type or void does not return anything
non_Return_Type_Fnc();
int a = Return_Type_Fnc();
        System.out.println(a);
    }
    // non return type fnc does not return anything only printing
    static void non_Return_Type_Fnc(){
        System.out.println("Hi Non ReturnType");
    }
// return type func return a particular data type
    static int Return_Type_Fnc(){
        System.out.println("Hi Return Type fnc");
        return 10;
    }
}
