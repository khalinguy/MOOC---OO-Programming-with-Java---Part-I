
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int start = 1;
        System.out.print("Up to what number? ");
        int user = Integer.parseInt(reader.nextLine());
        while (start<=user){
            System.out.println(start);
            start ++;
        }
        // Write your code here
        
    }
}
