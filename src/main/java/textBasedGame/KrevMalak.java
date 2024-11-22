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
    private int MaxHealth;

    ClearScreen objClear = new ClearScreen();
    CenterAlign objPrint = new CenterAlign();
    
    public KrevMalak(String Name,int MaxHealth){
        this.MaxHealth = MaxHealth;
        this.Health = MaxHealth;
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
        
        int barLength = 20; 
        int filledLength = (int) ((double) Health / MaxHealth * barLength);
    
        
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
    
        
        return Name + "'s Health: " + Health + "/" + MaxHealth + " " + healthBar.toString();
}
    
    public void Krev_BackStory(){
        
        Scanner scanner = new Scanner(System.in);
        objClear.clearScreen();
        objPrint.printCentered("----------------BACKSTORY----------------");
        System.out.println("");
        objPrint.printCentered("Krev Malak, a god blinded by greed and an insatiable hunger for power.");
        objPrint.printCentered("The more suffering he caused, the more powerful he becomes, feeding off the fear and hopelessness of his victims.");
        System.out.println();
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
        objClear.clearScreen();
        objPrint.printCentered("-----------------------------------------------");
        System.out.println();
        objPrint.printCentered("One that went beyond personal gain,he would become the embodiment of despair itself,");
        objPrint.printCentered("a living nightmare capable of plunging the world into endless darkness.");
        System.out.println();
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
    }
    
    public void Krev_IncomingBattle(){
        Scanner scanner = new Scanner(System.in);
        
        objClear.clearScreen();
        objPrint.printCentered("-----------------------------------------------");
        System.out.println("");
        objPrint.printCentered("As you spot Krev Malak seated on his throne, a massive battle looms,");
        objPrint.printCentered("shrouded in shadows and flames. With a fierce charge, you teleported to Krev,");
        objPrint.printCentered("unleashing your skills in a devastating attack aimed at annihilating the god somehow, Krev blocked your attack...");
        objPrint.printCentered("-----------------------------------------------");
        objPrint.printCentered("PREPARE FOR BATTLE!");
        objPrint.printCentered("Press 'Enter' to Fight!");
        scanner.nextLine();
    }
    
    public void Krev_Defeat(){
        Scanner scanner = new Scanner(System.in);
        
        objClear.clearScreen();
        objPrint.printCentered("-------------------VICTORY ENDING-------------------");
        System.out.println();
        objPrint.printCentered("Finally, the God of Despair can prevail no more");
        objPrint.printCentered("As Krev lies defeated, you stood at the edge of victory and honor, while Krev is in the brink of death,");
        objPrint.printCentered("the connection between the underworld and the mortal realm is weakened,");
        System.out.println();
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
        objClear.clearScreen();
        objPrint.printCentered("-----------------------------------------------");
        objPrint.printCentered("The victory is sweet, a glorious battle indeed.");
        objPrint.printCentered("you sheath your weapon and walked away, leaving the body of Krev Malak behind, knowing that the real fight has just begun.");
        System.out.println();
        objPrint.printCentered("Press 'Enter' to End the Journey.");
        scanner.nextLine();
    }
    
}