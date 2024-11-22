package textBasedGame;

public class CenterAlign {
    private final int TERMINAL_WIDTH = 130;

    // Method to center-align text using ANSI escape codes
    public void printCentered(String text) {
        int padding = (TERMINAL_WIDTH - text.length()) / 2;
        StringBuilder sb = new StringBuilder();
        
        // Add padding to the left of the text for center alignment
        for (int i = 0; i < padding; i++) {
            sb.append(" ");
        }
        sb.append(text);
        
        // Print the centered text
        System.out.println(sb.toString());
    }
}
