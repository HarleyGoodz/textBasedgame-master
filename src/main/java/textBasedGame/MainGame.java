package textBasedGame;

/**
 *
 * @author Silent Voice
 */
import java.util.Scanner;

public class MainGame {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        storyOne objWallOne = new storyOne();
        storyTwo objWallTwo = new storyTwo();
        storyThree objWallThree = new storyThree();
        Inventory objIn = new Inventory();
        openShop objShop = new openShop(objIn);

        int choice = 0;

        boolean isEnabled = true;

        while (isEnabled) {
            try {
                System.out.println("-=-=-=-=-=-=-==-=-=-=-=-=-=-=--=-=-=-=-=-=-==-=-=-=-");
                System.out.println("            The Walls of the Fallen!");
                System.out.println("            1. Start");
                System.out.println("            2. Exit");
                System.out.println("            Enter your choice!: ");
                System.out.println("-=-=-=-=-=-=-==-=-=-=-=-=-=-=--=-=-=-=-=-=-==-=-=-=-");
                
                choice = scan.nextInt();

                if (choice == 1) {
                    System.out.println("The game has started!\n");
                    System.out.println("---------------------------------------");
                    System.out.println();
                    scan.nextLine();
                    isEnabled = false;
                } else if (choice == 2) {
                    System.out.println("You have exited the game!");
                    return;
                } else {
                    System.out.println("");
                    System.out.println("---------------------------------------");
                    System.out.println("Please enter a valid choice!");
                    System.out.println("");
                }
            } catch (Exception e) {
                System.out.println("");
                System.out.println("---------------------------------------");
                System.out.println("Invalid input! Please enter a number.");
                System.out.println("");
                scan.nextLine();
            }
        }
        Player playerCharacter = null;
        isEnabled = true;

        while (isEnabled) {
            try {
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("");
                System.out.println("        Choose your character: ");
                System.out.println("        1. Musashi Miyamoto    ");
                System.out.println("        2. Thorfinn            ");
                System.out.println("        3. Gilgamesh           ");
                System.out.println("");
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

                System.out.print("Enter choice: ");
                choice = scan.nextInt();

                switch (choice) {

                    case 1:
                        playerCharacter = new Musashi("Musashi Miyamoto", 100, 100);
                        playerCharacter.intro();
                        isEnabled = false;
                        break;
                    case 2:
                        playerCharacter = new Thorfinn("Thorfinn", 150, 100) {
                        };
                        playerCharacter.intro();
                        isEnabled = false;
                        break;
                    case 3:
                        playerCharacter = new Gilgamesh("Gilgamesh", 100, 200);
                        playerCharacter.intro();
                        isEnabled = false;
                        break;
                    default:
                        System.out.println("");
                        System.out.println("------------------------------------------");
                        System.out.println("Invalid choice.");
                        System.out.println("");
                }
            } catch (Exception e) {
                System.out.println("");
                System.out.println("------------------------------------------");
                System.out.println("Invalid input! Please enter a number.");
                System.out.println("");
                scan.nextLine();
            }
        }

        objWallOne.wallOne(playerCharacter, objIn);

        if (playerCharacter.getDefeated()) {
            System.out.println("YOU HAVE BEEN DEFEATED!");
            return;
        }

        objWallTwo.wallTwo(playerCharacter, objIn);

        if (playerCharacter.getDefeated()) {
            System.out.println("YOU HAVE BEEN DEFEATED!");
            return;
        }

        objWallThree.wallThree(playerCharacter, objIn);

        if (playerCharacter.getDefeated()) {
            System.out.println("YOU HAVE BEEN DEFEATED!");
            return;
        }

        playerCharacter.ending();

        System.out.println("------------------------THE END--------------------------");
    }
    //}
}
