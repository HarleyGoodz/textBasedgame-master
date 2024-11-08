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
    
    
    public void Serpent_backstory(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--------------------BACKSTORY---------------------------\n");
        System.out.println("Once, Jormungandr was revered as a guardian spirit, a colossal serpent who ruled over an ancient, sacred land. \n"
                + "press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------\n");
        System.out.println("His presence ensured the balance of nature, protecting the forests, rivers, and mountains from destruction. \n"
                + "press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
        System.out.println("However, as the ages passed, human greed began to grow. Kings and conquerors, driven by ambition, \n"
                + "sought to take control of serpent’s sacred land, viewing it as a powerful resource.\n"
                + "press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
        System.out.println("Consumed by great anger, the serpent swore that no mortal would ever set foot in his territory again.\n"
                + "press 'Enter' to continue....");
        scanner.nextLine();
        System.out.println("-------------------------------------------------");
        
        System.out.println("-----------------------------------------------");
        System.out.println("Those who dared to enter his domain would face his wrath and be consumed \n"
                + "by the darkness that now coursed through his being."
                + "press 'Enter' to continue....");
        scanner.nextLine();
    }
    
    void Serpent_ending(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n------------------ENDING STORY OF JORMUNGANDR-----------------------------\n");
        System.out.println("After a fierce battle, the mighty serpent lay defeated, its colossal body trembling with \n"
                + "the weight of centuries-old sorrow. All it ever desired was to protect the natural world"
                + "\n\npress 'Enter' to continue....");
        scanner.nextLine();
        
        System.out.println("-----------------------------------------------\n");
        System.out.println("despising the humans who relentlessly trampled upon its beauty. It was not evil, it was a guardian, \n"
        + "a force of nature corrupted by the greed of mortals. "
                + "\n\npress 'Enter' to continue....");
        scanner.nextLine();
   
        
        System.out.println("-----------------------------------------------\n");
        System.out.println("Seeing the creature\'s true intentions, you did not strike the final blow. Instead, \n"
        + "you hurled a powerful healing potion toward the fallen serpent. \n"
                + "\npress 'Enter' to continue");
        scanner.nextLine();
        
        System.out.println("-----------------------------------------------\n");
        System.out.println("As the magic took hold, the serpent's  darkened scales began to shimmer. \n"
                + "The player's selfless act proved that not all of humanity \n"
                + "was consumed by greed,that some still respected the balance of nature.\n"
                + "\npress 'Enter' to continue");
        scanner.nextLine();
        
        System.out.println("-----------------------------------------------\n");
        System.out.println("The legendary serpent slithered forward, its massive form now a symbol of peace, not fear. \n"
                + "\"You have restored my faith, human,\" the serpent's voice rumbled like distant thunder. "
                + "\n\npress 'Enter' to continue");
        scanner.nextLine();
        
        System.out.println("-----------------------------------------------\n");
        System.out.println("\"Not all mortals are blind to the world's true beauty. You have shown me that humanity still has hope.\""
                + "\n\npress 'Enter' to continue");
        scanner.nextLine();
        
        System.out.println("-----------------------------------------------\n");
        System.out.println("With newfound trust, the serpent guided you through the twisted, never ending forest.\n"
                + " As they reached the edge of the cursed woods, the serpent turned one final time."
                + "\n\npress 'Enter' to continue");
        scanner.nextLine();
        
        System.out.println("-----------------------------------------------\n");
        System.out.println("\"Thank you, human. You have proven that there is still light among your kind.\""
                + "\n\npress 'Enter' to continue");
        scanner.nextLine();
        
        System.out.println("-----------------------------------------------\n");
        System.out.println("the legendary serpent vanished into the shadows, leaving the you to continue your journey.\n"
                + "\n\npress 'Enter' to continue");
        scanner.nextLine();
        
    }
    
    
    
    public Jormungandr(String Name, int Health){
        this.Name = Name;
        this.Health = Health;
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
        return Name + "'s Health: " + Health;
    }
}