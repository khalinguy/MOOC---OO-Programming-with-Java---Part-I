import java.util.Random;
import java.util.ArrayList;

public class PasswordRandomizer {
    private int length;
    private Random random;
    private String character;
    private String result;
    
    // Define the variables

    public PasswordRandomizer(int length) {
        this.length = length;
        random = new Random();
        character = "abcdefghijklmnopqrstuvwxyz";
        this.result = "";
        // Initialize the variable
    }

    public String createPassword() {
        this.result = "";
        for (int i = 0; i < this.length; i++){
            char symbol = character.charAt(random.nextInt(25));
            this.result += symbol;
            
        }
        // write code that returns a randomized password
        return this.result;
    }
}
