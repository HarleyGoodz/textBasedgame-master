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

    private Inventory objIn;
    
    
        public openShop(Inventory objIn){
            this.objIn = objIn;
    }
    int buyCount = 0;

    CenterAlign objPrint = new CenterAlign();
    ClearScreen objClear = new ClearScreen();
    
   
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
                    objClear.clearScreen();
                    System.out.println("-------------------------------------------");
                    buyCount++;
                    System.out.println("\t\tBUY COUNT: "+buyCount+"");
                    System.out.println("-------------------------------------------");
                    System.out.println();
    
                    System.out.println("Items available for purchase:");
                    System.out.println("1. Healing Potion (Restores 50 HP) - 100 Gold");
                    System.out.println("2. Mana Potion (Restores 50 Mana) - 100 Gold");
                    System.out.println();
                    System.out.println("\u001B[33m        You bought a Healing Potion!");;
                    System.out.print("        ~~~~~~~~~~~~~~~~~~~~~~~~~~~\u001B[0m \n\n");
                    objIn.IncItemOneCount();

                    System.out.println("        ==========================");
                    System.out.println("        || Gold Remaining: " + objIn.getGold()  +"||");
                    System.out.println("        ==========================\n\n");


                } else if (itemChoice == 2 && objIn.getGold() >= 100) {
                    objIn.useGold(100);
                    
                    objClear.clearScreen();
                    System.out.println("-------------------------------------------");
                    buyCount++;
                    System.out.println("\t\tBUY COUNT: "+buyCount+"");
                    System.out.println("-------------------------------------------");
                    System.out.println();
                    
                    System.out.println("Items available for purchase:");
                    System.out.println("1. Healing Potion (Restores 50 HP) - 100 Gold");
                    System.out.println("2. Mana Potion (Restores 50 Mana) - 100 Gold");
                    System.out.println();
                    System.out.println("\u001B[34m        You bought a Mana Potion!\u001B[0m");
                    System.out.print("\u001B[34m        ~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n\u001B[0m");
                    objIn.IncItemTwoCount();

                    System.out.println("        ==========================");
                    System.out.println("        || Gold Remaining: " + objIn.getGold()+"||");
                    System.out.println("        ==========================\n\n");

                } else if (itemChoice == 0) {
                    objClear.clearScreen();
                    System.out.println("-------------------------------------------");
                    
                    System.out.println("\t\tBUY COUNT: "+buyCount+"");
                    System.out.println("-------------------------------------------");
                    System.out.println();
    
                    System.out.println("Items available for purchase:");
                    System.out.println("1. Healing Potion (Restores 50 HP) - 100 Gold");
                    System.out.println("2. Mana Potion (Restores 50 Mana) - 100 Gold");
                    System.out.println();
                    
                    objClear.clearScreen();
                    System.out.println("\u001B[31m\tYou have exited the shop.\n\n\u001B[0m");
                    buyCount = 0;
                    break;  
                } else {
                    objClear.clearScreen();
                    System.out.println("-------------------------------------------");
                    
                    System.out.println("\t\tBUY COUNT: "+buyCount+"");
                    System.out.println("-------------------------------------------");
                    System.out.println();
    
                    System.out.println("Items available for purchase:");
                    System.out.println("1. Healing Potion (Restores 50 HP) - 100 Gold");
                    System.out.println("2. Mana Potion (Restores 50 Mana) - 100 Gold");
                    System.out.println();

                    System.out.println("        ==========================");
                    System.out.println("        || Gold Remaining: " + objIn.getGold()+"||");
                    System.out.println("        ==========================\n\n");

                    System.out.println("\u001B[31m\n\nInvalid choice or not enough coins! Try again.\n\n \u001B[0m");
                   
                }
            } catch (Exception e) {
                objClear.clearScreen();
                    System.out.println("-------------------------------------------");
                    
                    System.out.println("\t\tBUY COUNT: "+buyCount+"");
                    System.out.println("-------------------------------------------");
                    System.out.println();
    
                    System.out.println("Items available for purchase:");
                    System.out.println("1. Healing Potion (Restores 50 HP) - 100 Gold");
                    System.out.println("2. Mana Potion (Restores 50 Mana) - 100 Gold");
                    System.out.println();

                    System.out.println("        ==========================");
                    System.out.println("        || Gold Remaining: " + objIn.getGold()+"||");
                    System.out.println("        ==========================\n\n");

                System.out.println("\u001B[31m \n\nInvalid input! Please enter a valid number.\u001B[0m \n\n");
                scanner.nextLine();  
            }
        }

    }
}




