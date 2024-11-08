/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textBasedGame;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class openShop {
    Inventory objIn;
    
    public openShop(Inventory objIn){
        this.objIn = objIn;
    }
    
   
    public void Shop(Scanner scanner) {
        System.out.println("-------------------------------------------");
        System.out.println("After a fierce battle, you are now taking a break in the shop.");
        System.out.println("-------------------------------------------");
        System.out.println();
        System.out.println("        ==========================");
        System.out.println("        ||  You have " + objIn.getGold() + " gold.  ||");
        System.out.println("        ==========================\n\n");
        System.out.println("Items available for purchase:");
        System.out.println("1. Healing Potion (Restores 50 HP) - 100 Gold");
        System.out.println("2. Mana Potion (Restores 50 Mana) - 100 Gold");

        while (true) {
            try {
                System.out.print("Enter the number of the item you'd like to buy (or 0 to exit): ");
                int itemChoice = scanner.nextInt();

                if (itemChoice == 1 && objIn.getGold() >= 100) {
                    objIn.useGold(100);
                    System.out.println();
                    System.out.println("        You bought a Healing Potion!");
                    System.out.print("        ~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
                    objIn.IncItemOneCount();

                    System.out.println("        ==========================");
                    System.out.println("        || Gold Remaining: " + objIn.getGold()  +"||");
                    System.out.println("        ==========================\n\n");


                } else if (itemChoice == 2 && objIn.getGold() >= 100) {
                    objIn.useGold(100);
                    System.out.println();
                    System.out.println("        You bought a Mana Potion!");
                    System.out.print("        ~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
                    objIn.IncItemTwoCount();

                    System.out.println("        ==========================");
                    System.out.println("        || Gold Remaining: " + objIn.getGold()+"||");
                    System.out.println("        ==========================\n\n");

                } else if (itemChoice == 0) {
                    System.out.println("You have exited the shop.\n\n");
                    break;  
                } else {
                    System.out.println("\n\nInvalid choice or not enough coins! Try again.");
                    System.out.println("Gold Remaining: " + objIn.getGold()+"\n");
                }
            } catch (Exception e) {
                System.out.println("\n\nInvalid input! Please enter a valid number.\n\n");
                scanner.nextLine();  
            }
        }

    }
}




