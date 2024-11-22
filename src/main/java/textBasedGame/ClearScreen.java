package textBasedGame;

public class ClearScreen {
    public void clearScreen() {
        // ANSI escape code for clearing the terminal screen
        System.out.print("\u001B[H\u001B[2J");
        System.out.flush();
    }
}
