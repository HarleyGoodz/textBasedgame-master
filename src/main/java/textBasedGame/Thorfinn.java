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
public class Thorfinn extends Player {
    private String skillOneName = "Whirldwind Cleave";
    private String skillTwoName = "Seismic Strike";
    private String skillThreeName = "Blade Tempest";

    CenterAlign objPrint = new CenterAlign();
    ClearScreen objClear = new ClearScreen();
    
    public Thorfinn(String Name, int Health, int Mana, int Exp){
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
        System.out.println("Thorfinn uses One Hit Delete! Deals ∞ damage.");
        
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
        objPrint.printCentered("-=-=-=-=-=-=-=-=-=BACKSTORY-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        objPrint.printCentered("Thorn was once a man of peace, a master of the sword who valued family above all else.");
        objPrint.printCentered("His world shattered when his family was attacked by the monstrious creations of Tiamat,");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
  
       
        objClear.clearScreen();
        objPrint.printCentered("-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        objPrint.printCentered("Consumed by rage, Thorn has spent years honing his skills,");
        objPrint.printCentered("turning himself into a walking weapon of vengeance.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
        objClear.clearScreen();
        objPrint.printCentered("-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        objPrint.printCentered("His only goal is to kill all the monsters who took everything from him,");
        objPrint.printCentered("and ending those spread evil.");
        objPrint.printCentered("But Thorn's journey will lead him to realize that his rage,");
        objPrint.printCentered("while powerful, is not the only thing that can forge his destiny.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
       
        
    }

 
    public void ending(){
        
        Scanner scanner = new Scanner(System.in);

        objClear.clearScreen();
        objPrint.printCentered("-=-=-=-=-=-=-=-=-=-=-THORFINN EPILOGUE-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("");
        objPrint.printCentered("As Thorfinn stands over his victory in avenging his family,");
        objPrint.printCentered("the moment he had envisioned for years finally arrives.");
        objPrint.printCentered("the once-powerful Tiamat, now a broken, gasping figure, eradicated from reality by Thorfinn's hands.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to continue");
        scanner.nextLine();
      
        
        objClear.clearScreen();
        objPrint.printCentered("-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        objPrint.printCentered("The rage that fueled him for so long begins to wane, leaving him with a strange emptiness.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
      
       
        objClear.clearScreen();
        objPrint.printCentered("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        objPrint.printCentered("Standing victorious, he realizes the cost. He had lost more than just his family. He had lost himself.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
    
        objClear.clearScreen();
        objPrint.printCentered("-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        objPrint.printCentered("With a grimace, Thorn drives his sword into the earth, no longer needing it.");
        objPrint.printCentered("Thorfinn says, his voice low but steady. this isn't the end of my journey.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
  
        objClear.clearScreen();
        objPrint.printCentered("-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        objPrint.printCentered("As Thorn walks away from the forest, the wind carries the scent of sweat and bruises,");
        objPrint.printCentered("but something deeper stirs within him. He knows now that his journey is not over.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
        objClear.clearScreen();
        objPrint.printCentered("-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("");
        objPrint.printCentered("He looks to the horizon, where the sun is just beginning to rise. A new dawn, a new chapter.");
        objPrint.printCentered(" Thorn is no longer bound by the past. He is no longer a slave to rage. His destiny,");
        objPrint.printCentered("he realizes, will be forged not by the blood he sheds, but by the choices he makes from here on.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to End the Journey");
        scanner.nextLine();
   
        
        
        
        
        
        
        
        
    }
    
}

    