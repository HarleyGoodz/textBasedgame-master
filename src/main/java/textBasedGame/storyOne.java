package textBasedGame;

import java.util.Scanner;

public class storyOne {
    KrevMalak objKrev = new KrevMalak("Krev Malak",150);
    Kappa objKappa = new Kappa("Kappa", 100);
    Hyosube objHyo = new Hyosube("Hyosube", 100);
    ClearScreen objClear = new ClearScreen();
    CenterAlign objPrint = new CenterAlign();
    Scanner scanner = new Scanner(System.in);
    int TurnCounter = 0;

    private AudioManager audioManager;

    public storyOne(AudioManager audioManager) {
        this.audioManager = audioManager;
    }
    
    public void wallOne(Player character, Inventory objIn){
        Scanner scanner = new Scanner(System.in);
        openShop objShop = new openShop(objIn);

        audioManager.playAudio("C:\\Users\\Silent Voice\\Documents\\GameProj\\textBasedgame-master\\OST\\Undertale OST_ 014 - Heartache - Misaki.wav");

        

        
        
        objClear.clearScreen();
        objPrint.printCentered("-----------------------------------------------");
        System.out.println();
        objPrint.printCentered("Prepare for battle as two of the demons appeared in your path, GET READY TO KILL!");
        System.out.println("");
        objPrint.printCentered("Press 'Enter' to continue");
        scanner.nextLine();
        objClear.clearScreen();
        
        while (objKappa.getHealth() > 0 && character.getHealth() > 0){
            
            
            System.out.println("======================================================");
            System.out.println("||      WALL 1: Gunkanjima     ||      MINION 1    ||");
            System.out.println("======================================================\n");
            System.out.println(objKappa.toString());
            System.out.println(character.toString());
            System.out.println("\u001B[33mGold\u001B[0m: " + objIn.getGold() + "\n");
           

            
            
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
                        objKappa.takeDamage(damage);
                        
                        break;
                    case 2:
                        if (character.useMana(20)) {
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            System.out.println(character.getName() + " uses " + character.skillTwoName() + "! Deals " + damage + " damage.");
                            objKappa.takeDamage(damage);
                        }
                        else{
                            continue;
                        }
                        break;
                    case 3:
                        if (character.useMana(30)) {
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillThree();// Random damage between 40 and 50
                            System.out.println(character.getName() + " uses " + character.skillThreeName() + "! Deals " + damage + " damage.");
                            objKappa.takeDamage(damage);
                        }
                        else{
                            continue;
                        }
                        break;
                    case 4:
                        TurnCounter++;
                        
                        System.out.println("==========================");
                        System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                        System.out.println("==========================\n");
                        damage = character.oneHitDelete();
                        objKappa.takeDamage(damage);
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
                                System.out.println("Added +50 to " + character.getName() + "'s Health!");
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
                if (objKappa.getHealth() > 0) {
                    int enemyDamage = 0;
                    enemyDamage = objKappa.skillOne();  // Random damage between 10 and 25
                    character.takeDamage(enemyDamage);
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    objClear.clearScreen();
                    System.out.println(character.getName() + " has fallen. " + objKappa.getName() + " prevails.");
                    TurnCounter = 0;
                    character.setDefeated(true);
                    break;
                } else if (objKappa.getHealth() <= 0) {
                    objClear.clearScreen();
                    
                    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("\t"+character.getName() + " has defeated " + objKappa.getName());
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
        
        
        while (objHyo.getHealth() > 0 && character.getHealth() > 0){
            
            System.out.println("======================================================");
            System.out.println("||      WALL 1: Gunkanjima     ||      MINION 2    ||");
            System.out.println("======================================================\n");
            System.out.println(objHyo.toString());
            System.out.println(character.toString());
            System.out.println("\u001B[33mGold\u001B[0m: " + objIn.getGold() + "\n");
            
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
                        objHyo.takeDamage(damage);
                        
                        break;
                    case 2:
                        if (character.useMana(20)) {
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            System.out.println(character.getName() + " uses " + character.skillTwoName() + "! Deals " + damage + " damage.");
                            objHyo.takeDamage(damage);
                        }
                        else{
                            continue;
                        }
                        break;
                    case 3:
                        if (character.useMana(30)) {
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillThree();// Random damage between 40 and 50
                            System.out.println(character.getName() + " uses " + character.skillThreeName() + "! Deals " + damage + " damage.");
                            objHyo.takeDamage(damage);
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
                        objHyo.takeDamage(damage);
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
                                System.out.println("Added +50 to " + character.getName() + "'s Health!");
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
                        System.out.println("==========================");
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
                if (objHyo.getHealth() > 0) {
                    int enemyDamage = 0;
                    enemyDamage = objHyo.skillOne();  // Random damage between 10 and 25
                    character.takeDamage(enemyDamage);
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    objClear.clearScreen();
                    System.out.println(character.getName() + " has fallen. " + objHyo.getName() + " prevails.");
                    TurnCounter = 0;
                    character.setDefeated(true);
                    break;
                } else if (objHyo.getHealth() <= 0) {
                    objClear.clearScreen();
                    objPrint.printCentered("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    objPrint.printCentered(character.getName() + " has defeated " + objHyo.getName());
                    objPrint.printCentered("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n\n");
                    gold = (int) (Math.random() * (100 - 75 + 1)) + 75;
                    objIn.setGold(gold);
                    objPrint.printCentered(character.getName() + " has earned " + gold + " gold!");
                    Exp = (int) (Math.random() * (25 - 15 + 1)) + 15;
                    objPrint.printCentered(character.getName() + " have received " + Exp + " XP!");
                    character.addExp(Exp);
                    TurnCounter = 0;
                    
                    

                    objPrint.printCentered("------------------------------------------");
                    System.out.println("");
                    objPrint.printCentered("After killing the 2 demons that blocked your path...");
                    objPrint.printCentered("you continued at your journey, smelling the scent of a godly power....");
                    System.out.println("");
                    objPrint.printCentered("Press 'Enter' to Continue");    
                    scanner.nextLine();
                    
                    objClear.clearScreen();
                    objPrint.printCentered("------------------ARRIVAL!------------------");
                    System.out.println("");
                    objPrint.printCentered("You have finally arrived at the hellish domain of KREV MALAK!");
                    System.out.println("");
                    objPrint.printCentered("Press 'Enter' to Continue");
                    scanner.nextLine();
                    
                    objKrev.Krev_BackStory();
                    objKrev.Krev_IncomingBattle();
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                objClear.clearScreen();
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }

        audioManager.stopAudio();
        audioManager.playAudio("C:\\Users\\Silent Voice\\Documents\\GameProj\\textBasedgame-master\\OST\\Dark Souls_ Chiptune Demixes - Iron Golem.wav");
        objClear.clearScreen();
    
        while (objKrev.getHealth() > 0 && character.getHealth() > 0) {
            
            System.out.println("======================================================");
            System.out.println("||      WALL 1: Gunkanjima     ||      BOSS 1    ||");
            System.out.println("======================================================\n");
            System.out.println(objKrev.toString());
            System.out.println(character.toString());
            System.out.println("\u001B[33mGold\u001B[0m: " + objIn.getGold() + "\n");

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
                        objKrev.takeDamage(damage);
                        
                        break;
                    case 2:
                        if (character.useMana(20)) {
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillTwo(); // Random damage between 35 and 45
                            System.out.println(character.getName() + " uses " + character.skillTwoName() + "! Deals " + damage + " damage.");
                            objKrev.takeDamage(damage);
                        }
                        else{
                            continue;
                        }
                        break;
                    case 3:
                        if (character.useMana(30)) {
                            TurnCounter++;
                            objClear.clearScreen();
                            System.out.println("==========================");
                            System.out.println("||    Turn count: "+ TurnCounter +"     ||");
                            System.out.println("==========================\n");
                            damage = character.skillThree();// Random damage between 40 and 50
                            System.out.println(character.getName() + " uses " + character.skillThreeName() + "! Deals " + damage + " damage.");
                            objKrev.takeDamage(damage);
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
                        objKrev.takeDamage(damage);
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
                                System.out.println("Added +50 to " + character.getName() + "'s Health!");
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
                if (objKrev.getHealth() > 0) {
                    int enemyDamage = 0;
                    int randomPick = (int) (Math.random() * (3 - 1 + 1)) + 1;
                    switch(randomPick){
                        case 1:
                            enemyDamage = objKrev.skillOne();  // Random damage between 10 and 25
                            character.takeDamage(enemyDamage);
                            break;
                        case 2:
                            enemyDamage = objKrev.skillTwo(); // Random damage between 10 and 25
                            character.takeDamage(enemyDamage);
                            break;
                        case 3:
                            enemyDamage = objKrev.skillThree();  // Random damage between 10 and 25
                            character.takeDamage(enemyDamage);
                            break;
                        default:
                    }
                }
                

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (character.getHealth() <= 0) {
                    audioManager.stopAudio();
                    objClear.clearScreen();
                    System.out.println(character.getName() + " has fallen. " + objKrev.getName() + " prevails.");
                    TurnCounter = 0;
                    character.setDefeated(true);
                    break;
                } else if (objKrev.getHealth() <= 0) {
                    audioManager.stopAudio();
                    audioManager.playAudio("C:\\Users\\Silent Voice\\Documents\\GameProj\\textBasedgame-master\\OST\\8-bit RPG Music  Victory Theme.wav");
                    objClear.clearScreen();
                    objPrint.printCentered("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                    objPrint.printCentered(character.getName() + " has defeated " + objKrev.getName());
                    objPrint.printCentered("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n\n");
                    gold = (int) (Math.random() * (250 - 100 + 1)) + 100;
                    objIn.setGold(gold);
                    objPrint.printCentered(character.getName() + " has earned " + gold + " gold!");
                    Exp = (int) (Math.random() * (25 - 15 + 1)) + 15;
                    objPrint.printCentered(character.getName() + " have received " + Exp + " XP!");
                    character.addExp(Exp);
                    objIn.IncBossDropOneCount();

                    objPrint.printCentered("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

                    objPrint.printCentered("\t\u001B[32mYOU HAVE RECEIVED '" + objIn.getBossDropOne() + "'\u001B[0m ");
                    objPrint.printCentered("\t\u001B[31mIN EFFECT!: LIFESTEAL +15\u001B[0m");

                    objPrint.printCentered("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    
                    objPrint.printCentered("Press 'Enter' to Continue!");

                    scanner.nextLine();
                    objKrev.Krev_Defeat();
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

        // You can add additional logic here for the shop or continue the game
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