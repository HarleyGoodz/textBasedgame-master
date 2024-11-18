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
    
    public Thorfinn(String Name, int Health, int Mana){
        super(Name, Health, Mana);
    }
    
    
    @Override
    public int skillOne(){
        int skillOneDamage = (int) (Math.random() * (40 - 30 + 1)) + 30;
        
        System.out.println("Thorfinn uses Whirlwind Cleave! Deals " + skillOneDamage + " damage.");
        
        return skillOneDamage;
    }
    
    @Override
    public int skillTwo(){
        int skillTwoDamage = (int) (Math.random() * (45 - 35 + 1)) + 35;
        
        System.out.println("Thorfinn uses Seismic Strike! Deals " + skillTwoDamage + " damage.");
        
        return skillTwoDamage;
    }
    
    @Override
    public int skillThree(){
        int skillThreeDamage = (int) (Math.random() * (50 - 45 + 1)) + 45;
        
        System.out.println("Thorfinn uses Blade Tempest! Deals " + skillThreeDamage + " damage.");
        
        return skillThreeDamage;
    }
    
    @Override
    public int oneHitDelete(){
        
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
        
        System.out.println("\n-=-=-=-=-=-=-=-=-=BACKSTORY-==-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println("Thorn was once a man of peace, a master of the sword who valued family above all else.\n"
                + "His world shattered when his family was attacked by the monstrious creations of Tiamat, \n "
                + "\npress 'Enter' to continue....");
        scanner.nextLine();
  
       
        
        System.out.println("-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println("Consumed by rage, Thorn has spent years honing his skills, \n"
                + "turning himself into a walking weapon of vengeance. \n"
                + "\npress 'Enter' to continue....");
        scanner.nextLine();
        
        
        System.out.println("-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println("His only goal is to kill all the monsters who took everything from him,"
                + "and ending those spread evil.\n"
                + "But Thorn's journey will lead him to realize that his rage, \n"
                + "while powerful, is not the only thing that can forge his destiny.\n"
                + "\npress 'Enter' to continue....");
        scanner.nextLine();
       
        
    }

 
    public void ending(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-THORFINN EPILOGUE-=-=-=-=-=-=-=-=-=\n");
        System.out.println("As Thorfinn stands over his victory in avenging his family, \n"
                + "the moment he had envisioned for years finally arrives.\n"
                + "the once-powerful Tiamat, now a broken, gasping figure, eradicated from reality by Thorfinn's hands. "
                + "\n\npress 'Enter' to continue....");
        scanner.nextLine();
      
        
        
        System.out.println("-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println("The rage that fueled him for so long begins to wane, leaving him with a strange emptiness.\n"
                + "\npress 'Enter' to continue....");
        scanner.nextLine();
      
       
        
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println("standing victorious, he realizes the cost. He had lost more than just his family. He had lost himself.\n"
                + "\npress 'Enter' to continue");
        scanner.nextLine();
    
        
        System.out.println("-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println("With a grimace, Thorn drives his sword into the earth, no longer needing it. \n"
                + " Thorfinn says, his voice low but steady. this isn't the end of my journey.\n"
                + "\npress 'Enter' to continue");
        scanner.nextLine();
  
        
        System.out.println("-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println("As Thorn walks away from the forest, the wind carries the scent of sweat and bruises,\n"
                + " but something deeper stirs within him. He knows now that his journey is not over.\n"
                + "\npress 'Enter' to continue");
        scanner.nextLine();
        
        
        System.out.println("-==-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=\n");
        System.out.println("He looks to the horizon, where the sun is just beginning to rise. A new dawn, a new chapter.\n"
                + " Thorn is no longer bound by the past. He is no longer a slave to rage. His destiny,\n"
                + " he realizes, will be forged not by the blood he sheds, but by the choices he makes from here on."
                + "\n\npress 'Enter' to end the journey....");
        scanner.nextLine();
   
        
        
        
        
        
        
        
        
    }
    
}

    