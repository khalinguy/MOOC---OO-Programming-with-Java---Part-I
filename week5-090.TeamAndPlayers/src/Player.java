/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Linh Nguyen
 */
public class Player {
    private String name;
    private int amountOfGoals;
    
    public Player (String name){
        this(name,0);
    }
    public Player (String name, int amountOfGoals){
        this.name = name;
        this.amountOfGoals = amountOfGoals;
    }
    
    public String getName(){
        return name;
    }
    
    public int goals(){
        return amountOfGoals;
    }
    
    public String toString(){
        return "" + name +", goals " + amountOfGoals; 
    }
}
