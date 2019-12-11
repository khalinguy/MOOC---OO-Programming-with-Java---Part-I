import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int loop = 0;
        while (true) {
            loop ++;
            System.out.print("Guess a number: ");
            int chosen = Integer.parseInt(reader.nextLine());
            if (chosen < numberDrawn){
                System.out.println("The number is greater, guesses made: " + loop);
            } else if (chosen > numberDrawn) {
                System.out.println("The number is lesser, guesses made: " + loop);
            } else if (chosen == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }

        }
        
        // program your solution here. Do not touch the above lines!
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
