/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textBasedGame;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Gilgamesh extends Player{
    private String skillOneName = "Stellar Rift";
    private String skillTwoName = "Astral Surge";
    private String skillThreeName = "Celestial Binding";
    
    public Gilgamesh(String Name, int Health, int Mana){
        super(Name, Health, Mana);
    }
    
    
    @Override
    public int skillOne(){
        int skillOneDamage = (int) (Math.random() * (40 - 30 + 1)) + 30;
        
        System.out.println("Gilgamesh uses Stellar Rift! Deals " + skillOneDamage + " damage.");
        
        return skillOneDamage;
    }
    
    @Override
    public int skillTwo(){
        int skillTwoDamage = (int) (Math.random() * (45 - 35 + 1)) + 35;
        
        System.out.println("Gilgamesh uses Astral Surge! Deals " + skillTwoDamage + " damage.");
        
        return skillTwoDamage;
    }
    
    @Override
    public int skillThree(){
        int skillThreeDamage = (int) (Math.random() * (50 - 45 + 1)) + 45;
        
        System.out.println("Gilgamesh uses Celestial Binding! Deals " + skillThreeDamage + " damage.");
        
        return skillThreeDamage;
    }
    
    
    @Override
    public int oneHitDelete(){
        
        System.out.println("Gilgamesh uses ONE HIT DELETE! Deals ∞ damage.");
        
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
    public void intro(){
         Scanner scanner = new Scanner(System.in);
         
         System.out.println("\n-==-=-=-=-=-=-=-=-=-=-=-=-=-BACKSTORY-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=\n");
        System.out.println("Born under mysterious circumstances, Gilgamesh was marked by the stars as the chosen one, \n"
                + "destined to wield ancient magic capable of shaping the world itself.\n"
                + "\npress 'Enter' to continue....");
        scanner.nextLine();
        
        
        System.out.println("-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println("As a powerful wizard, his abilities have grown beyond what even the greatest mages can comprehend\n"
                + "But Gilgamesh bears the weight of his lineage, tasked with stopping the rise of the demonic overlords. \n"
                + "\npress 'Enter' to continue....");
        scanner.nextLine();
        
        System.out.println("-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println(". His quest is not just to protect the world, \n"
                + "but to uncover the hidden truth about his own past and the dark secret behind his birth.\n"
                + "\npress 'Enter' to continue....");
        scanner.nextLine();
        
        
         
    }
     
    @Override
    public void ending(){
         Scanner scanner = new Scanner(System.in);
          System.out.println("\n-==-=-=-=-=-=-=-=GILGAMESH EPILOGUE-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=\n");
        System.out.println(". After annihilating the demonic forces and standing as the savior of the world,\n"
                + " Gilgamesh has been gifted by Jormangandr, a mysterious ancient book given by the god of wisdom as his reward for saving the world. \n"
                + "\npress 'Enter' to continue....");
        scanner.nextLine();
     
     
     
     
     System.out.println("-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println("The cover of the book is made of an indestructible \n"
                + "material, marked with celestial symbols and sigils of both light and shadow, indicating its power. \n"
                + "\npress 'Enter' to continue....");
        scanner.nextLine();
        
        
    System.out.println("-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println("This is the Codex of the Primordial Truth, said to hold the secrets of creation itself.\n"
                + " As he opens the book, it reveals the long-forgotten history of the world, the nature of his birth,\n"
                + " and the true reason why he was the chosen one. \n"
                + "\npress 'Enter' to continue....");
        scanner.nextLine();
     }
     
     
     
     
    
    
}