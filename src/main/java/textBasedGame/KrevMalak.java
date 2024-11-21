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
public class KrevMalak extends Enemy {
    private int Health;
    private String Name;
    
    public KrevMalak(String Name,int Health){
        this.Health = Health;
        this.Name = Name;
    }
    
    @Override
    public int skillOne(){
        int skillOneDamage = (int) (Math.random() * (20 - 15 + 1)) + 15;
        
        System.out.println("Krev Malak uses Shadow Manipulation! Deals " + skillOneDamage + " damage.");
        
        return skillOneDamage;
    }
    
    @Override
    public int skillTwo(){
        int skillTwoDamage = (int) (Math.random() * (30 - 20 + 1)) + 20;
        
        System.out.println("Krev Malak uses Demon Summoning! Deals " + skillTwoDamage + " damage.");
        
        return skillTwoDamage;
    }
    
    @Override
    public int skillThree(){
        int skillThreeDamage = (int) (Math.random() * (50 - 30 + 1)) + 30;
        
        System.out.println("Krev Malak uses Despair Aura! Deals " + skillThreeDamage + " damage.");
        
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
        return Name + "'s Health: " + Health;
    }
    
    public void Krev_BackStory(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("----------------BACKSTORY-------------------------------\n");
        System.out.println("Krev Malak, a god blinded by greed and an insatiable hunger for power. \n"
                + "The more suffering he caused, the more powerful he becomes, feeding off the fear and hopelessness of his victims."
                + "\n\npress 'Enter to continue");
        scanner.nextLine();
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("-----------------------------------------------\n");
        System.out.println("one that went beyond personal gain,he would become the embodiment of despair itself,\n"
                + " a living nightmare capable of plunging the world into endless darkness. \n"
                + "\npress 'Enter' to continue");
        scanner.nextLine();
    }
    
    public void Krev_IncomingBattle(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("-----------------------------------------------\n");
        System.out.println("As you spot Krev Malak seated on his throne, a massive battle looms,\n"
                + " shrouded in shadows and flames. With a fierce charge, you teleported to Krev,\n"
+ "unleashing your skills in a devastating attack aimed at annihilating the god somehow, Krev blocked your attack...\n"
               + "-----------------------------------------------\n"
                + "PREPARE FOR BATTLE!\n"
+ "\npress 'Enter' to FIGHT!");
        scanner.nextLine();
    }
    
    public void Krev_Defeat(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\n-------------------VICTORY ENDING----------------------------\n");
        System.out.println("Finally, the God of Despair can prevail no more\n"
                + "As Krev lies defeated, you stood at the edge of victory and honor, while Krev is in the brink of death,\n"
                + "the connection between the underworld and the mortal realm is weakened,"
                + "\n\npress 'Enter to continue");
        scanner.nextLine();
        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("-----------------------------------------------\n");
        System.out.println("The victory is sweet, a glorious battle indeed.\n"
                + "you sheath your weapon and walked away, leaving the body of Krev Malak behind, knowing that the real fight has just begun.\n"
                + "\npress 'Enter' to end the journey");
        scanner.nextLine();
    }
    
}