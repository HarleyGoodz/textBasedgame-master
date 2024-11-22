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

    CenterAlign objPrint = new CenterAlign();
    ClearScreen objClear = new ClearScreen();
    
    public Gilgamesh(String Name, int Health, int Mana, int Exp){
        super(Name, Health, Mana, Exp);
    }
    
    
    @Override
    public int skillOne(){
        int skillOneDamage = (int) (Math.random() * (40 - 30 + 1)) + 30;
        
        
        return skillOneDamage;
    }
    
    @Override
    public int skillTwo(){
        int skillTwoDamage = (int) (Math.random() * (45 - 35 + 1)) + 35;
        
        
        return skillTwoDamage;
    }
    
    @Override
    public int skillThree(){
        int skillThreeDamage = (int) (Math.random() * (50 - 45 + 1)) + 45;
        
        
        return skillThreeDamage;
    }
    
    
    @Override
    public int oneHitDelete(){
        
        objClear.clearScreen();
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
         
        objClear.clearScreen();
        objPrint.printCentered("-==-=-=-=-=-=-=-=-=-=-=-=-=-BACKSTORY-==-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("");
        objPrint.printCentered("Born under mysterious circumstances, Gilgamesh was marked by the stars as the chosen one,");
        objPrint.printCentered("destined to wield ancient magic capable of shaping the world itself.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
        objClear.clearScreen();
        objPrint.printCentered("-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        objPrint.printCentered("As a powerful wizard, his abilities have grown beyond what even the greatest mages can comprehend");
        objPrint.printCentered("But Gilgamesh bears the weight of his lineage, tasked with stopping the rise of the demonic overlords.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
        objClear.clearScreen();
        objPrint.printCentered("-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        objPrint.printCentered("His quest is not just to protect the world,");
        objPrint.printCentered("but to uncover the hidden truth about his own past and the dark secret behind his birth.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
        
         
    }
     
    @Override
    public void ending(){
         Scanner scanner = new Scanner(System.in);

        objClear.clearScreen();
        objPrint.printCentered("-==-=-=-=-=-=-=-GILGAMESH= EPILOGUE-==-=-=-=-=-=-=-");
        System.out.println("");
        objPrint.printCentered("After annihilating the demonic forces and standing as the savior of the world,");
        objPrint.printCentered("Gilgamesh has been gifted by Jormangandr, a mysterious ancient book given by the god of wisdom as his reward for saving the world.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
     
     
     
        objClear.clearScreen();
        objPrint.printCentered("-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        objPrint.printCentered("The cover of the book is made of an indestructible");
        objPrint.printCentered("material, marked with celestial symbols and sigils of both light and shadow, indicating its power.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
        objClear.clearScreen();
        objPrint.printCentered("-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        objPrint.printCentered("This is the Codex of the Primordial Truth, said to hold the secrets of creation itself.");
        objPrint.printCentered(" As he opens the book, it reveals the long-forgotten history of the world, the nature of his birth,");
        objPrint.printCentered(" and the true reason why he was the chosen one.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
     }
     
     
     
     
    
    
}