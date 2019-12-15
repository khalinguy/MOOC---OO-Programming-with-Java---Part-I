import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String word = reader.nextLine();
        System.out.println("Type the second word: ");
        String word2 = reader.nextLine();
        System.out.println(indexOf(word,word2));
    }
    public static String indexOf (String text, String text2){
        int index = text.indexOf(text2);
        if (index != -1){
            String result = "The word '" + text2 +"' is found in the word '" + text +"'.";
            return result;
        } else {
            String result = "The word '" + text2 +"' is not found in the word '" + text +"'.";
            return result;
        }
    }
}
