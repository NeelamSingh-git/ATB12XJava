package SWITCH_STATEMENT;

import java.util.Scanner;

public class lab85_RealUse_inAutomation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Browser");
        String browser = scanner.next();
        browser = browser.toLowerCase();
        switch(browser)
        {
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("............");
                System.out.println("TC1.....");
                System.out.println("TC2.....");
                break;
            case "fireFox":
                System.out.println(".......");
                break;
            case "edge":
                System.out.println("Execute the edge code");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;


        }
    }
}
