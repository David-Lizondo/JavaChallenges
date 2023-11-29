
package userinfoapp;

public class UserInfoApp {

    
    public static void main(String[] args) {
        // Primitive type
        
        int age = 38;
        String name = "David Taaveti";
        double weight = 79.85;
        System.out.println("Hello " + name + "\nYour weight is " + weight+ "\nAnd you´re " + age + " years old");
        System.out.println("");
        // Conditional
        if (args.length > 0) {
            String username = args[0];
            System.out.println("Hello, " + username + "! This is a simple Java application.");
        } else {
            System.out.println("You must provide a username as an argument to the program.");
        }
    
    }
    
}
