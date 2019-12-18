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
public class Team {
    private String name;
    private ArrayList<Player> team;
    private int maxSize;
    
    public Team (String name){
        this.name = name;
        this.team = new ArrayList<Player> ();
        this.maxSize = 16;
    }
    
    public void addPlayer(Player name){
        if (team.size() < maxSize){
            team.add(name);
        }
    }    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public void printPlayers(){
        for (Player players: team){
            System.out.println(players);
        }
    }
    public int size(){
        return team.size();
    }
    
    public int goals(){
        int sum = 0;
        for (Player player: team){
            sum += player.goals();
        }
        return sum;
    }
    
    public String getName (){
        return name;
    }
}
