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
public class storyThree {
    Tiamat objTia = new Tiamat("Tiamat",1000);
    Anzu objAnzu = new Anzu("Anzu",200);
    Urmahlullu objUrma = new Urmahlullu("Urmahlullu", 200);
    Humbaba objHum = new Humbaba("Humbaba", 200);
    int TurnCounter = 0;
    boolean Dead = false;

    private AudioManager audioManager;

    public storyThree(AudioManager audioManager) {
        this.audioManager = audioManager;
    }
    
    
    public void wallThree(Player character, Inventory objIn){
    Scanner scanner = new Scanner(System.in);
    openShop objShop = new openShop(objIn);
    audioManager.stopAudio();
    audioManager.playAudio("c:\\Users\\User\\Downloads\\Dark Souls_ Chiptune Demixes - Chaos Witch Quelaag.wav");
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("\n---------THE FINAL CHAPTER---------------\n");
    System.out.println("You have arrived at the final wall... A hellish journey awaits you.");
    System.out.println("Press 'Enter' to continue");
    scanner.nextLine();

    
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("----------------------------------------------\n");
    System.out.println("As you have exited the forest, a bright red sky welcomed you showing its immense power of darkness...");
    System.out.println("Press 'Enter' to continue");
    scanner.nextLine();
    

    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("----------------------------------------------\n");
    System.out.println("As you took a couple of steps in that world, An anzu landed before you, interfering your journey and intends to"+ 
    " kill you....");
    System.out.println("Press 'Enter' to continue");
    scanner.nextLine();
    
    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    System.out.println("----------------------------------------------\n");
    System.out.println("Prepare for Battle!");
    System.out.println("Press 'Enter' to continue");
    scanner.nextLine();

    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        while (objAnzu.getHealth() > 0 && character.getHealth() > 0){
            System.out.println("=================================================");
            System.out.println("||      WALL 3: Nippur     ||      MINION 1    ||");
            System.out.println("=================================================\n");
            System.out.println("\u001B[33mGold\u001B[0m: " + objIn.getGold() + "\n");
            System.out.println(character.toString());
            System.out.println(objAnzu.toString());
            
            System.out.println("---------------------------------------");
            System.out.println("Choose your action: ");
            System.out.println("---------------------------------------");
            System.out.println("1. Use " + character.skillOneName() + " (30-40 damage, +15 mana)");
            System.out.println("2. Use " + character.skillTwoName() + " (35-45 damage, 20 mana)");
            System.out.println("3. Use " + character.skillThreeName() + " (40-50 damage, 30 mana)");
            System.out.println("4. ONE HIT DELETE");
            System.out.println("5. Healing Potion (" + objIn.getItemOneCount() + ")");
            System.out.println("6. Mana Potion (" + objIn.getItemTwoCount() + ")");
            System.out.println("------------------------------------------");
            System.out.print("Enter your choice: ");
            
            try {
                int skillChoice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                int damage = 0;
                int heal = 0;
                int mana = 0;
                int Exp = 0;
                int gold = 0;
                int multiplied = 0;
                switch (skillChoice) {
                    case 1:
                        if(objIn.getBossDropTwoCount()){
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            character.addMana();
                            damage = character.skillOne(); // Random damage between 30 and 40
                            multiplied = objIn.BossDropTwoEffect(damage);
                            System.out.println(character.getName() + " uses " + character.skillOneName() + "! Deals " + multiplied + " Multiplied damage.");
                            objAnzu.takeDamage(multiplied);
                        }
                        else{
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            character.addMana();
                            damage = character.skillOne(); // Random damage between 30 and 40
                            System.out.println(character.getName() + " uses " + character.skillOneName() + "! Deals " + damage + " damage.");
                            objAnzu.takeDamage(damage);
                        }
                        
                        break;
                    case 2:
                        if(character.useMana(20) && objIn.getBossDropOneCount() && objIn.getBossDropTwoCount()){
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            multiplied = objIn.BossDropTwoEffect(damage);
                            character.setHeal(15);
                            System.out.println(character.getName() + " uses " + character.skillTwoName() + "! Deals " + multiplied + " Multiplied damage.");
                            objAnzu.takeDamage(multiplied);
                        }
                        else if (character.useMana(20)) {
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            System.out.println(character.getName() + " uses " + character.skillTwoName() + "! Deals " + damage + " damage.");
                            objAnzu.takeDamage(damage);
                        }
                        else{
                            continue;
                        }
                        break;
                    case 3:
                        if(character.useMana(30) && objIn.getBossDropOneCount() && objIn.getBossDropTwoCount()){
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillThree(); // Random damage between 35 and 45
                            multiplied = objIn.BossDropTwoEffect(damage);
                            character.setHeal(15);
                            System.out.println(character.getName() + " uses " + character.skillThreeName() + "! Deals " + multiplied + " Multiplied damage.");
                            objAnzu.takeDamage(multiplied);
                        }
                        else if (character.useMana(30)) {
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillThree(); // Random damage between 35 and 45
                            System.out.println(character.getName() + " uses " + character.skillThreeName() + "! Deals " + damage + " damage.");
                            objAnzu.takeDamage(damage);
                        }
                        else{
                            continue;
                        }
                        break;
                    case 4:
                        TurnCounter++;
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                        damage = character.oneHitDelete();
                        objAnzu.takeDamage(damage);
                        break;
                    case 5:
                        if(objIn.getItemOneCount() > 0){
                            if(character.getHealth() == 100){
                                System.out.println("\nYou're still full in Health!\n");
                                continue;
                            }
                            else{
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                                System.out.println("Added +50 to " + character.getName() + "'s Health!");
                                heal = objIn.useItemOne();
                                character.setHeal(heal);
                                continue;
                            }
                        }
                        else{
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("\nYou're out of Health Potions!\n");
                            continue;
                        }
                    case 6:
                        if(objIn.getItemTwoCount() > 0){
                            if(character.getMana() == 100){
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                System.out.println("\nYou're still full in Mana!\n");
                                continue;
                            }
                            else{
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                                System.out.println("Added +50 to " + character.getName() + "'s Mana!");
                                mana = objIn.useItemTwo();
                                character.setMana(mana);
                                continue;
                            }
                        }
                        else{
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("\nYou're out of Mana Potions!\n");
                            continue;
                        }
                    default:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("\nNot enough mana or invalid choice! Choose again.\n");
                        continue;
                }

                // Enemy's turn to attack
                if (objAnzu.getHealth() > 0) {
                    int enemyDamage = 0;
                    enemyDamage = objAnzu.skillOne();  // Random damage between 10 and 25
                    character.takeDamage(enemyDamage);
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println(character.getName() + " has fallen. " + objAnzu.getName() + " prevails.");
                    TurnCounter = 0;
                    character.setDefeated(true);
                    break;
                } else if (objAnzu.getHealth() <= 0) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("\t"+character.getName() + " has defeated " + objAnzu.getName());
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n\n");
                    gold = (int) (Math.random() * (75 - 45 + 1)) + 45;
                    objIn.setGold(gold);
                    System.out.println(character.getName() + " has earned " + gold + " gold!");
                    Exp = (int) (Math.random() * (25 - 15 + 1)) + 15;
                    System.out.println(character.getName() + " have received " + Exp + " XP!");
                    character.addExp(Exp);
                    TurnCounter = 0;
                    System.out.println("\n--------------------VICTORY!--------------------------\n");
                    System.out.println("You have successfully defended yourself, but it's not over yet!");
                    System.out.println("Press 'Enter' to continue");
                    scanner.nextLine();

                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("----------------------------------------------\n");
                    System.out.println("As two of the monsters charged infront of you, avenging their ally!");
                    System.out.println("Press 'Enter' to continue");
                    scanner.nextLine();
                    
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("----------------------------------------------\n");
                    System.out.println("Brace yourself! PREPARE FOR BATTLE 2!");
                    System.out.println("Press 'Enter' to FIGHT");
                    scanner.nextLine();
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        
        
        while (objUrma.getHealth() > 0 && character.getHealth() > 0){
            System.out.println("=================================================");
            System.out.println("||      WALL 3: Nippur     ||      MINION 2    ||");
            System.out.println("=================================================\n");
            System.out.println("\u001B[33mGold\u001B[0m: " + objIn.getGold() + "\n");
            System.out.println(character.toString());
            System.out.println(objUrma.toString());
            
            System.out.println("---------------------------------------");
            System.out.println("Choose your action: ");
            System.out.println("---------------------------------------");
            System.out.println("1. Use " + character.skillOneName() + " (30-40 damage, +15 mana)");
            System.out.println("2. Use " + character.skillTwoName() + " (35-45 damage, 20 mana)");
            System.out.println("3. Use " + character.skillThreeName() + " (40-50 damage, 30 mana)");
            System.out.println("4. ONE HIT DELETE");
            System.out.println("5. Healing Potion (" + objIn.getItemOneCount() + ")");
            System.out.println("6. Mana Potion (" + objIn.getItemTwoCount() + ")");
            System.out.println("------------------------------------------");
            System.out.print("Enter your choice: ");
            
            try {
                int skillChoice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                int damage = 0;
                int heal = 0;
                int mana = 0;
                int Exp = 0;
                int gold = 0;
                int multiplied = 0;
                switch (skillChoice) {
                    case 1:
                        if(objIn.getBossDropTwoCount()){
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            character.addMana();
                            damage = character.skillOne(); // Random damage between 30 and 40
                            multiplied = objIn.BossDropTwoEffect(damage);
                            System.out.println(character.getName() + " uses " + character.skillOneName() + "! Deals " + multiplied + " Multiplied damage.");
                            objUrma.takeDamage(multiplied);
                        }
                        else{
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            character.addMana();
                            damage = character.skillOne(); // Random damage between 30 and 40
                            System.out.println(character.getName() + " uses " + character.skillOneName() + "! Deals " + damage + " damage.");
                            objUrma.takeDamage(damage);
                        }
                        
                        break;
                    case 2:
                        if(character.useMana(20) && objIn.getBossDropOneCount() && objIn.getBossDropTwoCount()){
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            multiplied = objIn.BossDropTwoEffect(damage);
                            character.setHeal(15);
                            System.out.println(character.getName() + " uses " + character.skillTwoName() + "! Deals " + multiplied + " Multiplied damage.");
                            objUrma.takeDamage(multiplied);
                        }
                        else if (character.useMana(20)) {
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            System.out.println(character.getName() + " uses " + character.skillTwoName() + "! Deals " + damage + " damage.");
                            objUrma.takeDamage(damage);
                        }
                        else{
                            continue;
                        }
                        break;
                    case 3:
                        if(character.useMana(30) && objIn.getBossDropOneCount() && objIn.getBossDropTwoCount()){
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillThree(); // Random damage between 35 and 45
                            multiplied = objIn.BossDropTwoEffect(damage);
                            character.setHeal(15);
                            System.out.println(character.getName() + " uses " + character.skillThreeName() + "! Deals " + multiplied + " Multiplied damage.");
                            objUrma.takeDamage(multiplied);
                        }
                        else if (character.useMana(30)) {
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillThree(); // Random damage between 35 and 45
                            System.out.println(character.getName() + " uses " + character.skillThreeName() + "! Deals " + damage + " damage.");
                            objUrma.takeDamage(damage);
                        }
                        else{
                            continue;
                        }
                        break;
                    case 4:
                        TurnCounter++;
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                        damage = character.oneHitDelete();
                        objUrma.takeDamage(damage);
                        break;
                    case 5:
                        if(objIn.getItemOneCount() > 0){
                            if(character.getHealth() == 100){
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                System.out.println("\nYou're still full in Health!\n");
                                continue;
                            }
                            else{
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                                System.out.println("Added +50 to " + character.getName() + "'s Health!");
                                heal = objIn.useItemOne();
                                character.setHeal(heal);
                                continue;
                            }
                        }
                        else{
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("\nYou're out of Health Potions!\n");
                            continue;
                        }
                    case 6:
                        if(objIn.getItemTwoCount() > 0){
                            if(character.getMana() == 100){
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                System.out.println("\nYou're still full in Mana!\n");
                                continue;
                            }
                            else{
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                                System.out.println("Added +50 to " + character.getName() + "'s Mana!");
                                mana = objIn.useItemTwo();
                                character.setMana(mana);
                                continue;
                            }
                        }
                        else{
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("\nYou're out of Mana Potions!\n");
                            continue;
                        }
                    default:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("\nNot enough mana or invalid choice! Choose again.\n");
                        continue;
                }

                // Enemy's turn to attack
                if (objUrma.getHealth() > 0) {
                    int enemyDamage = 0;
                    enemyDamage = objUrma.skillOne();  // Random damage between 10 and 25
                    character.takeDamage(enemyDamage);
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println(character.getName() + " has fallen. " + objUrma.getName() + " prevails.");
                    TurnCounter = 0;
                    character.setDefeated(true);
                    break;
                } else if (objUrma.getHealth() <= 0) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("\t "+character.getName() + " has defeated " + objUrma.getName());
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n\n");
                    gold = (int) (Math.random() * (75 - 45 + 1)) + 45;
                    objIn.setGold(gold);
                    System.out.println(character.getName() + " has earned " + gold + " gold!");
                    Exp = (int) (Math.random() * (25 - 15 + 1)) + 15;
                    System.out.println(character.getName() + " have received " + Exp + " XP!");
                    character.addExp(Exp);
                    TurnCounter = 0;
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }

        
        
        while (objHum.getHealth() > 0 && character.getHealth() > 0){
            System.out.println("=================================================");
            System.out.println("||      WALL 3: Nippur     ||      MINION 3    ||");
            System.out.println("=================================================\n");
            System.out.println("\u001B[33mGold\u001B[0m: " + objIn.getGold() + "\n");
            System.out.println(character.toString());
            System.out.println(objHum.toString());
            
            System.out.println("---------------------------------------");
            System.out.println("Choose your action: ");
            System.out.println("---------------------------------------");
            System.out.println("1. Use " + character.skillOneName() + " (30-40 damage, +15 mana)");
            System.out.println("2. Use " + character.skillTwoName() + " (35-45 damage, 20 mana)");
            System.out.println("3. Use " + character.skillThreeName() + " (40-50 damage, 30 mana)");
            System.out.println("4. ONE HIT DELETE");
            System.out.println("5. Healing Potion (" + objIn.getItemOneCount() + ")");
            System.out.println("6. Mana Potion (" + objIn.getItemTwoCount() + ")");
            System.out.println("------------------------------------------");
            System.out.print("Enter your choice: ");
            
            try {
                int skillChoice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                int damage = 0;
                int heal = 0;
                int mana = 0;
                int Exp = 0;
                int gold = 0;
                int multiplied = 0;
                switch (skillChoice) {
                    case 1:
                        if(objIn.getBossDropTwoCount()){
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            character.addMana();
                            damage = character.skillOne(); // Random damage between 30 and 40
                            multiplied = objIn.BossDropTwoEffect(damage);
                            System.out.println(character.getName() + " uses " + character.skillOneName() + "! Deals " + multiplied + " Multiplied damage.");
                            objHum.takeDamage(multiplied);
                        }
                        else{
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            character.addMana();
                            damage = character.skillOne(); // Random damage between 30 and 40
                            System.out.println(character.getName() + " uses " + character.skillOneName() + "! Deals " + damage + " damage.");
                            objHum.takeDamage(damage);
                        }
                        
                        break;
                    case 2:
                        if(character.useMana(20) && objIn.getBossDropOneCount() && objIn.getBossDropTwoCount()){
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            multiplied = objIn.BossDropTwoEffect(damage);
                            character.setHeal(15);
                            System.out.println(character.getName() + " uses " + character.skillTwoName() + "! Deals " + multiplied + " Multiplied damage.");
                            objHum.takeDamage(multiplied);
                        }
                        else if (character.useMana(20)) {
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            System.out.println(character.getName() + " uses " + character.skillTwoName() + "! Deals " + damage + " damage.");
                            objHum.takeDamage(damage);
                        }
                        else{
                            continue;
                        }
                        break;
                    case 3:
                        if(character.useMana(30) && objIn.getBossDropOneCount() && objIn.getBossDropTwoCount()){
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillThree(); // Random damage between 35 and 45
                            multiplied = objIn.BossDropTwoEffect(damage);
                            character.setHeal(15);
                            System.out.println(character.getName() + " uses " + character.skillThreeName() + "! Deals " + multiplied + " Multiplied damage.");
                            objHum.takeDamage(multiplied);
                        }
                        else if (character.useMana(30)) {
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillThree(); // Random damage between 35 and 45
                            System.out.println(character.getName() + " uses " + character.skillThreeName() + "! Deals " + damage + " damage.");
                            objHum.takeDamage(damage);
                        }
                        else{
                            continue;
                        }
                        break;
                    case 4:
                        TurnCounter++;
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                        damage = character.oneHitDelete();
                        objHum.takeDamage(damage);
                        break;
                    case 5:
                        if(objIn.getItemOneCount() > 0){
                            if(character.getHealth() == 100){
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                System.out.println("You're still full in Health! ");
                                continue;
                            }
                            else{
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                                System.out.println("Added +50 to " + character.getName() + "'s Health!");
                                heal = objIn.useItemOne();
                                character.setHeal(heal);
                                continue;
                            }
                        }
                        else{
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("\nYou're out of Health Potions!\n");
                            continue;
                        }
                    case 6:
                        if(objIn.getItemTwoCount() > 0){
                            if(character.getMana() == 100){
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                System.out.println("\nYou're still full in Mana!\n");
                                continue;
                            }
                            else{
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                                System.out.println("Added +50 to " + character.getName() + "'s Mana!");
                                mana = objIn.useItemTwo();
                                character.setMana(mana);
                                continue;
                            }
                        }
                        else{
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("\nYou're out of Mana Potions!\n");
                            continue;
                        }
                    default:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("\nNot enough mana or invalid choice! Choose again.\n");
                        continue;
                }

                // Enemy's turn to attack
                if (objHum.getHealth() > 0) {
                    int enemyDamage = 0;
                    enemyDamage = objHum.skillOne();  // Random damage between 10 and 25
                    character.takeDamage(enemyDamage);
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println(character.getName() + " has fallen. " + objHum.getName() + " prevails.");
                    TurnCounter = 0;
                    character.setDefeated(true);
                    break;
                } else if (objHum.getHealth() <= 0) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("\t "+character.getName() + " has defeated " + objHum.getName());
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n\n");
                    gold = (int) (Math.random() * (75 - 45 + 1)) + 45;
                    objIn.setGold(gold);
                    System.out.println(character.getName() + " has earned " + gold + " gold!");
                    Exp = (int) (Math.random() * (25 - 15 + 1)) + 15;
                    System.out.println(character.getName() + " have received " + Exp + " XP!");
                    character.addExp(Exp);
                    TurnCounter = 0;

                    audioManager.stopAudio();
                    audioManager.playAudio("c:\\Users\\User\\Downloads\\Dark Souls_ Chiptune Demixes - Centipede Demon.wav");
                    System.out.println("\n----------------------------------------------\n");
                    System.out.println("After defeating those who attempted to trample your path, you managed to prevail on your adventure,\n"+
                    "you travel accross the great mountains, seeking to defeat the 3 headed dragon...");
                    System.out.println("\nPress 'Enter' to continue");
                    scanner.nextLine();
                    
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("----------------------------------------------\n");
                    System.out.println("After climbing the top of the mountain, the three headed dragon roars showcasing its greatness and power.");
                    System.out.println("\nPress 'Enter' to continue");
                    scanner.nextLine();
                    
                    objTia.Tiamat_Backstory();
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }




        
         while (objTia.getHealth() > 0 && character.getHealth() > 0) {
            
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("==================================================");
            System.out.println("||      WALL 3: Nippur     ||      FINAL BOSS    ||");
            System.out.println("==================================================\n");
            System.out.println("\u001B[33mGold\u001B[0m: " + objIn.getGold() + "\n");
            System.out.println(character.toString());
            System.out.println(objTia.toString());

            System.out.println("---------------------------------------");
            System.out.println("Choose your action:");
            System.out.println("---------------------------------------");
            System.out.println("1. Use " + character.skillOneName() + " (30-40 damage, +15 mana)");
            System.out.println("2. Use " + character.skillTwoName() + " (35-45 damage, 20 mana)");
            System.out.println("3. Use " + character.skillThreeName() + " (40-50 damage, 30 mana)");
            System.out.println("4. ONE HIT DELETE");
            System.out.println("5. Healing Potion (" + objIn.getItemOneCount() + ")");
            System.out.println("6. Mana Potion (" + objIn.getItemTwoCount() + ")");
            System.out.println("------------------------------------------");
            System.out.print("Enter your choice: ");

            try {
                int skillChoice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                int damage = 0;
                int heal = 0;
                int mana = 0;
                int Exp = 0;
                int gold = 0;
                int multiplied = 0;
                switch (skillChoice) {
                    case 1:
                        if(objIn.getBossDropTwoCount()){
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            character.addMana();
                            damage = character.skillOne(); // Random damage between 30 and 40
                            multiplied = objIn.BossDropTwoEffect(damage);
                            System.out.println(character.getName() + " uses " + character.skillOneName() + "! Deals " + multiplied + " Multiplied damage.");
                            objTia.takeDamage(multiplied);
                        }
                        else{
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            character.addMana();
                            damage = character.skillOne(); // Random damage between 30 and 40
                            System.out.println(character.getName() + " uses " + character.skillOneName() + "! Deals " + damage + " damage.");
                            objTia.takeDamage(damage);
                        }
                        break;
                    case 2:
                        if(character.useMana(20) && objIn.getBossDropOneCount() && objIn.getBossDropTwoCount()){
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            multiplied = objIn.BossDropTwoEffect(damage);
                            character.setHeal(15);
                            System.out.println(character.getName() + " uses " + character.skillTwoName() + "! Deals " + multiplied + " Multiplied damage.");
                            objTia.takeDamage(multiplied);
                        }
                        else if (character.useMana(20)) {
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            System.out.println(character.getName() + " uses " + character.skillTwoName() + "! Deals " + damage + " damage.");
                            objTia.takeDamage(damage);
                        }
                        else{
                            continue;
                        }
                        break;
                    case 3:
                        if(character.useMana(20) && objIn.getBossDropOneCount() && objIn.getBossDropTwoCount()){
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillThree(); // Random damage between 35 and 45
                            multiplied = objIn.BossDropTwoEffect(damage);
                            character.setHeal(15);
                            System.out.println(character.getName() + " uses " + character.skillThreeName() + "! Deals " + multiplied + " Multiplied damage.");
                            objTia.takeDamage(multiplied);
                        }
                        else if (character.useMana(20)) {
                            TurnCounter++;
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillThree(); // Random damage between 35 and 45
                            System.out.println(character.getName() + " uses " + character.skillThreeName() + "! Deals " + damage + " damage.");
                            objTia.takeDamage(damage);
                        }
                        break;
                    case 4:
                        TurnCounter++;
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                        damage = character.oneHitDelete();
                        objTia.takeDamage(damage);
                        break;
                    case 5:
                        if(objIn.getItemOneCount() > 0){
                            if(character.getHealth() == 100){
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                System.out.println("\nYou're still full in Health!\n");
                                continue;
                            }
                            else{
                                TurnCounter++;
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                                System.out.println("Added +50 to " + character.getName() + "'s Health!");
                                heal = objIn.useItemOne();
                                character.setHeal(heal);
                                continue;
                            }
                        }
                        else{
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("\nYou're out of Health Potions!\n");
                            continue;
                        }
                    case 6:
                        if(objIn.getItemTwoCount() > 0){
                            if(character.getMana() == 100){
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                System.out.println("\nYou're still full in Mana!\n");
                                continue;
                            }
                            else{
                                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                                System.out.println("Added +50 to " + character.getName() + "'s Mana!");
                                mana = objIn.useItemTwo();
                                character.setMana(mana);
                                continue;
                            }
                        }
                        else{
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("\nYou're out of Mana Potions!\n");
                            continue;
                        }
                    default:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("\nNot enough mana or invalid choice! Choose again.\n");
                        continue;
                }

                // Enemy's turn to attack
                if (objTia.getHealth() > 0) {
                    int enemyDamage = 0;
                    int randomPick = (int) (Math.random() * (3 - 1 + 1)) + 1;
                    switch(randomPick){
                        case 1:
                            enemyDamage = objTia.skillOne();  // Random damage between 10 and 25
                            character.takeDamage(enemyDamage);
                            break;
                        case 2:
                            enemyDamage = objTia.skillTwo(); // Random damage between 10 and 25
                            character.takeDamage(enemyDamage);
                            break;
                        case 3:
                            enemyDamage = objTia.skillThree();  // Random damage between 10 and 25
                            character.takeDamage(enemyDamage);
                            break;
                        default:
                    }
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println(character.getName() + " has fallen. " + objTia.getName() + " prevails.");
                    TurnCounter = 0;
                    character.setDefeated(true);
                    break;
                } else if (objTia.getHealth() <= 0) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("\t "+character.getName() + " has defeated " + objTia.getName());
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n\n");
                    gold = (int) (Math.random() * (250 - 100 + 1)) + 100;
                    objIn.setGold(gold);
                    System.out.println(character.getName() + " has earned " + gold + " gold!");
                    Exp = (int) (Math.random() * (25 - 15 + 1)) + 15;
                    System.out.println(character.getName() + " have received " + Exp + " XP!");
                    character.addExp(Exp);
                    audioManager.stopAudio();
        audioManager.playAudio("c:\\Users\\User\\Downloads\\Dark Souls_ Chiptune Demixes - Character Config [bonus].wav");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-TIAMAT HAS BEEN DEFEATED!-=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("The battle has been long and brutal. You are bruised and battered but still stands.\n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();


         System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("Then, Tiamat unleashes her final assault, an overwhelming surge of energy that threatens to consume all in its path.\n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();

         System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("You have been hit! The surge of raging pain is flowing through your veins.\n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();



         System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("Tiamat has fallen and so are you.\n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();

         System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println(". . . *silence*...\n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();

         System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println(". . . \n");
         System.out.println("Press 'Enter' to open your eyes");
         scanner.nextLine();


         
         System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("The bright red sky is no more, but you've noticed that you're at the forest where Jormangandr lives.\n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();


         System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("Turns out, after defeating the creator of creatures (Tiamat),\n"
        + "Jormungandr took your body and healed you with its mystic power. \n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();
        

         System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("You are alone but victorious as the evil forces are no more. \n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();


         System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
         System.out.println("-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("You stood up and walk your path way home.\n");
         System.out.println("Press 'Enter' to continue");
         scanner.nextLine();
                    TurnCounter = 0;
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }
        
    }
}