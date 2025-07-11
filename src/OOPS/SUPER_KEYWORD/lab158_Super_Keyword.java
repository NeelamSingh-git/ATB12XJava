package OOPS.SUPER_KEYWORD;

public class lab158_Super_Keyword {

}
class Base_Class{
    private String browser;
   // generate constructor

    public Base_Class(String browser) {
        this.browser = browser;
    }


    // generate gater seter


    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if(isAdmin) {
            this.browser = browser;
        }else {
            System.out.println("Change browser is not allowed, is not a Admin");
        }
    }
        // method overloading
    void open_browser(){
        System.out.println("Opening Browser");
    }
    void open_browser(String browserName){
        System.out.println("open browser  " +browserName);

    }
    void close_browser(){
        System.out.println("close browser ");
    }

    class Test_Case1 extends Base_Class {
        public void tc(){};

        public Test_Case1(String browser){
            super(browser);     // calling parents
            super.open_browser();   // calling parents
            super.open_browser("chrome");   // calling parents
            super.close_browser();  // calling parents

            this.tc();  // calling my func
        }

    }








}
