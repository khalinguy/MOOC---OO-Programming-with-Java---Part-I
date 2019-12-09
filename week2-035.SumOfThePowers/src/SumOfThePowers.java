import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int power = Integer.parseInt(reader.nextLine());
        int begin = 0;
        int sum = 0;
        while (begin <= power){
            sum += (int)Math.pow(2, begin);
            begin ++;
            
        }
        System.out.println("The result is "+sum);

    }
}
