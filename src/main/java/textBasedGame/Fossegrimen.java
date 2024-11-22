/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textBasedGame;

/**
 *
 * @author Silent Voice
 */
public class Fossegrimen extends Minion {
    private int Health;
    private String Name;
    
    
    public Fossegrimen(String Name, int Health){
        this.Health = Health;
        this.Name = Name;
    }
    
    
    @Override
    public int skillOne(){
       int skillOneDamage = (int) (Math.random() * (25 - 10 + 1)) + 10;
       
       System.out.println("Fossegrimen uses Enchanted Sonic! Deals " + skillOneDamage + " damage.");
       
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
        
        int maxHealth = 100; 
        int barLength = 20; 
        int filledLength = (int) ((double) Health / maxHealth * barLength);
    
        
        final String RED = "\u001B[31m"; 
        final String RESET = "\u001B[0m"; 
    
        
        StringBuilder healthBar = new StringBuilder("[");
        for (int i = 0; i < barLength; i++) {
            if (i < filledLength) {
                healthBar.append(RED).append("■").append(RESET); 
            } else {
                healthBar.append(" "); 
            }
        }
        healthBar.append("]\n\n\n\n\n\n");
    
        
        return Name + "'s Health: " + Health + "/" + maxHealth + " " + healthBar.toString();
}
}
