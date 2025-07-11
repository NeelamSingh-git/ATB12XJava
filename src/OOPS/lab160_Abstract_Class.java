package OOPS;

public class lab160_Abstract_Class {
    public static void main(String[] args) {
son s = new son();
s.loan_50K();
    }
}
class normal{
    // complect class
}

abstract class Father{
    abstract void loan_50K();

}
 class son extends Father{

     @Override
     void loan_50K() {
         System.out.println("loan given...");
     }
 }