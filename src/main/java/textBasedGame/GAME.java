package textBasedGame;

import java.util.Scanner;

public class GAME{
    Musashi objMush = new Musashi("Musashi Miyamoto", 100, 100);
    KrevMalak objKrev = new KrevMalak("Krev Malak",150);
    Kappa objKappa = new Kappa("Kappa", 100);
    Hyosube objHyo = new Hyosube("Hyosube", 100);
   
    Scanner scanner = new Scanner(System.in);    
    

    public void start() {
        while (true) {
            try {
                System.out.println("The Walls of the Fallen!");
                System.out.println("1. Start");
                System.out.println("2. Exit");
                System.out.print("Enter your choice!: ");
                int choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("The game has started!\n");
                    scanner.nextLine();  // Consume newline
                    introduction();
                    break;
                } else if (choice == 2) {
                    System.out.println("You have exited the game!");
                    return;
                } else {
                    System.out.println("Please enter a valid choice!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine();
            }
        }
    }

    private void introduction() {
        System.out.println("Your journey begins now....");
        System.out.println("You begin as Musashi Miyamoto (The Cursed Assassin).");
        System.out.println("In a world consumed by chaos and darkness, where the line between life and death has long since blurred...");
        System.out.println("He embarks on a perilous journey, his fate bound by the weight of an unbroken curse.");
        System.out.println("Now, the battle approaches. Before him stands " + objKrev.getName() + ", the God of Despair!");

        System.out.println("Press Enter to continue.");
        scanner.nextLine();

        wallOne();
    }

    private void wallOne() {
        while (objKappa.getHealth() > 0 && objMush.getHealth() > 0){
            System.out.println(objMush.toString());
            System.out.println(objKappa.toString());
            
            System.out.println("Choose your action: ");
            System.out.println("1. Use Soul Pierce (30-40 damage, 10 mana)");
            System.out.println("2. Use Lifeblood Rend (35-45 damage, 20 mana)");
            System.out.println("3. Use Demon Fang Strike (40-50 damage, 30 mana)");
            System.out.println("4. ONE HIT DELETE");
            System.out.print("Enter your choice: ");
            
            try {
                int skillChoice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                int damage = 0;
                switch (skillChoice) {
                    case 1:
                        if (objMush.useMana(10)) {
                            damage = objMush.skillOne(); // Random damage between 30 and 40
                            objKappa.takeDamage(damage);
                        }
                        break;
                    case 2:
                        if (objMush.useMana(20)) {
                            damage = objMush.skillTwo(); // Random damage between 35 and 45
                            objKappa.takeDamage(damage);
                        }
                        break;
                    case 3:
                        if (objMush.useMana(30)) {
                            damage = objMush.skillThree();// Random damage between 40 and 50
                            objKappa.takeDamage(damage);
                        }
                        break;
                    case 4:
                        damage = objMush.oneHitDelete();
                        objKappa.takeDamage(damage);
                        break;
                    default:
                        System.out.println("Not enough mana or invalid choice! Choose again.");
                        continue;
                }

                // Enemy's turn to attack
                if (objKappa.getHealth() > 0) {
                    int enemyDamage = 0;
                    enemyDamage = objKappa.skillOne();  // Random damage between 10 and 25
                    objMush.takeDamage(enemyDamage);
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (objMush.getHealth() <= 0) {
                    System.out.println("Musashi has fallen. " + objKappa.getName() + " prevails.");
                    break;
                } else if (objKappa.getHealth() <= 0) {
                    System.out.println("Musashi has defeated " + objKappa.getName() + "! Musashi Advances");
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }
        
        
        while (objHyo.getHealth() > 0 && objMush.getHealth() > 0){
            System.out.println(objMush.toString());
            System.out.println(objHyo.toString());
            
            System.out.println("Choose your action: ");
            System.out.println("1. Use Soul Pierce (30-40 damage, 10 mana)");
            System.out.println("2. Use Lifeblood Rend (35-45 damage, 20 mana)");
            System.out.println("3. Use Demon Fang Strike (40-50 damage, 30 mana)");
            System.out.println("4. ONE HIT DELETE");
            System.out.print("Enter your choice: ");
            
            try {
                int skillChoice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                int damage = 0;
                switch (skillChoice) {
                    case 1:
                        if (objMush.useMana(10)) {
                            damage = objMush.skillOne(); // Random damage between 30 and 40
                            objHyo.takeDamage(damage);
                        }
                        break;
                    case 2:
                        if (objMush.useMana(20)) {
                            damage = objMush.skillTwo(); // Random damage between 35 and 45
                            objHyo.takeDamage(damage);
                        }
                        break;
                    case 3:
                        if (objMush.useMana(30)) {
                            damage = objMush.skillThree();// Random damage between 40 and 50
                            objHyo.takeDamage(damage);
                        }
                        break;
                    case 4:
                        damage = objMush.oneHitDelete();
                        objHyo.takeDamage(damage);
                        break;
                    default:
                        System.out.println("Not enough mana or invalid choice! Choose again.");
                        continue;
                }

                // Enemy's turn to attack
                if (objHyo.getHealth() > 0) {
                    int enemyDamage = 0;
                    enemyDamage = objHyo.skillOne();  // Random damage between 10 and 25
                    objMush.takeDamage(enemyDamage);
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (objMush.getHealth() <= 0) {
                    System.out.println("Musashi has fallen. " + objHyo.getName() + " prevails.");
                    break;
                } else if (objHyo.getHealth() <= 0) {
                    System.out.println("Musashi has defeated " + objHyo.getName() + "! Musashi Advances");
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }
             
    
        while (objKrev.getHealth() > 0 && objMush.getHealth() > 0) {
            System.out.println(objMush.toString());
            System.out.println(objKrev.toString());

            System.out.println("Choose your action:");
            System.out.println("1. Use Soul Pierce (30-40 damage, 10 mana)");
            System.out.println("2. Use Lifeblood Rend (35-45 damage, 20 mana)");
            System.out.println("3. Use Demon Fang Strike (40-50 damage, 30 mana)");
            System.out.println("4. ONE HIT DELETE");
            System.out.print("Enter your choice: ");

            try {
                int skillChoice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                int damage = 0;
                switch (skillChoice) {
                    case 1:
                        if (objMush.useMana(10)) {
                            damage = objMush.skillOne(); // Random damage between 30 and 40
                            objKrev.takeDamage(damage);
                        }
                        break;
                    case 2:
                        if (objMush.useMana(20)) {
                            damage = objMush.skillTwo(); // Random damage between 35 and 45
                            objKrev.takeDamage(damage);
                        }
                        break;
                    case 3:
                        if (objMush.useMana(30)) {
                            damage = objMush.skillThree();// Random damage between 40 and 50
                            objKrev.takeDamage(damage);
                        }
                        break;
                    case 4:
                        damage = objMush.oneHitDelete();
                        objKrev.takeDamage(damage);
                        break;
                    default:
                        System.out.println("Not enough mana or invalid choice! Choose again.");
                        continue;
                }

                // Enemy's turn to attack
                if (objKrev.getHealth() > 0) {
                    int enemyDamage = 0;
                    int randomPick = (int) (Math.random() * (3 - 1 + 1)) + 1;
                    switch(randomPick){
                        case 1:
                            enemyDamage = objKrev.skillOne();  // Random damage between 10 and 25
                            objMush.takeDamage(enemyDamage);
                            break;
                        case 2:
                            enemyDamage = objKrev.skillTwo(); // Random damage between 10 and 25
                            objMush.takeDamage(enemyDamage);
                            break;
                        case 3:
                            enemyDamage = objKrev.skillThree();  // Random damage between 10 and 25
                            objMush.takeDamage(enemyDamage);
                            break;
                        default:
                    }
                }

                System.out.println("------------------------------------");

                // Check if either has fallen
                if (objMush.getHealth() <= 0) {
                    System.out.println("Musashi has fallen. " + objKrev.getName() + " prevails.");
                    break;
                } else if (objKrev.getHealth() <= 0) {
                    System.out.println("Musashi has defeated " + objKrev.getName() + "! He has earned his freedom.");
                    // Rewards logic can go here (e.g., coins)
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.nextLine();  // Clear the buffer
            }
        }

        // You can add additional logic here for the shop or continue the game
    }

    public static void main(String[] args) {
        GAME game = new GAME();
        game.start();
    }
}