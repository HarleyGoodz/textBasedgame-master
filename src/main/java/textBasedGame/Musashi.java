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
public class Musashi extends Player {
    private String skillOneName = "Soul Pierce";
    private String skillTwoName = "Lifeblood Rend";
    private String skillThreeName = "Demon Fang Strike";
            
    
    public Musashi(String Name, int Health, int Mana){
        super(Name, Health, Mana);
    }
    
    @Override
    public int skillOne(){
        int skillOneDamage = (int) (Math.random() * (40 - 30 + 1)) + 30;
        
        System.out.println("Musashi uses Soul Pierce! Deals " + skillOneDamage + " damage.");
        
        return skillOneDamage;
    }
    
    @Override
    public int skillTwo(){
        int skillTwoDamage = (int) (Math.random() * (45 - 35 + 1)) + 35;
        
        System.out.println("Musashi uses Lifeblood Rend! Deals " + skillTwoDamage + " damage.");
        
        return skillTwoDamage;
    }
    
    
    
    @Override
    public int skillThree(){
        int skillThreeDamage = (int) (Math.random() * (50 - 45 + 1)) + 45;
        
        System.out.println("Musashi uses Demon Fang Strike! Deals " + skillThreeDamage + " damage.");
        
        return skillThreeDamage;
    }
    
    @Override
    public int oneHitDelete(){
        
        System.out.println("Musashi uses ONE HIT DELETE! Deals ∞ damage.");
        
        return 1000;
    }
    
    @Override
    public String skillOneName(){
        return skillOneName;
    }
    
    @Override 
    public String skillTwoName(){
        return skillTwoName;
    }
    
    @Override
    public String skillThreeName(){
        return skillThreeName;
    }
    
    
    @Override
    public void intro() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("-=-=-=-=-=-=-=-=-=-BACKSTORY-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\nOnce a proud warrior, Musashi fell into darkness when he became a puppet for the demonic realm. \n"
                + "Bound by a curse, every kill of a demon brings him closer to reclaiming his lost humanity,"
                + "\n\n press 'Enter to continue");
        scanner.nextLine();
        
        System.out.println("--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\nwith each demon slain restoring a part of his fragmented body. He fights, not for glory, \n"
                + "but for the hope of breaking the curse that chains him to the underworld."
                + "\n\n press 'Enter to continue");
        scanner.nextLine();
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\nBut as his body returns, so too does the madness lurking deep within,\n"
                + "forcing him to walk the line between redemption and damnation."
                + "\n\n press 'Enter' to continue");
        scanner.nextLine();
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\nMusashi is in a journey to end this ugly curse, by killing all the demons that interferes on his path\n"
                + "restoring his lost humanity..."
                + "\n\n press 'Enter' to continue");
        scanner.nextLine();
    }

    public void ending(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=MUSASHI ENDING-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\nFinally, Musashi succeeded defeating all the demons, resulting in regaining his humanity."
                + "\n\n press 'Enter' to continue");
        scanner.nextLine();

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\nHe lived in peace, no longer chained by the curse he has in the past."
                + "\n\n press 'Enter' to continue");
        scanner.nextLine();

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=MUSASHI ENDING-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("\nAs he returned to his hometown, he lived happily ever after..."
                + "\n\n press 'Enter' to end");
        scanner.nextLine();
    }
    
   
    
}