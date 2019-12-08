
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while (true){
            System.out.print("Give the temperature: ");
            double tem = Double.parseDouble(reader.nextLine());
            if (tem < -30 || tem > 40){
                System.out.println("Temperature is not added to the graph.");
            } else {
                Graph.addNumber(tem);
            }
        }
       
    }
}