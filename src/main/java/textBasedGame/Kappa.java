/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textBasedGame;

/**
 *
 * @author Silent Voice
 */
public class Kappa extends Minion{
    private int Health;
    private String Name;
    
    
    public Kappa(String Name, int Health){
        this.Name = Name;
        this.Health = Health;
    }
    
    @Override
    public int skillOne(){
       int skillOneDamage = (int) (Math.random() * (25 - 10 + 1)) + 10;
       
       System.out.println("Kappa uses Slash! Deals " + skillOneDamage + " damage.");
       
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
