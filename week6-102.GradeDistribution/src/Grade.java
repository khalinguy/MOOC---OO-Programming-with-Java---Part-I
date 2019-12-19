/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Linh Nguyen
 */
public class Grade {
    private int [] grades;
    private ArrayList<Integer> scores;
    private int acceptCount;
    
    public Grade(){
        scores = new ArrayList<Integer>();
        grades = new int [6];
    }
    
    public void addScore(int score){
        scores.add(score);
    }
    
    public void gradeCalculation(){
        for (int score:scores){
            if (score>= 0 && score <= 29) {
                grades[0]++;
            }
     
            if (score >= 30 && score <= 34) {
                grades[1]++;
                acceptCount ++;
            }

            if (score >= 35 && score <= 39) {
                grades[2]++;
                acceptCount ++;
            } 
            
            if (score >= 40 && score <= 44) {
                grades[3]++;
                acceptCount ++;
            }
        
            if (score >= 45 && score <= 49) {
                grades[4]++;
                acceptCount ++;
            }

            if (score >= 50 && score <= 60) {
                grades[5]++;
                acceptCount ++;
            }
 
        }
    }
    public void printGrade(){
        System.out.println("Grade distribution:");
        for (int i = 5; i>= 0; i--){
            System.out.print(i+ ":");
            printStars(grades[i]);
            System.out.println("");
        }
    }
    
    public static void printStars(int count){
        for (int i = 0; i<count; i++){
            System.out.print("*");
        }
    }
    public double acceptancePercentage(){
        if (scores.size()>0){
        return 100 * acceptCount/scores.size();
        }
        return 0;
    }       
}
