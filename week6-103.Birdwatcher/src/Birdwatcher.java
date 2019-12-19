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
public class Birdwatcher {
    private ArrayList<Bird> watch;
            
    public Birdwatcher(){
        this.watch = new ArrayList<Bird>();
    }
    public void addBird(Bird bird){
        watch.add(bird);
    }
    public void Observation(String name){
        for (Bird bird:watch){
            if (bird.getName().equals(name)){
                bird.setObserved();
            return;
            }
        }
        System.out.println("Is not a bird!");
    }
    public void printBird (String name){
        for (Bird bird:watch){
            if (bird.getName().equals(name)){
                System.out.println(bird.toString());
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
    public void printAll(){
        for(Bird bird:watch){
            System.out.println(bird);
        }
    }
}
