import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
                
        System.out.print("First: ");
        int begin = Integer.parseInt(reader.nextLine());
        System.out.print("Second: ");
        int last = Integer.parseInt(reader.nextLine());
        while (begin <= last){
            sum += begin ;
            begin++;
            
        }
        System.out.println("The sum "+sum);
            
    }
}
