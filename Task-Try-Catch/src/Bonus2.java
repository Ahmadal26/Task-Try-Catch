import java.util.Scanner;

public class Bonus2 {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);

        String validUsername = "Coded";
        String validPassword = "Coded123";

        for (int i = 5; i > 0; i--) {

            try {

                System.out.println("Please enter your username:  ");
                String userName = myScanner.nextLine();
                System.out.println("Please enter your password:");
                String password = myScanner.nextLine();
                if (userName.equals(validUsername) && password.equals(validPassword)) {
                    System.out.println("Welcome!!!");
                    break;
                } else {
                    throw new Exception("Invalid credentials");
                }

            } catch (Exception e) {
                System.out.println("error, Password or Username is invalid please try again " + e.getMessage());

            }

        }
        myScanner.close();
    }
}
