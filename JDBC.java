import java.sql.*;
public class JDBC {
    public static void help (String part){
        String url = "jdbc:mysql://localhost:3306/CFAMenu";
        String username = "ethan";
        String password = "root";
        String menu = part;
        try{
            Class.forName ("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            if (menu.equals("Sides")) {
                ResultSet resultSet = statement.executeQuery("select * from " + menu);
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getDouble(4));
                }
                connection.close();
            }
            if (menu.equals("Treats")) {
                ResultSet resultSet = statement.executeQuery("select * from " + menu);
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getDouble(3));
                }
                connection.close();
            }
            if (menu.equals("Entree")) {
                ResultSet resultSet = statement.executeQuery("select * from " + menu);
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getDouble(4));
                }
                connection.close();
            }
            if (menu.equals("Beverages")) {
                ResultSet resultSet = statement.executeQuery("select * from " + menu);
                while (resultSet.next()) {
                    System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getDouble(3) + " " + resultSet.getInt(4));
                }
                connection.close();
            }
            if (menu.equals("Salads")) {
                ResultSet resultSet = statement.executeQuery("select * from " + menu);
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getDouble(3));
                }
                connection.close();
            }
            if (menu.equals("Breakfast")) {
                ResultSet resultSet = statement.executeQuery("select * from " + menu);
                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3) + " " + resultSet.getDouble(4));
                }
                connection.close();
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void cart(String item) {
        double sum = 0;
        double price = 0;
        String food = item;
        switch(food) {
//begin entrees
            case "1":
            case "cfa sandwich":
				price = 4.75;
                sum+=price;
                break;

            case "cfa deluxe":
            case "1 deluxe":
                price = 5.45;
                sum+=price;
                break;

            case "2":
            case "spicy sandwich":
                price = 5.15;
                sum+=price;
                break;

            case "spicy deluxe":
            case "2 deluxe":
                price = 5.85;
                sum+=price;
                break;

            case "3":
                System.out.println("Would you like 5, 8, 12, or 30 nuggets?");
            case "5 nuggets":
                price = 3.00;
                sum+=price;
                break;
            case "8 nuggets":
                price = 4.75;
                sum+=price;
                break;
            case "12 nuggets":
                price = 6.88;
                sum+=price;
                break;
            case "30 nuggets":
                price = 16.59;
                sum+=price;
                break;

            case "4":
                System.out.println("Would you like 2, 3, or 4 strips?");
            case "2 strips":
                price = 3.39;
                sum+=price;
                break;
            case "3 strips":
                price = 4.99;
                sum+=price;
                break;
            case "4 strips":
                price = 6.39;
                sum+=price;
                break;

            case "5":
                price = 6.29;
                sum+=price;
                break;

            case "6":
                System.out.println("Would you like 5, 8, or 12 grilled nuggets?");
            case "5 grilled nuggets":
                price = 3.50;
                sum+=price;
                break;
            case "8 grilled nuggets":
                price = 5.59;
                sum+=price;
                break;
            case "12 grilled nuggets":
                price = 7.99;
                sum+=price;
                break;

            case "7":
                price = 7.99;
                sum+=price;
                break;

            case "8":
                price = 7.59;
                sum+=price;
                break;
            case "Filet":
                price = 4.50;
                sum+=price;
                break;
            case "Grilled Filet":
                price = 5.35;
                sum+=price;
                break;
            case "Spicy Filet":
                price = 4.90;
                sum+=price;
                break;
//begin drinks
            case "small tea":
            case "small soft drink":
            case "small soda":
                price = 1.79;
                sum+=price;
                break;
            case "small lemonaid":
            case "small sunjoy":
            case "medium tea":
            case "medium soda":
            case "medium soft drink":
                price = 2.15;
                sum+=price;
                break;
            case "large tea":
            case "large soda":
            case "large soft drink":
                price = 2.55;
                sum+=price;
                break;
            case "medium lemonaid":
            case "medium sunjoy":
                price = 2.49;
                sum+=price;
                break;
            case "large sunjoy":
                price = 2.95;
                sum+=price;
                break;
            case "gallon tea":
                price = 6.25;
                sum+=price;
                break;
            case "gallon lemonaid":
                price = 12.00;
                sum+=price;
                break;
//begin breakfast
            case "chicken biscuit":
                price = 3.49;
                sum+=price;
                break;
            case "4 minis":
                price = 4.49;
                sum+=price;
                break;
            case "10 minis":
                price = 11.19;
                sum+=price;
                break;
            case "Egg white grill":
                price = 4.85;
                sum+=price;
                break;
            case "Hash Brown scramble bowl":
                price = 4.75;
                sum+=price;
                break;
            case "Hash brown scramble burrito":
                price = 4.75;
                sum+=price;
                break;
            case "chicken egg cheese biscuit":
                price = 4.39;
                sum+=price;
                break;
            case "CEC biscuit":
                price = 4.39;
                sum+=price;
                break;
            case "BEC biscuit":
                price = 4.79;
                sum+=price;
                break;
            case "bacon egg cheese biscuit":
                price = 4.79;
                sum+=price;
                break;
            case "SEC bisciut":
                price = 4.79;
                sum+=price;
                break;
            case "sausage egg cheese biscuit":
                price = 4.79;
                sum+=price;
                break;
            case "chicken egg cheese muffin":
                price = 4.59;
                sum+=price;
                break;
            case "CEC muffin":
                price = 4.59;
                sum+=price;
                break;
            case "bacon egg cheese muffin":
                price = 3.99;
                sum+=price;
                break;
            case "BEC muffin":
                price = 3.99;
                sum+=price;
                break;
            case "sausage egg cheese muffin":
                price = 3.99;
                sum+=price;
                break;
            case "SEC muffin":
                price = 3.99;
                sum+=price;
                break;
            case "Buttered buscuit":
                price = 1.49;
                sum+=price;
                break;
            case "Hash brown":
                price = 1.49;
                sum+=price;
                break;
            case "English Muffin":
                price = 1.69;
                sum+=price;
                break;
            case "Breakfast filet":
                price = 2.00;
                sum+=price;
                break;
//begin salads
            case "Cobb salad":
            case "cobb":
                price = 9.39;
                sum+=price;
                break;
            case "Spicy Southwest Salad":
                price = 9.59;
                sum+=price;
                break;
            case "Southwest salad":
                price = 9.59;
                sum+=price;
                break;
            case "Market salad":
                price = 9.59;
                sum+=price;
                break;
            case "salad":
                price = 9.59;
                sum+=price;
                break;

//begin sides
            case "small fry":
                price = 2.09;
                sum+=price;
                break;
            case "medium fry":
            case "kale crunch side salad":
                price = 2.35;
                sum+=price;
                break;
            case "large fry":
                price = 2.75;
                sum+=price;
                break;
            case "small fruit cup":
                price = 3.00;
                sum+=price;
                break;
            case "medium fruit cup":
            case "side salad":
            case "medium mac and cheese":
                price = 3.95;
                sum+=price;
                break;
            case "cup chicken soup":
                price = 3.75;
                sum+=price;
                break;
            case "bowl chicken soup":
                price = 5.69;
                sum+=price;
                break;
            case "cup tortilla soup":
                price = 5.69;
                sum+=price;
                break;
            case "bowl tortilla soup":
                price = 7.95;
                sum+=price;
                break;
            case "cookie parfait":
            case "granola parfait":
            case "parfait":
                price = 4.65;
                sum+=price;
                break;
            case "chips":
                price = 1.99;
                sum+=price;
                break;
            case "apple sauce":
                price = 2.29;
                sum+=price;
                break;
//begin treats
            case "frosted lemonaid":
            case "frosted coffee":
                price = 5.19;
                sum+=price;
                break;
            case "cookie":
                price = 1.55;
                sum+=price;
                break;
            case "brownie":
                price = 2.15;
                sum+=price;
                break;
            case "milkshake":
                price = 4.29;
                sum+=price;
                break;
            case "icedream cup":
            case "icecream cup":
                price = 1.35;
                sum+=price;
                break;
            case "icedream cone":
            case "icecream cone":
                price = 1.69;
                sum+=price;
                break;
            default:
                System.out.println("Please enter a menu item");
        }
        sum+=price;
        String url = "jdbc:mysql://localhost:3306/CFAMenu";
        String username = "ethan";
        String password = "root";
        try {
            Class.forName ("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            String str = "insert into Cart (Item,Price) values (" + food + " , " + price + " ) ";
            statement.executeUpdate(str);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void total () {
        double sum = 0;
        String url = "jdbc:mysql://localhost:3306/CFAMenu";
        String username = "ethan";
        String password = "root";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Cart");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getDouble(2));
            }
            System.out.println("Okay! Your total is: " + sum);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
