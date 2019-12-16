import java.util.Scanner;

public class Palindromi {

    public static String reversed (String text){
        int i = 1;
        String reversed = "";
        while (i <= text.length()){
            char character = text.charAt(text.length()-i);
            reversed += character;
            i ++;
        }
        return reversed;
    }
    
    public static boolean palindrome(String text) {
        String word = reversed(text);
        if ( word.equals(text)){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();  
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
