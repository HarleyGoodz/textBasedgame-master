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
public class Jormungandr extends Enemy{
    private int Health;
    private String Name;
    private int MaxHealth;
    
    CenterAlign objPrint = new CenterAlign();
    ClearScreen objClear = new ClearScreen();
    
    public void Serpent_backstory(){
        Scanner scanner = new Scanner(System.in);

        objClear.clearScreen();
        objPrint.printCentered("--------------------BACKSTORY--------------------");
        System.out.println("");
        objPrint.printCentered("Once, Jormungandr was revered as a guardian spirit, a colossal serpent who ruled over an ancient, sacred land.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        objClear.clearScreen();
        
        
        objPrint.printCentered("-----------------------------------------------");
        System.out.println("");
        objPrint.printCentered("His presence ensured the balance of nature, protecting the forests, rivers, and mountains from destruction.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue....");
        scanner.nextLine();
        objClear.clearScreen();
        
        objPrint.printCentered("-----------------------------------------------");
        System.out.println("");
        objPrint.printCentered("However, as the ages passed, human greed began to grow. Kings and conquerors, driven by ambition,");
        objPrint.printCentered("sought to take control of serpent’s sacred land, viewing it as a powerful resource.");
        System.out.println();
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        objClear.clearScreen();
        
        objPrint.printCentered("-----------------------------------------------");
        System.out.println();
        objPrint.printCentered("Consumed by great anger, the serpent swore that no mortal would ever set foot in his territory again.");
        System.out.println();
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        objClear.clearScreen();
        
        objPrint.printCentered("-----------------------------------------------");
        System.out.println("");
        objPrint.printCentered("Those who dared to enter his domain would face his wrath and be consumed");
        objPrint.printCentered("by the darkness that now coursed through his being.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
    }
    
    void Serpent_ending(){
        Scanner scanner = new Scanner(System.in);
        objClear.clearScreen();
        objPrint.printCentered("------------------ENDING STORY OF JORMUNGANDR------------------");
        System.out.println("");
        objPrint.printCentered("After a fierce battle, the mighty serpent lay defeated, its colossal body trembling with");
        objPrint.printCentered("the weight of centuries-old sorrow. All it ever desired was to protect the natural world");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
        objClear.clearScreen();
        objPrint.printCentered("-----------------------------------------------");
        System.out.println("");
        objPrint.printCentered("despising the humans who relentlessly trampled upon its beauty. It was not evil, it was a guardian,");
        objPrint.printCentered("a force of nature corrupted by the greed of mortals.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
   
        objClear.clearScreen();
        objPrint.printCentered("-----------------------------------------------");
        System.out.println("");
        objPrint.printCentered("Seeing the creature's true intentions, you did not strike the final blow. Instead,");
        objPrint.printCentered("you hurled a powerful healing potion toward the fallen serpent.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
        objClear.clearScreen();
        objPrint.printCentered("-----------------------------------------------");
        System.out.println("");
        objPrint.printCentered("As the magic took hold, the serpent's  darkened scales began to shimmer.");
        objPrint.printCentered("The player's selfless act proved that not all of humanity");
        objPrint.printCentered("was consumed by greed,that some still respected the balance of nature.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
        objClear.clearScreen();
        objPrint.printCentered("-----------------------------------------------");
        System.out.println("");
        objPrint.printCentered("The legendary serpent slithered forward, its massive form now a symbol of peace, not fear.");
        objPrint.printCentered("\"You have restored my faith, human,\" the serpent's voice rumbled like distant thunder.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
        objClear.clearScreen();
        objPrint.printCentered("-----------------------------------------------");
        System.out.println("");
        objPrint.printCentered("\"Not all mortals are blind to the world's true beauty. You have shown me that humanity still has hope.\"");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
        objClear.clearScreen();
        objPrint.printCentered("-----------------------------------------------");
        System.out.println("");
        objPrint.printCentered("With newfound trust, the serpent guided you through the twisted, never ending forest.");
        objPrint.printCentered("As they reached the edge of the cursed woods, the serpent turned one final time.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
        objClear.clearScreen();
        objPrint.printCentered("-----------------------------------------------");
        System.out.println("");
        objPrint.printCentered("\"Thank you, human. You have proven that there is still light among your kind.\"");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
        objClear.clearScreen();
        objPrint.printCentered("-----------------------------------------------");
        System.out.println("");
        objPrint.printCentered("The legendary serpent vanished into the shadows, leaving the you to continue your journey.");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
    }
    
    
    
    public Jormungandr(String Name, int MaxHealth){
        this.Name = Name;
        this.MaxHealth = MaxHealth;
        this.Health = MaxHealth;
    }
    
    @Override
    public int skillOne(){
        int skillOneDamage = (int) (Math.random() * (20 - 15 + 1)) + 15;
        
        System.out.println("Jormungandr uses Earth-Shattering Slam! Deals " + skillOneDamage + " damage.");
        
        return skillOneDamage;
    }
    
    @Override
    public int skillTwo(){
        int skillTwoDamage = (int) (Math.random() * (30 - 20 + 1)) + 20;
        
        System.out.println("Jormungandr uses Toxic Mist! Deals " + skillTwoDamage + " damage.");
     
        return skillTwoDamage;
    }
    
    @Override
    public int skillThree(){
        int skillThreeDamage = (int) (Math.random() * (50 - 30 + 1)) + 30;
        
        System.out.println("Jormungandr uses Tidal Surge! Deals " + skillThreeDamage + " damage.");
        
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
}