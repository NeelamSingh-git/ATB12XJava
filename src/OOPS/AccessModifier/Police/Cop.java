package OOPS.AccessModifier.Police;

public class Cop {
    private int gun;
    String ICard;
    // create parameterized constructor
    public Cop(int gun){
        this.gun = gun;
    }
    protected void CanIShoot(){
        System.out.println("Yes You can shoot");

    }
    void default_func(){

        // it is like protected, accessable within package
    }
}
