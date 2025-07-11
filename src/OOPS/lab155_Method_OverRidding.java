package OOPS.Polymorphism;

public class lab155_Method_OverRidding {
    public static void main(String[] args) {
        Pramod p = new Pramod();
        p.P1(); // pramod
        p.home(); // 3bhk

        father f = new father();
        f.home();  // 2bhk
        f.f1(); // father

        father f2= new Pramod(); // father referance with child object. dynamic dispatch
        f2.home();  // 3bhk

    }
}
