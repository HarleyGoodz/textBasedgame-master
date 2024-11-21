package textBasedGame;

import java.io.File;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class MainGame {

    private static Clip currentClip;

    public static void playAudio(String filePath) {
        stopCurrentClip(); 
        try {
            File file = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            currentClip = AudioSystem.getClip();
            currentClip.open(audioStream);
            currentClip.start();
        } catch (Exception e) {
            System.out.println("Error playing audio: " + e.getMessage());
        }
    }

    public static void stopCurrentClip() {
        if (currentClip != null && currentClip.isRunning()) {
            currentClip.stop();
            currentClip.close();
        }
    }

    public static void main(String[] args) {
        AudioManager audioManager = new AudioManager();
        Scanner scan = new Scanner(System.in);
        storyOne objWallOne = new storyOne(audioManager);
        storyTwo objWallTwo = new storyTwo(audioManager);
        storyThree objWallThree = new storyThree(audioManager);
        Inventory objIn = new Inventory();
        openShop objShop = new openShop(objIn);

        int choice = 0;
        boolean isEnabled = true;

        System.out.println("\n\n\n");

        
        File file = new File("textBasedgame-master/OST/Starting.wav");
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            while (isEnabled) {
                try {
                    String[] text = {
                        "\t\t▄▄▌ ▐ ▄▌ ▄▄▄· ▄▄▌  ▄▄▌  .▄▄ ·           ·▄▄▄    ▄▄▄▄▄ ▄ .▄▄▄▄ .    ·▄▄▄ ▄▄▄· ▄▄▌  ▄▄▌  ▄▄▄ . ▐ ▄ ",
                        "\t\t██· █▌▐█▐█ ▀█ ██•  ██•  ▐█ ▀.     ▪     ▐▄▄·    •██  ██▪▐█▀▄.▀·    ▐▄▄·▐█ ▀█ ██•  ██•  ▀▄.▀·•█▌▐█",
                        "\t\t██▪▐█▐▐▌▄█▀▀█ ██▪  ██▪  ▄▀▀▀█▄     ▄█▀▄ ██▪      ▐█.▪██▀▐█▐▀▀▪▄    ██▪ ▄█▀▀█ ██▪  ██▪  ▐▀▀▪▄▐█▐▐▌",
                        "\t\t▐█▌██▐█▌▐█ ▪▐▌▐█▌▐▌▐█▌▐▌▐█▄▪▐█    ▐█▌.▐▌██▌.     ▐█▌·██▌▐▀▐█▄▄▌    ██▌.▐█ ▪▐▌▐█▌▐▌▐█▌▐▌▐█▄▄▌██▐█▌",
                        "\t\t ▀▀▀▀ ▀▪ ▀  ▀ .▀▀▀ .▀▀▀  ▀▀▀▀      ▀█▄▀▪▀▀▀      ▀▀▀ ▀▀▀ · ▀▀▀     ▀▀▀  ▀  ▀ .▀▀▀ .▀▀▀  ▀▀▀ ▀▀ █▪"
                    };
                    for (String line : text) {
                        System.out.println(line);
                    }

                    System.out.println("\n\n\n");
                    System.out.println("\t\t\t\t\t\t\t1. Start Game");
                    System.out.println("\t\t\t\t\t\t\t2. exit");
                    System.out.print("\t\t\t\t\t\t\tEnter your choice!: ");
                    choice = scan.nextInt();

                    if (choice == 1) {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("            The game has started!\n");
                        System.out.println("---------------------------------------");
                        System.out.println();
                        scan.nextLine();
                        isEnabled = false;
                    } else if (choice == 2) {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("You have exited the game!");
                        return;
                    } else {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        System.out.println("---------------------------------------");
                        System.out.println("Please enter a valid choice!");
                        System.out.println("");
                    }
                } catch (Exception e) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
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
                            playerCharacter = new Musashi("Musashi Miyamoto", 100, 100, 100);
                            playerCharacter.intro();
                            clip.stop(); 
                            isEnabled = false;
                            break;
                        case 2:
                            playerCharacter = new Thorfinn("Thorfinn", 150, 100, 100);
                            playerCharacter.intro();
                            clip.stop(); 
                            isEnabled = false;
                            break;
                        case 3:
                            playerCharacter = new Gilgamesh("Gilgamesh", 100, 200, 100);
                            playerCharacter.intro();
                            clip.stop(); 
                            isEnabled = false;
                            break;
                        default:
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            System.out.println("------------------------------------------");
                            System.out.println("Invalid choice.");
                            System.out.println("");
                    }
                } catch (Exception e) {
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("------------------------------------------");
                    System.out.println("Invalid input! Please enter a number.");
                    System.out.println("");
                    scan.nextLine();
                }
            }

            
            objWallOne.wallOne(playerCharacter, objIn);

            if (playerCharacter.getDefeated()) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("YOU HAVE BEEN DEFEATED!");
                return;
            }
            
            
            objWallTwo.wallTwo(playerCharacter, objIn);

            if (playerCharacter.getDefeated()) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("YOU HAVE BEEN DEFEATED!");
                return;
            }

            
            objWallThree.wallThree(playerCharacter, objIn);

            if (playerCharacter.getDefeated()) {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("YOU HAVE BEEN DEFEATED!");
                return;
            }
            
            playerCharacter.ending();
            

        System.out.println("\t\t\t\t\t████████╗██╗  ██╗███████╗    ███████╗███╗   ██╗██████╗ ");
        System.out.println("\t\t\t\t\t╚══██╔══╝██║  ██║██╔════╝    ██╔════╝████╗  ██║██╔══██╗");
        System.out.println("\t\t\t\t\t   ██║   ███████║█████╗      █████╗  ██╔██╗ ██║██║  ██║");
        System.out.println("\t\t\t\t\t   ██║   ██╔══██║██╔══╝      ██╔══╝  ██║╚██╗██║██║  ██║");
        System.out.println("\t\t\t\t\t   ██║   ██║  ██║███████╗    ███████╗██║ ╚████║██████╔╝");
        System.out.println("\t\t\t\t\t   ╚═╝   ╚═╝  ╚═╝╚══════╝    ╚══════╝╚═╝  ╚═══╝╚═════╝ ");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        } catch (Exception e) {
            System.out.println("Error playing audio: " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
