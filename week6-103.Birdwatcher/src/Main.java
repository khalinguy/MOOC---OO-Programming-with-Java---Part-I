import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Birdwatcher watcher1 = new Birdwatcher();
        while (true){
            System.out.print("?");
            String option = reader.nextLine();
            if (option.equals("Add")){
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine();
                watcher1.addBird(new Bird(name,latinName));
            }
            if (option.equals("Observation")){
                System.out.print("What was observed:?");
                String observed = reader.nextLine();
                watcher1.Observation(observed);
            }
            if (option.equals("Statistics")){
                watcher1.printAll();
                
            }
            
            if (option.equals("Show")){
                System.out.print("What?");
                String show = reader.nextLine();
                watcher1.printBird(show);
            }
            if(option.equals("Quit")){
                break;
            }
        }
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            
    }
}
