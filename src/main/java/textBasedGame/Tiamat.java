/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textBasedGame;

/**
 *
 * @author Silent Voice
 */
import java.util.Scanner;
public class Tiamat extends Enemy{
    private int Health;
    private String Name;

    private AudioManager audioManager;

    public Tiamat(AudioManager audioManager) {
        this.audioManager = audioManager;
    }
    
    public Tiamat(String Name, int Health){
        this.Name = Name;
        this.Health = Health;
    }

    
    
    @Override
    public int skillOne(){
        int skillOneDamage = (int) (Math.random() * (20 - 15 + 1)) + 15;
        
        System.out.println("Tiamat uses Chaos Wave! Deals " + skillOneDamage + " damage.");
        
        return skillOneDamage;
    }
    
    @Override
    public int skillTwo(){
        int skillTwoDamage = (int) (Math.random() * (30 - 20 + 1)) + 20;
        
        System.out.println("Tiamat uses Storm’s Embrace! Deals " + skillTwoDamage + " damage.");
     
        return skillTwoDamage;
    }
    
    @Override
    public int skillThree(){
        int skillThreeDamage = (int) (Math.random() * (50 - 30 + 1)) + 30;
        
        System.out.println("Tiamat uses Celestial Deluge! Deals " + skillThreeDamage + " damage.");
        
        return skillThreeDamage;
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
        
        int maxHealth = 1000; 
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
        healthBar.append("]");
    
        
        return Name + "'s Health: " + Health + "/" + maxHealth + " " + healthBar.toString();
}

    public void Tiamat_Backstory(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-BACKSTORY-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("Tiamat, a primordial being of chaos and creation, born from the very essence of the cosmos.\n"+
        "She existed in the abyss, a vast sea of raw,\n"+
         "untamed power, where stars and worlds were yet to be formed.\n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();

         System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("Tiamat's purpose was to give birth to life, but her creations were monstrous, \n"+
        "chaotic beings born from her wrath and untethered energy.\n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();


         System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("Your mission is to annihilate this being, to stop her hideous creations in conquering your world!\n");
         System.out.println("Press 'Enter' to FIGHT");
         scanner.nextLine();
    }

    
}