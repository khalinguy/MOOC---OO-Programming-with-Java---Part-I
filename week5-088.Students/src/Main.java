
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();
        while(true){
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()){
                break;
            }
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            list.add( new Student(name,studentNumber));
        }
        
        for (Student student: list){
            System.out.println(student);
        }
        System.out.println("Give search term:");
        String search = reader.nextLine();
        System.out.println("Result:");
        for(Student student: list){
            if (student.getName().contains(search)){
                System.out.println(student);
            }
        }
        
    }
}