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
public class storyTwo {
    Jormungandr objJorm = new Jormungandr("Jormungandr", 500);
    Draugar objDrau = new Draugar("Draugar", 100);
    Fossegrimen objFoss = new Fossegrimen("Fossegrimen", 100);
    Mare objMare = new Mare("Mare", 100);

    CenterAlign objPrint = new CenterAlign();
    ClearScreen objClear = new ClearScreen();

    Scanner scanner = new Scanner(System.in);
    int TurnCounter = 0;

    private AudioManager audioManager;

    public storyTwo(AudioManager audioManager) {
        this.audioManager = audioManager;
    }

    
    public void wallTwo(Player character, Inventory objIn){
       Scanner scanner = new Scanner(System.in);
       openShop objShop = new openShop(objIn);
       
       audioManager.stopAudio();
       audioManager.playAudio("C:\\Users\\Silent Voice\\Documents\\GameProj\\textBasedgame-master\\OST\\Dark Souls_ Chiptune Demixes - Knight Artorias.wav");
    
       
       objPrint.printCentered("-------------------A NEW JOURNEY HAS BEGUN!-------------------");
       System.out.println("");
       objPrint.printCentered("This is just the starting point of your adventure. Be wary of your surroundings as demons may appear");
       objPrint.printCentered("out of sight and might take your life!");
       System.out.println();
       objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();

        
        
        objClear.clearScreen();
        objPrint.printCentered("-----------------------------------------------");
        System.out.println("");
        objPrint.printCentered("As you walk accross the dark forest, having no vision in sight, fogs are thick and you can hear your own breathing");
        objPrint.printCentered("because of the silence and eerie feeling of the forest!");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
        objClear.clearScreen();
        objPrint.printCentered("-----------------------------------------------");
        System.out.println();
        objPrint.printCentered("As you walk by... you can feel at any moment that you can get killed...");
        objPrint.printCentered("strange sounds are getting louder and louder");
        System.out.println();
        objPrint.printCentered("Press 'Enter' to Continue");
        scanner.nextLine();
        
        objClear.clearScreen();
        objPrint.printCentered("------------------CONFRONTATION!------------------");
        System.out.println();
        objPrint.printCentered("The demons screamed and charged at you, revealing their location!");
        objPrint.printCentered("3 of them appeared and sorrounded you!");
        System.out.println();
        objPrint.printCentered("Press 'Enter' to Fight!");
                
        scanner.nextLine();
        objClear.clearScreen();
        
        
        
        while (objMare.getHealth() > 0 && character.getHealth() > 0){
            
            System.out.println("====================================================");
            System.out.println("||      WALL 2: Bjorndal     ||      MINION 1    ||");
            System.out.println("====================================================\n");
            System.out.println(objMare.toString());
            System.out.println(character.toString());
            System.out.println("\u001B[33mGold\u001B[0m: " + objIn.getGold() + "\n");
            
            System.out.println("---------------------------------------");
            System.out.println("Choose your action: ");
            System.out.println("---------------------------------------");
            System.out.println("1. Use " + character.skillOneName() + " (30-40 damage, +15 mana)");
            System.out.println("2. Use " + character.skillTwoName() + " \u001B[31m(IN EFFECT!: LIFESTEAL)\u001B[0m (35-45 damage, 20 mana)");
            System.out.println("3. Use " + character.skillThreeName() + " \u001B[31m(IN EFFECT!: LIFESTEAL)\u001B[0m (40-50 damage, 30 mana)");
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
                switch (skillChoice) {
                    case 1:
                        TurnCounter++;
                        objClear.clearScreen();
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                        character.addMana();
                        damage = character.skillOne(); // Random damage between 30 and 40
                        System.out.println(character.getName() + " uses " + character.skillOneName() + "! Deals " + damage + " damage.");
                        objMare.takeDamage(damage);
                            
                        break;
                    case 2:
                        if(character.useMana(20) && objIn.getBossDropOneCount()){
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            character.setHeal(damage / 2);
                            System.out.println(character.getName() + " uses " + character.skillTwoName() + "! Deals " + damage + " damage.");
                            objMare.takeDamage(damage);
                        }
                        else if (character.useMana(20)) {
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            System.out.println(character.getName() + " uses " + character.skillTwoName() + "! Deals " + damage + " damage.");
                            objMare.takeDamage(damage);
                        }
                        else{
                            continue;
                        }
                        break;
                    case 3:
                        if(character.useMana(30) && objIn.getBossDropOneCount()){
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillThree(); // Random damage between 35 and 45
                            character.setHeal(damage / 2);
                            System.out.println(character.getName() + " uses " + character.skillThreeName() + "! Deals " + damage + " damage.");
                            objMare.takeDamage(damage);
                        }
                        else if (character.useMana(30)) {
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillThree(); // Random damage between 35 and 45
                            System.out.println(character.getName() + " uses " + character.skillThreeName() + "! Deals " + damage + " damage.");
                            objMare.takeDamage(damage);
                        }
                        else{
                            continue;
                        }
                        break;
                    case 4:
                        TurnCounter++;
                        objClear.clearScreen();
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                        damage = character.oneHitDelete();
                        objMare.takeDamage(damage);
                        break;
                    case 5:
                        if(objIn.getItemOneCount() > 0){
                            if(character.getHealth() == character.getMaxHealth()){
                                System.out.println("\nYou're still full in Health!\n");
                                continue;
                            }
                            else{
                                objClear.clearScreen();
                                System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                                System.out.println("Added +50 to " + character.getName() + "'s Health!\n");
                                heal = objIn.useItemOne();
                                character.setHeal(heal);
                                continue;
                            }
                        }
                        else{
                            objClear.clearScreen();
                            System.out.println("\nYou're out of Health Potions!\n");
                            continue;
                        }
                    case 6:
                        if(objIn.getItemTwoCount() > 0){
                            if(character.getMana() == character.getMaxMana()){
                                objClear.clearScreen();
                                System.out.println("\nYou're still full in Mana!\n");
                                continue;
                            }
                            else{
                                objClear.clearScreen();
                                System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                                System.out.println("Added +50 to " + character.getName() + "'s Mana!\n");
                                mana = objIn.useItemTwo();
                                character.setMana(mana);
                                continue;
                            }
                        }
                        else{
                            objClear.clearScreen();
                            System.out.println("\nYou're out of Mana Potions!\n");
                            continue;
                        }
                    default:
                    objClear.clearScreen();
                        System.out.println("\nNot enough mana or invalid choice! Choose again.\n");
                        continue;
                }

                // Enemy's turn to attack
                if (objMare.getHealth() > 0) {
                    int enemyDamage = 0;
                    enemyDamage = objMare.skillOne();  // Random damage between 10 and 25
                    character.takeDamage(enemyDamage);
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    objClear.clearScreen();
                    System.out.println(character.getName() + " has fallen. " + objMare.getName() + " prevails.");
                    TurnCounter = 0;
                    character.setDefeated(true);
                    break;
                } else if (objMare.getHealth() <= 0) {
                    objClear.clearScreen();
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("\t "+character.getName() + " has defeated " + objMare.getName());
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n\n");
                    gold = (int) (Math.random() * (100 - 75 + 1)) + 75;
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
                objClear.clearScreen();
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }
        
        while (objDrau.getHealth() > 0 && character.getHealth() > 0){
            
            System.out.println("====================================================");
            System.out.println("||      WALL 2: Bjorndal     ||      MINION 2    ||");
            System.out.println("====================================================\n");
            System.out.println(objDrau.toString());
            System.out.println(character.toString());
            System.out.println("\u001B[33mGold\u001B[0m: " + objIn.getGold() + "\n");;
            
            System.out.println("---------------------------------------");
            System.out.println("Choose your action: ");
            System.out.println("---------------------------------------");
            System.out.println("1. Use " + character.skillOneName() + " (30-40 damage, +15 mana)");
            System.out.println("2. Use " + character.skillTwoName() + " \u001B[31m(IN EFFECT!: LIFESTEAL)\u001B[0m (35-45 damage, 20 mana)");
            System.out.println("3. Use " + character.skillThreeName() + " \u001B[31m(IN EFFECT!: LIFESTEAL)\u001B[0m (40-50 damage, 30 mana)");
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
                switch (skillChoice) {
                    case 1:
                        TurnCounter++;
                        objClear.clearScreen();
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                        character.addMana();
                        damage = character.skillOne(); // Random damage between 30 and 40
                        System.out.println(character.getName() + " uses " + character.skillOneName() + "! Deals " + damage + " damage.");
                        objDrau.takeDamage(damage);
                        
                        break;
                    case 2:
                        if (character.useMana(20) && objIn.getBossDropOneCount()) {
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            character.setHeal(damage / 2);
                            System.out.println(character.getName() + " uses " + character.skillTwoName() + "! Deals " + damage + " damage.");
                            objDrau.takeDamage(damage);
                        }
                        else if(character.useMana(20) && objIn.getBossDropOneCount()){
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            System.out.println(character.getName() + " uses " + character.skillTwoName() + "! Deals " + damage + " damage.");
                            objDrau.takeDamage(damage);
                        }
                        else{
                            continue;
                        }
                        break;
                    case 3:
                        if(character.useMana(30) && objIn.getBossDropOneCount()){
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillThree(); // Random damage between 35 and 45
                            character.setHeal(damage / 2);
                            System.out.println(character.getName() + " uses " + character.skillThreeName() + "! Deals " + damage + " damage.");
                            objDrau.takeDamage(damage);
                        }
                        else if (character.useMana(30)) {
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillThree();// Random damage between 40 and 50
                            System.out.println(character.getName() + " uses " + character.skillThreeName() + "! Deals " + damage + " damage.");
                            objDrau.takeDamage(damage);
                        }
                        else{
                            continue;
                        }
                        break;
                    case 4:
                        TurnCounter++;
                        objClear.clearScreen();
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                        damage = character.oneHitDelete();
                        objDrau.takeDamage(damage);
                        break;
                    case 5:
                        if(objIn.getItemOneCount() > 0){
                            if(character.getHealth() == character.getMaxHealth()){
                                objClear.clearScreen();
                                System.out.println("\nYou're still full in Health!\n");
                                continue;
                            }
                            else{
                                objClear.clearScreen();
                                System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                                System.out.println("Added +50 to " + character.getName() + "'s Health!\n");
                                heal = objIn.useItemOne();
                                character.setHeal(heal);
                                continue;
                            }
                        }
                        else{
                            objClear.clearScreen();
                            System.out.println("\nYou're out of Health Potions!\n");
                            continue;
                        }
                    case 6:
                        if(objIn.getItemTwoCount() > 0){
                            if(character.getMana() == character.getMaxMana()){
                                objClear.clearScreen();
                                System.out.println("\nYou're still full in Mana!\n");
                                continue;
                            }
                            else{
                                objClear.clearScreen();
                                System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                                System.out.println("Added +50 to " + character.getName() + "'s Mana!\n");
                                mana = objIn.useItemTwo();
                                character.setMana(mana);
                                continue;
                            }
                        }
                        else{
                            objClear.clearScreen();
                            System.out.println("\nYou're out of Mana Potions!\n");
                            continue;
                        }
                    default:
                    objClear.clearScreen();
                        System.out.println("\nNot enough mana or invalid choice! Choose again.\n");
                        continue;
                }

                // Enemy's turn to attack
                if (objDrau.getHealth() > 0) {
                    int enemyDamage = 0;
                    enemyDamage = objDrau.skillOne();  // Random damage between 10 and 25
                    character.takeDamage(enemyDamage);
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    objClear.clearScreen();
                    System.out.println(character.getName() + " has fallen. " + objDrau.getName() + " prevails.");
                    TurnCounter = 0;
                    character.setDefeated(true);
                    break;
                } else if (objDrau.getHealth() <= 0) {
                    objClear.clearScreen();
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("\t "+character.getName() + " has defeated " + objDrau.getName());
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n\n");
                    gold = (int) (Math.random() * (100 - 75 + 1)) + 75;
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
                objClear.clearScreen();
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }
        
        while (objFoss.getHealth() > 0 && character.getHealth() > 0){
            
            System.out.println("====================================================");
            System.out.println("||      WALL 2: Bjorndal     ||      MINION 3    ||");
            System.out.println("====================================================\n");
            System.out.println(objFoss.toString());
            System.out.println(character.toString());
            System.out.println("\u001B[33mGold\u001B[0m: " + objIn.getGold() + "\n");
            
            System.out.println("---------------------------------------");
            System.out.println("Choose your action: ");
            System.out.println("---------------------------------------");
            System.out.println("1. Use " + character.skillOneName() + " (30-40 damage, +15 mana)");
            System.out.println("2. Use " + character.skillTwoName() + " \u001B[31m(IN EFFECT!: LIFESTEAL)\u001B[0m (35-45 damage, 20 mana)");
            System.out.println("3. Use " + character.skillThreeName() + " \u001B[31m(IN EFFECT!: LIFESTEAL)\u001B[0m (40-50 damage, 30 mana)");
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
                switch (skillChoice) {
                    case 1:
                        TurnCounter++;
                        objClear.clearScreen();
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                        character.addMana();
                        damage = character.skillOne(); // Random damage between 30 and 40
                        System.out.println(character.getName() + " uses " + character.skillOneName() + "! Deals " + damage + " damage.");
                        objFoss.takeDamage(damage);
                        
                        break;
                    case 2:
                        if(character.useMana(20) && objIn.getBossDropOneCount()){
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            character.setHeal(damage / 2);
                            System.out.println(character.getName() + " uses " + character.skillTwoName() + "! Deals " + damage + " damage.");
                            objFoss.takeDamage(damage);
                        }
                        else if (character.useMana(20)) {
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            System.out.println(character.getName() + " uses " + character.skillTwoName() + "! Deals " + damage + " damage.");
                            objFoss.takeDamage(damage);
                        }
                        else{
                            continue;
                        }
                        break;
                    case 3:
                        if(character.useMana(30) && objIn.getBossDropOneCount()){
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillThree(); // Random damage between 35 and 45
                            character.setHeal(damage / 2);
                            System.out.println(character.getName() + " uses " + character.skillThreeName() + "! Deals " + damage + " damage.");
                            objFoss.takeDamage(damage);
                        }
                        else if (character.useMana(30)) {
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillThree();// Random damage between 40 and 50
                            System.out.println(character.getName() + " uses " + character.skillThreeName() + "! Deals " + damage + " damage.");
                            objFoss.takeDamage(damage);
                        }
                        else{
                            continue;
                        }
                        break;
                    case 4:
                        TurnCounter++;
                        objClear.clearScreen();
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                        damage = character.oneHitDelete();
                        objFoss.takeDamage(damage);
                        break;
                    case 5:
                        if(objIn.getItemOneCount() > 0){
                            if(character.getHealth() == character.getMaxHealth()){
                                objClear.clearScreen();
                                System.out.println("\nYou're still full in Health!\n");
                                continue;
                            }
                            else{
                                objClear.clearScreen();
                                System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                                System.out.println("Added +50 to " + character.getName() + "'s Health!\n");
                                heal = objIn.useItemOne();
                                character.setHeal(heal);
                                continue;
                            }
                        }
                        else{
                            objClear.clearScreen();
                            System.out.println("\nYou're out of Health Potions!\n");
                            continue;
                        }
                    case 6:
                        if(objIn.getItemTwoCount() > 0){
                            if(character.getMana() == character.getMaxMana()){
                                objClear.clearScreen();
                                System.out.println("\nYou're still full in Mana!\n");
                                continue;
                            }
                            else{
                                objClear.clearScreen();
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
                            objClear.clearScreen();
                            System.out.println("\nYou're out of Mana Potions!\n");
                            continue;
                        }
                    default:
                    objClear.clearScreen();
                        System.out.println("\nNot enough mana or invalid choice! Choose again.\n");
                        continue;
                }

                // Enemy's turn to attack
                if (objFoss.getHealth() > 0) {
                    int enemyDamage = 0;
                    enemyDamage = objFoss.skillOne();  // Random damage between 10 and 25
                    character.takeDamage(enemyDamage);
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    audioManager.stopAudio();
                    System.out.println(character.getName() + " has fallen. " + objFoss.getName() + " prevails.");
                    TurnCounter = 0;
                    character.setDefeated(true);
                    break;
                } else if (objFoss.getHealth() <= 0) {
                    audioManager.stopAudio();
                    objClear.clearScreen();
                    objPrint.printCentered("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    objPrint.printCentered(character.getName() + " has defeated " + objFoss.getName());                    
                    objPrint.printCentered("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n\n");
                    gold = (int) (Math.random() * (100 - 75 + 1)) + 75;
                    objIn.setGold(gold);
                    objPrint.printCentered(character.getName() + " has earned " + gold + " gold!");
                    Exp = (int) (Math.random() * (25 - 15 + 1)) + 15;
                    objPrint.printCentered(character.getName() + " have received " + Exp + " XP!");
                    character.addExp(Exp);
                    TurnCounter = 0;
                    // Rewards logic can go here (e.g., coins)
                    
                    audioManager.playAudio("C:\\Users\\Silent Voice\\Documents\\GameProj\\textBasedgame-master\\OST\\Dark Souls_ Chiptune Demixes - Crossbreed Priscilla.wav");
                    objPrint.printCentered("-----------------------------------------------\n");
                    System.out.println();
                    objPrint.printCentered("After defeating the demons that ambushed you,");
                    objPrint.printCentered("you feel tired and lost in the forest...");
                    System.out.println();
                    objPrint.printCentered("Press 'Enter' to Continue");
                    scanner.nextLine();
                    
                    objClear.clearScreen();
                    objPrint.printCentered("-----------------------------------------------");
                    System.out.println();
                    objPrint.printCentered("As you sat down and lay your head, wanting to take a break but suddenly");
                    objPrint.printCentered("something weird is coming....");
                    System.out.println();
                    objPrint.printCentered("Press 'Enter' to Continue");
                    scanner.nextLine();
                    
                    objClear.clearScreen();
                    objPrint.printCentered("------------------AMBUSHED------------------");
                    objPrint.printCentered("The Earth began to rumble....");
                    objPrint.printCentered("Tress began to fall...");
                    objPrint.printCentered("an ear-splitting scream ripped through the darkness...");
                    System.out.println();
                    objPrint.printCentered("Press 'Enter' to Continue");
                    scanner.nextLine();
                    
                    objClear.clearScreen();
                    objPrint.printCentered("-----------------------------------------------");
                    System.out.println();
                    objPrint.printCentered("As you looked up into the heavens...");
                    objPrint.printCentered("A giant snake appeared!");
                    objPrint.printCentered("The Legendary Jormungandr!");
                    System.out.println();
                    objPrint.printCentered("Press 'Enter' to Continue");
                    scanner.nextLine();
                    
                    objClear.clearScreen();
                    objPrint.printCentered("-----------------------------------------------");
                    System.out.println();
                    objPrint.printCentered("The colossal serpent lunges forward, its jaws wide open, ready to engulf you in a monstrous,");
                    objPrint.printCentered("bone-crushing strike!");
                    System.out.println();
                    objPrint.printCentered("Press 'Enter' to Dodge!");
                    scanner.nextLine();
                    
                    objClear.clearScreen();
                    objPrint.printCentered("-----------------------------------------------");
                    System.out.println();
                    objPrint.printCentered("You swiftly evade the serpent's vicious lunge, adrenaline surging through your veins like wildfire.");
                    objPrint.printCentered("The air crackles with tension as you prepare for the clash of a lifetime");
                    objPrint.printCentered("an epic battle between a colossal, legendary beast and a mere mortal daring to defy fate!");
                    System.out.println();
                    objPrint.printCentered("Press 'Enter' to Continue");
                    scanner.nextLine();
                    
                    objClear.clearScreen();
                    objPrint.printCentered("-------------------PREPARE FOR BATTLE-------------------");
                    objPrint.printCentered("Your draw your weapon, setting your heart to ablaze, eradicating the tiring feeling of the recent battle you have faced!");
                    System.out.println();
                    objPrint.printCentered("Press 'Enter' to Fight!");
                    scanner.nextLine();
                    
                    break;
                }
            } catch (Exception e) {
                objClear.clearScreen();
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }
        
        
        while (objJorm.getHealth() > 0 && character.getHealth() > 0) {
            System.out.println("==================================================");
            System.out.println("||      WALL 2: Bjorndal     ||      BOSS 2    ||");
            System.out.println("==================================================\n");
            System.out.println(objJorm.toString());
            System.out.println(character.toString());
            System.out.println("\u001B[33mGold\u001B[0m: " + objIn.getGold() + "\n");


            System.out.println("---------------------------------------");
            System.out.println("Choose your action:");
            System.out.println("---------------------------------------");
            System.out.println("1. Use " + character.skillOneName() + " (30-40 damage, +15 mana)");
            System.out.println("2. Use " + character.skillTwoName() + " \u001B[31m(IN EFFECT!: LIFESTEAL)\u001B[0m (35-45 damage, 20 mana)");
            System.out.println("3. Use " + character.skillThreeName() + " \u001B[31m(IN EFFECT!: LIFESTEAL)\u001B[0m (40-50 damage, 30 mana)");
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
                switch (skillChoice) {
                    case 1:
                        TurnCounter++;
                        objClear.clearScreen();
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                        character.addMana();
                        damage = character.skillOne(); // Random damage between 30 and 40
                        System.out.println(character.getName() + " uses " + character.skillOneName() + "! Deals " + damage + " damage.");
                        objJorm.takeDamage(damage);
                        
                        break;
                    case 2:
                        if(character.useMana(20) && objIn.getBossDropOneCount()){
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            character.setHeal(damage / 2);
                            System.out.println(character.getName() + " uses " + character.skillTwoName() + "! Deals " + damage + " damage.");
                            objJorm.takeDamage(damage);
                        }
                        else if (character.useMana(20)) {
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            System.out.println(character.getName() + " uses " + character.skillTwoName() + "! Deals " + damage + " damage.");
                            objJorm.takeDamage(damage);
                        }
                        else{
                            continue;
                        }
                        break;
                    case 3:
                        if(character.useMana(30) && objIn.getBossDropOneCount()){
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillThree(); // Random damage between 35 and 45
                            character.setHeal(damage / 2);
                            System.out.println(character.getName() + " uses " + character.skillThreeName() + "! Deals " + damage + " damage.");
                            objJorm.takeDamage(damage);
                        }
                        else if (character.useMana(30)) {
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillThree();// Random damage between 40 and 50
                            System.out.println(character.getName() + " uses " + character.skillThreeName() + "! Deals " + damage + " damage.");
                            objJorm.takeDamage(damage);
                        }
                        else{
                            continue;
                        }
                        break;
                    case 4:
                        TurnCounter++;
                        objClear.clearScreen();
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                        damage = character.oneHitDelete();
                        objJorm.takeDamage(damage);
                        break;
                    case 5:
                        if(objIn.getItemOneCount() > 0){
                            if(character.getHealth() == character.getMaxHealth()){
                                objClear.clearScreen();
                                System.out.println("You're still full in Health!\n");
                                continue;
                            }
                            else{
                                objClear.clearScreen();
                                System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                                System.out.println("Added +50 to " + character.getName() + "'s Health!\n");
                                heal = objIn.useItemOne();
                                character.setHeal(heal);
                                continue;
                            }
                        }
                        else{
                            objClear.clearScreen();
                            System.out.println("\nYou're out of Health Potions!\n");
                            continue;
                        }
                    case 6:
                        if(objIn.getItemTwoCount() > 0){
                            if(character.getMana() == character.getMaxMana()){
                                objClear.clearScreen();
                                System.out.println("\nYou're still full in Mana!\n");
                                continue;
                            }
                            else{
                                objClear.clearScreen();
                                System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                                System.out.println("Added +50 to " + character.getName() + "'s Mana!\n");
                                mana = objIn.useItemTwo();
                                character.setMana(mana);
                                continue;
                            }
                        }
                        else{
                            objClear.clearScreen();
                            System.out.println("\nYou're out of Mana Potions!\n");
                            continue;
                        }
                    default:
                    objClear.clearScreen();
                        System.out.println("\nNot enough mana or invalid choice! Choose again.\n");
                        continue;
                }

                // Enemy's turn to attack
                if (objJorm.getHealth() > 0) {
                    int enemyDamage = 0;
                    int randomPick = (int) (Math.random() * (3 - 1 + 1)) + 1;
                    switch(randomPick){
                        case 1:
                            enemyDamage = objJorm.skillOne();  // Random damage between 10 and 25
                            character.takeDamage(enemyDamage);
                            break;
                        case 2:
                            enemyDamage = objJorm.skillTwo(); // Random damage between 10 and 25
                            character.takeDamage(enemyDamage);
                            break;
                        case 3:
                            enemyDamage = objJorm.skillThree();  // Random damage between 10 and 25
                            character.takeDamage(enemyDamage);
                            break;
                        default:
                    }
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    objClear.clearScreen();
                    System.out.println(character.getName() + " has fallen. " + objJorm.getName() + " prevails.");
                    TurnCounter = 0;
                    character.setDefeated(true);
                    break;
                } else if (objJorm.getHealth() <= 0) {
                    audioManager.stopAudio();
                    audioManager.playAudio("C:\\Users\\Silent Voice\\Documents\\GameProj\\textBasedgame-master\\OST\\Undertale OST_ 033 - Quiet Water.wav");
                    objClear.clearScreen();
                    objPrint.printCentered("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    objPrint.printCentered(character.getName() + " has defeated " + objJorm.getName());
                    objPrint.printCentered("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n\n");
                    gold = (int) (Math.random() * (250 - 100 + 1)) + 100;
                    objIn.setGold(gold);
                    objPrint.printCentered(character.getName() + " has earned " + gold + " gold!");
                    Exp = (int) (Math.random() * (25 - 15 + 1)) + 15;
                    objPrint.printCentered(character.getName() + " have received " + Exp + " XP!");
                    character.addExp(Exp);
                    objIn.IncBossDropTwoCount();

                    objPrint.printCentered("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("");
                    System.out.println("\u001B[34m\t\t\t\t\tINVENTORY:\n\u001B[0m");
                    System.out.println("\t\t\t\t\t" + objIn.getBossDropOne() + " = " + "\u001B[31m IN EFFECT!: LIFESTEAL\u001B[0m \n");

                    System.out.println("\t\t\t\t\tNEW ITEM!:");

                    System.out.println("\t\t\t\t\t\u001B[32m" + objIn.getBossDropTwo() + "\u001B[0m");
                    System.out.println("\t\t\t\t\t\u001B[34mIN EFFECT!: DAMAGE MULTIPLIER 1.8 - 2.0\u001B[0m");

                    System.out.println("");
                    objPrint.printCentered("You can now use LIFESTEAL and DMG MULTIPLIER at once!");

                    objPrint.printCentered("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    
                    objPrint.printCentered("Press 'Enter' to Continue!");

                    scanner.nextLine();
                    
                    objJorm.Serpent_ending();
                    TurnCounter = 0;
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                objClear.clearScreen();
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }
        
        if(character.getHealth() > 0){
            objClear.clearScreen();
            objShop.Shop(scanner);
            objPrint.printCentered("        ===========================");
            objPrint.printCentered("        ||  Healing potions: " + objIn.getItemOneCount()+"    ||");
            objPrint.printCentered("        ||  Mana potions: " + objIn.getItemTwoCount()+"       ||");
            objPrint.printCentered("        ===========================\n\n");

            System.out.println("\n\n\n\n");

            scanner.nextLine();
            
        }
    }
}