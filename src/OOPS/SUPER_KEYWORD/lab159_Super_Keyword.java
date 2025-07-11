package OOPS.SUPER_KEYWORD;

public class lab159_Super_Keyword {
    public static void main(String[] args) {

    }

}

class father{
    father(){
        System.out.println("DC father");        // constructor
    }
    int gold = 10;

    void home(){
        System.out.println(" father home");
    }
}

class son extends father{
    son(){
        super();   // call father constructor
    }
    void bike(){};
    void new_home(){
        super.home();{
            System.out.println(super.gold);  // father home and gold
        this.bike();
        }
    }

}
