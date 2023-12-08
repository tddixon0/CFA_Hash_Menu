import java.util.Scanner;

public class Driver {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        String choice;
        System.out.println("Welcome to CFA! What would you like to do?");
        choice = input.nextLine();
        if (choice.equals("help")) {
            JDBC.main();
            System.out.println("What would you like to do?");
            choice = input.nextLine();
        }
        if (choice.equals("order")) {
            System.out.println("Can I have a name for the order?");
            name = input.nextLine();
            System.out.println("Okay " + name + ", what can I get for you?");
            
        }
    }
}
