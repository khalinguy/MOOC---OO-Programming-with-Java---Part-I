
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int i = 1;
        String reserved = "";
        while (i <= text.length()){
            char character = text.charAt(text.length()-i);
            reserved = reserved + character;
            i++;
            
        }
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        return reserved;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
