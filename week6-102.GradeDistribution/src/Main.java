import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Grade grade = new Grade();
        System.out.println("Type exam scores, -1 completes");
        while (true){
            int score = Integer.parseInt(lukija.nextLine());
            if (score >= 0 && score <= 60){
                grade.addScore(score);
            }
            if(score == -1){
                break;
            }
        }
       
        grade.gradeCalculation();
        
        grade.printGrade();
        
        System.out.println("Acceptance percentage:" + grade.acceptancePercentage());

    }
    
    
}
