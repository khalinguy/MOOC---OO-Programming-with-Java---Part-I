import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int add = 1;
        int sum = 0;
              
        System.out.print("Until what? ");
        int var = Integer.parseInt(reader.nextLine());
        while (add <= var){
            sum += add;
            add ++;
        }
        System.out.println("Sum is "+sum);

    }
}
