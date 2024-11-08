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
        return Name + "'s Health: " + Health;
    }

    public void Tiamat_Backstory(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-BACKSTORY-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("Tiamat, a primordial being of chaos and creation, born from the very essence of the cosmos.\n"+
        "She existed in the abyss, a vast sea of raw,\n"+
         "untamed power, where stars and worlds were yet to be formed.\n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();


         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("Tiamat's purpose was to give birth to life, but her creations were monstrous, \n"+
        "chaotic beings born from her wrath and untethered energy.\n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();

         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("Your mission is to annihilate this being, to stop her hideous creations in conquering your world!\n");
         System.out.println("Press 'Enter' to FIGHT");
         scanner.nextLine();
    }

    public void Tiamat_Defeat(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-TIAMAT HAS BEEN DEFEATED!-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("The battle has been long and brutal. You are bruised and battered but still stands.\n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();

         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("Then, Tiamat unleashes her final assault, an overwhelming surge of energy that threatens to consume all in its path.\n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();


         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("You have been hit! The surge of raging pain is flowing through your veins.\n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();

         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("Tiamat has fallen and so are you.\n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();

         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println(". . . *silence*...\n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();

         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println(". . . \n");
         System.out.println("Press 'Enter' to open your eyes");
         scanner.nextLine();

         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("The bright red sky is no more, but you've noticed that you're at the forest where Jormangandr lives.\n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();

         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("Turns out, after defeating the creator of creatures (Tiamat),\n"
        + "Jormungandr took your body and healed you with its mystic power. \n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();

         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("You are alone but victorious as the evil forces are no more. \n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();

         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("You stood up and walk your path way home.\n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();
    }
}