import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the word: ");
        String word = reader.nextLine();
        System.out.println("Length of the end part: ");
        int length = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + substring(word,length));
    }
    public static String substring(String text, int number){
        String lastpart = text.substring(text.length()-number);
        return lastpart;
    }
}
