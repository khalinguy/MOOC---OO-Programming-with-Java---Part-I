/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Linh Nguyen
 */
public class Counter {
    private int number;
    private boolean check;
    
    public Counter(){
        this(0);
    }
    
    public Counter(int startingValue){
        this.number = startingValue;
    }
    
    public Counter(boolean check){
        this(0);
        this.check = check;
    }
    
    public Counter(int startingValue, boolean check){
        this.number = startingValue;
        this.check = check;
        
    }
    
    public int value (){
        return this.number;
    }
    public void increase(){
        this.number ++;
    }
    public void decrease(){
        this.number --;
        if (check == true && this.number < 0){
            this.number = 0;
        } 
    }
    
    public void increase(int increaseAmount){
        if (increaseAmount > 0){
            this.number += increaseAmount;
        } 
    }
    public void decrease(int decreaseAmount){
        if (decreaseAmount>=0){
            number -= decreaseAmount;
            if (check == true && this.number < 0){
                this.number = 0;
            } 
        } 
    }
}
