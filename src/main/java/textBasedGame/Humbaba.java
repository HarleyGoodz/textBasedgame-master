/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textBasedGame;

/**
 *
 * @author Silent Voice
 */
public class Humbaba extends Minion {
    private int Health;
    private String Name;
    
    public Humbaba(String Name, int Health){
        this.Health = Health;
        this.Name = Name;
    }
    
    
    @Override
    public int skillOne(){
       int skillOneDamage = (int) (Math.random() * (25 - 10 + 1)) + 10;
       
       System.out.println("Humbaba uses Blazing Roar! Deals " + skillOneDamage + " damage.");
       
       return skillOneDamage;
    }
    
    @Override
    public void takeDamage(int damage){
        Health -= damage;
        
        if(Health < 0)
            Health = 0;
    }
    
    @Override
    public int getHealth(){
        
        return Health;
    }
    
     @Override
    public String getName(){
        
        return Name;
    }
    
    @Override
    public String toString(){
        
        return Name + "'s Health: " + Health;
    }
    
}
