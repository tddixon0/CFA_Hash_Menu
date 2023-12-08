import java.util.Scanner;

public class Driver {
    public static void main (String[] args) {
        Driver driver = new Driver();
        System.out.println("Welcome to CFA! What would you like to do?");
        driver.order();
    }
    public void order () {
        Scanner input = new Scanner(System.in);
        String name;
        String choice;
        choice = input.nextLine();
        if (choice.equals("help")) {
                System.out.println("What part of the menu would you like to see?");
                choice = input.nextLine();
                JDBC.help(choice);
                System.out.println("What would you like to do?");
                order();
        }
        if (choice.equals("order")) {
            System.out.println("Can I have a name for the order?");
            name = input.nextLine();
            System.out.println("Okay " + name + ", what can I get for you?");
            choice = input.nextLine();
            while (!choice.equals("done")) {
                JDBC.cart(choice);
                System.out.println("Got it!");
                choice = input.nextLine();
            }
            JDBC.total();
            input.close();
        }
        else {
            System.out.println("Sorry, what was that?");
            order();
        }
    }
}
