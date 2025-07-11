package OOPS;

public class lab156_Encapsulation {
    public static void main(String[] args) {
        VWO_Login vwoLogin = new VWO_Login("admin", "123");
        System.out.println(vwoLogin.password);  // admin
        vwoLogin.password = "789";
        System.out.println(vwoLogin.password);


      //  System.out.println(----------------------);
        GoodVWOLogin goodVWOLogin = new GoodVWOLogin("neelam", "236");
      //  System.out.println(GoodVWOLogin.password1); // cant access the password due to private
            // 1st layer encapsulation that means make attribute private
            // if you try to access the user name use get/set method
        System.out.println(goodVWOLogin.getPassword1());
        System.out.println(goodVWOLogin.getUser_name());
goodVWOLogin.setPassword1("hello");;
        System.out.println(goodVWOLogin.getPassword1());
    }

}
class VWO_Login{
    String username;
    String password;

    public VWO_Login(String password, String username) {
        this.password = password;
        this.username = username;
    }               //   parameterized constructor          // this is not encapsulation

}
class GoodVWOLogin{
   private String user_name ;                   // private is only available inside the class
    private String password1;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public GoodVWOLogin(String user_name, String password1) {
        this.user_name = user_name;                 //parameterized constructor is created
        this.password1 = password1;

    }
}