
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        while (true){
        System.out.print("Type the password: ");
        String pass = reader.nextLine();
        if (pass.equals(password)){
            break;
        } else {
            System.out.println("Wrong!");
          }
        }
        System.out.println("Right!\nThe secret is: nznmvat");
        // Write your code here
    }
}
