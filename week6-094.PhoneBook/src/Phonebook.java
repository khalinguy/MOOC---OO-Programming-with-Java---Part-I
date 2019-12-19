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
public class Phonebook {
    private ArrayList<Person> Phonebook;
    
    public Phonebook (){
        this.Phonebook = new ArrayList <Person> ();
    }
    
    public void add (String name, String number){
        this.Phonebook.add(new Person(name,number));
    }
    
    public void printAll(){
        for (Person person: Phonebook){
            System.out.println(person);
        }
    }
    
    public String searchNumber(String name){
        for (Person person: Phonebook){
            if (person.getName().equals(name)){
                return person.getNumber();
            }
        }
        return "number not known";
    }
}

