
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("Length of the first part: ");
        int length = Integer.parseInt(reader.nextLine());
        System.out.println("Result: "+subString(word,length));
    }
    public static String subString (String text, int number){
        String firstpart = text.substring(0,number);
        return firstpart;
    }
}
