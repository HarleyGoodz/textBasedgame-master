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

    ClearScreen objClear = new ClearScreen();
    CenterAlign objPrint = new CenterAlign();
            
    
    public Musashi(String Name, int Health, int Mana, int Exp){
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
        objPrint.printCentered("Musashi uses ONE HIT DELETE! Deals ∞ damage.");
        
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
        
        objClear.clearScreen();
        objPrint.printCentered("-=-=-=-=-=-=-=-=-=-BACKSTORY-=-=-=-=-=-=-=-=-=-");
        System.out.println("");
        objPrint.printCentered("Once a proud warrior, Musashi fell into darkness when he became a puppet for the demonic realm.");
        objPrint.printCentered("Bound by a curse, every kill of a demon brings him closer to reclaiming his lost humanity,");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
        objClear.clearScreen();
        objPrint.printCentered("--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        objPrint.printCentered("with each demon slain restoring a part of his fragmented body. He fights, not for glory,");
        objPrint.printCentered("but for the hope of breaking the curse that chains him to the underworld.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
        objClear.clearScreen();
        objPrint.printCentered("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        objPrint.printCentered("But as his body returns, so too does the madness lurking deep within,");
        objPrint.printCentered("forcing him to walk the line between redemption and damnation.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
        objClear.clearScreen();
        objPrint.printCentered("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        objPrint.printCentered("Musashi is in a journey to end this ugly curse, by killing all the demons that interferes on his path");
        objPrint.printCentered("restoring his lost humanity...");
        System.out.println("");
        objPrint.printCentered("Print 'Enter' to Cotinue");
        scanner.nextLine();
    }

    public void ending(){
        Scanner scanner = new Scanner(System.in);

        objClear.clearScreen();
        objPrint.printCentered("-=-=-=-=-=-=-=-=-=-MUSASHI ENDING-=-=-=-=-=-=-=-=-=-");
        System.out.println("");
        objPrint.printCentered("Finally, Musashi succeeded defeating all the demons, resulting in regaining his humanity.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();

        objClear.clearScreen();
        objPrint.printCentered("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        objPrint.printCentered("He lived in peace, no longer chained by the curse he has in the past.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();

        objClear.clearScreen();
        objPrint.printCentered("-=-=-=-=-=-=-=-=-=-MUSASHI ENDING-=-=-=-=-=-=-=-=-=-");
        System.out.println("");
        objPrint.printCentered("As he returned to his hometown, he lived happily ever after...");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to End");
        scanner.nextLine();
    }
    
   
    
}