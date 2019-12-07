
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
    // Top ten by goals
    System.out.print("Top ten by goals \n");
    NHLStatistics.sortByGoals();
    NHLStatistics.top(10);
    
    // Top 25 by penalty amounts
    System.out.print("Top 25 by penalty amounts \n");
    NHLStatistics.sortByPenalties();
    NHLStatistics.top(25);
    
    // Sidney Crosby statistics
    System.out.print("Sidney Crosby statistics \n");
    NHLStatistics.searchByPlayer("Sidney Crosby");
    
    // Philadelphia Flyers statistics
    System.out.print("Philadelphia Flyers statistics \n");
    NHLStatistics.teamStatistics("PHI");
    
    //Anaheim Ducks ordered by points
    System.out.print("Anaheim Ducks statistics ordered by points \n");
    NHLStatistics.sortByPoints();
    NHLStatistics.teamStatistics("ANA");
    }
}
