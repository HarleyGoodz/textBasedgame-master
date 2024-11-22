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
        CenterAlign objPrint = new CenterAlign();
        ClearScreen objClear = new ClearScreen();
        int retryChoice = 0;

        int choice = 0;
        boolean isEnabled = true;

        System.out.println("\n\n\n");

        
        File file = new File("C:\\Users\\Silent Voice\\Documents\\GameProj\\textBasedgame-master\\OST\\Starting.wav");
        objClear.clearScreen();
        System.out.println("\n\n\n\n\n\n");
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            while (isEnabled) {
                
                try {
                    String[] text = {
                        
                        "\033[38;5;160m\t\t\t▄▄▌ ▐ ▄▌ ▄▄▄· ▄▄▌  ▄▄▌  .▄▄ ·           ·▄▄▄    ▄▄▄▄▄ ▄ .▄▄▄▄ .    ·▄▄▄ ▄▄▄· ▄▄▌  ▄▄▌  ▄▄▄ . ▐ ▄ \033[0m",
                        "\033[38;5;196m\t\t\t██· █▌▐█▐█ ▀█ ██•  ██•  ▐█ ▀.     ▪     ▐▄▄·    •██  ██▪▐█▀▄.▀·    ▐▄▄·▐█ ▀█ ██•  ██•  ▀▄.▀·•█▌▐█\033[0m",
                        "\033[38;5;203m\t\t\t██▪▐█▐▐▌▄█▀▀█ ██▪  ██▪  ▄▀▀▀█▄     ▄█▀▄ ██▪      ▐█.▪██▀▐█▐▀▀▪▄    ██▪ ▄█▀▀█ ██▪  ██▪  ▐▀▀▪▄▐█▐▐▌\033[0m",
                        "\033[38;5;210m\t\t\t▐█▌██▐█▌▐█ ▪▐▌▐█▌▐▌▐█▌▐▌▐█▄▪▐█    ▐█▌.▐▌██▌.     ▐█▌·██▌▐▀▐█▄▄▌    ██▌.▐█ ▪▐▌▐█▌▐▌▐█▌▐▌▐█▄▄▌██▐█▌\033[0m",
                        "\033[38;5;216m\t\t\t ▀▀▀▀ ▀▪ ▀  ▀ .▀▀▀ .▀▀▀  ▀▀▀▀      ▀█▄▀▪▀▀▀      ▀▀▀ ▀▀▀ · ▀▀▀     ▀▀▀  ▀  ▀ .▀▀▀ .▀▀▀  ▀▀▀ ▀▀ █▪\033[0m"
                    };
                    
                    // Loop through each line
                    for (String line : text) {
                        try {
                            // Print the line
                            System.out.println(line);
                            // Delay for 500 milliseconds (0.5 seconds) before printing the next line
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    System.out.println("\n\n\n");
                    System.out.println("\t\t\t\t\t\t\t1. Start Game");
                    System.out.println("\t\t\t\t\t\t\t2. exit");
                    System.out.print("\t\t\t\t\t\t\tEnter your choice!: ");
                    choice = scan.nextInt();

                    if (choice == 1) {
                        objClear.clearScreen();
                        objPrint.printCentered("        The game has started!\n");
                        objPrint.printCentered("        ---------------------------------------");
                        System.out.println();
                        scan.nextLine();
                        isEnabled = false;
                    } else if (choice == 2) {
                        objClear.clearScreen();
                        objPrint.printCentered("        You have exited the game!");
                        return;
                    } else {
                        objClear.clearScreen();
                        objPrint.printCentered("        ---------------------------------------");
                        objPrint.printCentered("        Please enter a valid choice!");
                        objPrint.printCentered("");
                    }
                } catch (Exception e) {
                    objClear.clearScreen();
                    objPrint.printCentered("        ---------------------------------------");
                    objPrint.printCentered("        Invalid input! Please enter a number.");
                    objPrint.printCentered("");
                    scan.nextLine();
                }
            }

            Player playerCharacter = null;
            isEnabled = true;

            while (isEnabled) {
                try {
                    objPrint.printCentered("        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    objPrint.printCentered("");
                    objPrint.printCentered("        Choose your character: ");
                    objPrint.printCentered("        1. Musashi Miyamoto    ");
                    objPrint.printCentered("        2. Thorfinn            ");
                    objPrint.printCentered("        3. Gilgamesh           ");
                    objPrint.printCentered("");
                    objPrint.printCentered("        =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

                    System.out.print("\t\t\t\t\t\t\tEnter your choice!: ");
                    choice = scan.nextInt();

                    switch (choice) {

                        case 1:
                            playerCharacter = new Musashi("Musashi Miyamoto", 125, 100, 100);
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
                        objClear.clearScreen();
                        objPrint.printCentered("------------------------------------------");
                        objPrint.printCentered("Invalid choice.");
                        objPrint.printCentered("");
                    }
                } catch (Exception e) {
                    objClear.clearScreen();
                    objPrint.printCentered("------------------------------------------");
                    objPrint.printCentered("Invalid input! Please enter a number.");
                    objPrint.printCentered("");
                    scan.nextLine();
                }
            }

            
            objWallOne.wallOne(playerCharacter, objIn);

            if (playerCharacter.getDefeated()) {
                System.out.println("\n\n\n\n");
                System.out.println("\033[31m" + 
            "\t\t\t\t\t██████╗ ███████╗███████╗███████╗ █████╗ ████████╗███████╗██████╗\n" +
            "\t\t\t\t\t██╔══██╗██╔════╝██╔════╝██╔════╝██╔══██╗╚══██╔══╝██╔════╝██╔══██╗\n" +
            "\t\t\t\t\t██║  ██║█████╗  █████╗  █████╗  ███████║   ██║   █████╗  ██║  ██║\n" +
            "\t\t\t\t\t██║  ██║██╔══╝  ██╔══╝  ██╔══╝  ██╔══██║   ██║   ██╔══╝  ██║  ██║\n" +
            "\t\t\t\t\t██████╔╝███████╗██║     ███████╗██║  ██║   ██║   ███████╗██████╔╝\n" +
            "\t\t\t\t\t╚═════╝ ╚══════╝╚═╝     ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚═════╝\033[0m \n\n\n\n\n\n\n\n\n");
            audioManager.playAudio("C:\\Users\\Prince Tabanas\\Documents\\WALLS 1\\textBasedgame-master\\OST\\YOU DIED (HD).wav");

            
            while(true){ 
                System.out.println("\n\n\n\n");
                System.out.println("\033[31m" + 
            "\t\t\t\t\t██████╗ ███████╗███████╗███████╗ █████╗ ████████╗███████╗██████╗\n" +
            "\t\t\t\t\t██╔══██╗██╔════╝██╔════╝██╔════╝██╔══██╗╚══██╔══╝██╔════╝██╔══██╗\n" +
            "\t\t\t\t\t██║  ██║█████╗  █████╗  █████╗  ███████║   ██║   █████╗  ██║  ██║\n" +
            "\t\t\t\t\t██║  ██║██╔══╝  ██╔══╝  ██╔══╝  ██╔══██║   ██║   ██╔══╝  ██║  ██║\n" +
            "\t\t\t\t\t██████╔╝███████╗██║     ███████╗██║  ██║   ██║   ███████╗██████╔╝\n" +
            "\t\t\t\t\t╚═════╝ ╚══════╝╚═╝     ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚═════╝\033[0m \n\n\n\n\n\n\n\n\n");
                System.out.println("\t\t\t\t\t1. Retry");
                System.out.println("\t\t\t\t\t2. Exit");
                System.out.print("\t\t\t\t\tEnter your choice: ");
                try{
                    retryChoice = scan.nextInt();

                    if (retryChoice == 1) {
                        // Restart the game
                        objClear.clearScreen();
                        System.out.println("Restarting the game...");
                        main(args); // Re-invoke main method to restart
                    } else if(retryChoice == 2){
                        System.out.println("Exiting the game...");
                        return; // Exit the game
                    } else{
                        objClear.clearScreen();
                        System.out.println("\t\t\t\tInvalid Choice. Try Again!");
                    }
                }catch(Exception e){
                    objClear.clearScreen();
                    System.out.println("\t\t\t\tError " + e);
                    scan.nextLine();
                }
            }   
            }
            
            
            objWallTwo.wallTwo(playerCharacter, objIn);

            if (playerCharacter.getDefeated()) {
                System.out.println("\n\n\n\n");
                System.out.println("\033[31m" + 
            "\t\t\t\t\t██████╗ ███████╗███████╗███████╗ █████╗ ████████╗███████╗██████╗\n" +
            "\t\t\t\t\t██╔══██╗██╔════╝██╔════╝██╔════╝██╔══██╗╚══██╔══╝██╔════╝██╔══██╗\n" +
            "\t\t\t\t\t██║  ██║█████╗  █████╗  █████╗  ███████║   ██║   █████╗  ██║  ██║\n" +
            "\t\t\t\t\t██║  ██║██╔══╝  ██╔══╝  ██╔══╝  ██╔══██║   ██║   ██╔══╝  ██║  ██║\n" +
            "\t\t\t\t\t██████╔╝███████╗██║     ███████╗██║  ██║   ██║   ███████╗██████╔╝\n" +
            "\t\t\t\t\t╚═════╝ ╚══════╝╚═╝     ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚═════╝\033[0m \n\n\n\n\n\n\n\n\n");
            audioManager.playAudio("C:\\Users\\Prince Tabanas\\Documents\\WALLS 1\\textBasedgame-master\\OST\\YOU DIED (HD).wav");
            
            while(true){ 
                System.out.println("\n\n\n\n");
                System.out.println("\033[31m" + 
            "\t\t\t\t\t██████╗ ███████╗███████╗███████╗ █████╗ ████████╗███████╗██████╗\n" +
            "\t\t\t\t\t██╔══██╗██╔════╝██╔════╝██╔════╝██╔══██╗╚══██╔══╝██╔════╝██╔══██╗\n" +
            "\t\t\t\t\t██║  ██║█████╗  █████╗  █████╗  ███████║   ██║   █████╗  ██║  ██║\n" +
            "\t\t\t\t\t██║  ██║██╔══╝  ██╔══╝  ██╔══╝  ██╔══██║   ██║   ██╔══╝  ██║  ██║\n" +
            "\t\t\t\t\t██████╔╝███████╗██║     ███████╗██║  ██║   ██║   ███████╗██████╔╝\n" +
            "\t\t\t\t\t╚═════╝ ╚══════╝╚═╝     ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚═════╝\033[0m \n\n\n\n\n\n\n\n\n");
                System.out.println("\t\t\t\t\t1. Retry");
                System.out.println("\t\t\t\t\t2. Exit");
                System.out.print("\t\t\t\t\tEnter your choice: ");
                try{
                    retryChoice = scan.nextInt();

                    if (retryChoice == 1) {
                        // Restart the game
                        objClear.clearScreen();
                        System.out.println("Restarting the game...");
                        main(args); // Re-invoke main method to restart
                    } else if(retryChoice == 2){
                        System.out.println("Exiting the game...");
                        return; // Exit the game
                    } else{
                        objClear.clearScreen();
                        System.out.println("\t\t\t\tInvalid Choice. Try Again!");
                    }
                }catch(Exception e){
                    objClear.clearScreen();
                    System.out.println("\t\t\t\tError " + e);
                    scan.nextLine();
                }
            }   
            }

            
            objWallThree.wallThree(playerCharacter, objIn);

            if (playerCharacter.getDefeated()) {
                System.out.println("\n\n\n\n");
                System.out.println("\033[31m" + 
            "\t\t\t\t\t██████╗ ███████╗███████╗███████╗ █████╗ ████████╗███████╗██████╗\n" +
            "\t\t\t\t\t██╔══██╗██╔════╝██╔════╝██╔════╝██╔══██╗╚══██╔══╝██╔════╝██╔══██╗\n" +
            "\t\t\t\t\t██║  ██║█████╗  █████╗  █████╗  ███████║   ██║   █████╗  ██║  ██║\n" +
            "\t\t\t\t\t██║  ██║██╔══╝  ██╔══╝  ██╔══╝  ██╔══██║   ██║   ██╔══╝  ██║  ██║\n" +
            "\t\t\t\t\t██████╔╝███████╗██║     ███████╗██║  ██║   ██║   ███████╗██████╔╝\n" +
            "\t\t\t\t\t╚═════╝ ╚══════╝╚═╝     ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚═════╝\033[0m \n\n\n\n\n\n\n\n\n");
            audioManager.playAudio("C:\\Users\\Prince Tabanas\\Documents\\WALLS 1\\textBasedgame-master\\OST\\YOU DIED (HD).wav");
            
            while(true){ 
                System.out.println("\n\n\n\n");
                System.out.println("\033[31m" + 
            "\t\t\t\t\t██████╗ ███████╗███████╗███████╗ █████╗ ████████╗███████╗██████╗\n" +
            "\t\t\t\t\t██╔══██╗██╔════╝██╔════╝██╔════╝██╔══██╗╚══██╔══╝██╔════╝██╔══██╗\n" +
            "\t\t\t\t\t██║  ██║█████╗  █████╗  █████╗  ███████║   ██║   █████╗  ██║  ██║\n" +
            "\t\t\t\t\t██║  ██║██╔══╝  ██╔══╝  ██╔══╝  ██╔══██║   ██║   ██╔══╝  ██║  ██║\n" +
            "\t\t\t\t\t██████╔╝███████╗██║     ███████╗██║  ██║   ██║   ███████╗██████╔╝\n" +
            "\t\t\t\t\t╚═════╝ ╚══════╝╚═╝     ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚══════╝╚═════╝\033[0m \n\n\n\n\n\n\n\n\n");
                System.out.println("\t\t\t\t\t1. Retry");
                System.out.println("\t\t\t\t\t2. Exit");
                System.out.print("\t\t\t\t\tEnter your choice: ");
                try{
                    retryChoice = scan.nextInt();

                    if (retryChoice == 1) {
                        // Restart the game
                        objClear.clearScreen();
                        System.out.println("Restarting the game...");
                        main(args); // Re-invoke main method to restart
                    } else if(retryChoice == 2){
                        System.out.println("Exiting the game...");
                        return; // Exit the game
                    } else{
                        objClear.clearScreen();
                        System.out.println("\t\t\t\tInvalid Choice. Try Again!");
                    }
                }catch(Exception e){
                    objClear.clearScreen();
                    System.out.println("\t\t\t\tError " + e);
                    scan.nextLine();
                }
            }   
            }
            
            playerCharacter.ending();
            

        System.out.println("\t\t\t\t\t████████╗██╗  ██╗███████╗    ███████╗███╗   ██╗██████╗ ");
        System.out.println("\t\t\t\t\t╚══██╔══╝██║  ██║██╔════╝    ██╔════╝████╗  ██║██╔══██╗");
        System.out.println("\t\t\t\t\t   ██║   ███████║█████╗      █████╗  ██╔██╗ ██║██║  ██║");
        System.out.println("\t\t\t\t\t   ██║   ██╔══██║██╔══╝      ██╔══╝  ██║╚██╗██║██║  ██║");
        System.out.println("\t\t\t\t\t   ██║   ██║  ██║███████╗    ███████╗██║ ╚████║██████╔╝");
        System.out.println("\t\t\t\t\t   ╚═╝   ╚═╝  ╚═╝╚══════╝    ╚══════╝╚═╝  ╚═══╝╚═════╝ ");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        audioManager.playAudio("C:\\Users\\Prince Tabanas\\Documents\\WALLS 1\\textBasedgame-master\\OST\\Dark Souls_ Chiptune Demixes - Daughters of Chaos.wav");


            
            while(true){ 
        System.out.println("\t\t\t\t\t████████╗██╗  ██╗███████╗    ███████╗███╗   ██╗██████╗ ");
        System.out.println("\t\t\t\t\t╚══██╔══╝██║  ██║██╔════╝    ██╔════╝████╗  ██║██╔══██╗");
        System.out.println("\t\t\t\t\t   ██║   ███████║█████╗      █████╗  ██╔██╗ ██║██║  ██║");
        System.out.println("\t\t\t\t\t   ██║   ██╔══██║██╔══╝      ██╔══╝  ██║╚██╗██║██║  ██║");
        System.out.println("\t\t\t\t\t   ██║   ██║  ██║███████╗    ███████╗██║ ╚████║██████╔╝");
        System.out.println("\t\t\t\t\t   ╚═╝   ╚═╝  ╚═╝╚══════╝    ╚══════╝╚═╝  ╚═══╝╚═════╝ ");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("\t\t\t\t\t1. Retry");
                System.out.println("\t\t\t\t\t2. Exit");
                System.out.print("\t\t\t\t\tEnter your choice: ");
                try{
                    retryChoice = scan.nextInt();

                    if (retryChoice == 1) {
                        // Restart the game
                        objClear.clearScreen();
                        System.out.println("Restarting the game...");
                        main(args); // Re-invoke main method to restart
                    } else if(retryChoice == 2){
                        System.out.println("\t\t\t\tExiting the game...");
                        return; // Exit the game
                    } else{
                        objClear.clearScreen();
                        System.out.println("\t\t\t\t\tInvalid Choice. Try Again!");
                        System.out.println("");
                    }
                }catch(Exception e){
                    objClear.clearScreen();
                    System.out.println("Error " + e);
                    scan.nextLine();
                }
            }   

        } catch (Exception e) {
            System.out.println("Error playing audio: " + e.getMessage());
        } finally {
            scan.close();
        }
    }
}
