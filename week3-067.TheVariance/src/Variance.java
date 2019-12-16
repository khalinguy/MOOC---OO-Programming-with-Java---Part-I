import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number: list){
            sum = sum + number;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average = (double)sum(list)/list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        double variance = 0.0;
        double average = average(list);
            for (int number:list){
                variance += Math.pow(number - average, 2.0);
            }
            variance = variance/(list.size()-1);
            return variance;
        // write code here
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
