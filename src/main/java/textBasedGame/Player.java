package textBasedGame;

/**
 *
 * @author User
 */
public abstract class Player {
    CenterAlign objPrint = new CenterAlign();

    private String Name;
    private int Health;
    private int Mana;
    private int MaxHealth;
    private int MaxMana;
    private int MaxExp;
    private int ExpLevel = 1;
    private int Exp = 0;
    public boolean Defeated = false;
    
    public Player(String Name, int MaxHealth, int MaxMana, int MaxExp){
        this.Name = Name;
        this.MaxHealth = MaxHealth;
        this.Health = MaxHealth;
        this.MaxMana = MaxMana;
        this.Mana = MaxMana;
        this.MaxExp = MaxExp;
    }

    
    public abstract int skillOne();
    public abstract int skillTwo();
    public abstract int skillThree();
    public abstract int oneHitDelete();
    
    public abstract void intro();
    
    public abstract void ending();
    
    public abstract String skillOneName();
    public abstract String skillTwoName();
    public abstract String skillThreeName();

    public boolean useMana(int amount){
        if(Mana >= amount){
            Mana -= amount;
            return true;
        }
        else{
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\u001B[31m\t\tNot enough mana!\u001B[0m");
            return false;
        }
    }
    
    public void addMana(){
        Mana += 15;
        
        if(Mana > MaxMana){
            Mana = MaxMana;
        }
    }

    public void takeDamage(int damage){
        Health -= damage;
        
        if(Health < 0)
            Health = 0;
    }
    
    public void setHeal(int heal){
        Health += heal;
        
        if(Health > MaxHealth){
            Health = MaxHealth;
        }
    }
    
    public void setMana(int manaRegen){
        Mana += manaRegen;
        
        if(Mana > MaxMana){
            Mana = MaxMana;
        }
    }
    
    public void setDefeated(boolean Defeated){
        this.Defeated = Defeated;
    }
    
    public boolean getDefeated(){
        return Defeated;
    }

    public int getHealth(){
        return Health;
    }
    
    public int getMana(){
        return Mana;
    }
    
    public String getName(){
        return Name;
    }
    
    public void addExp(int addExp){
        Exp += addExp;
        
        if(Exp >= MaxExp){
            Exp = 0;
            LevelUp();
        }
    }
    
    public void LevelUp(){
        ExpLevel++;
        MaxHealth += 25;
        MaxMana += 25;
        MaxExp += 25;
        
        System.out.println();
        objPrint.printCentered("\u001B[32m -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        objPrint.printCentered("You leveled up to " + ExpLevel + "!");
        objPrint.printCentered(" -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n\u001B[0m");
        System.out.println();

    }

    public int getMaxHealth(){
        return MaxHealth;
    }

    public int getMaxMana(){
        return MaxMana;
    }

    

    
    public String toString(){
        
        return Name + " (Level "+ExpLevel+")\n" +
        
               "\nHealth: " + generateBar(Health, MaxHealth, 20, "RED") + " (" + Health + "/" + MaxHealth + ")\n" +
               "\nMana:   " + generateBar(Mana, MaxMana, 20, "BLUE") + " (" + Mana + "/" + MaxMana + ")\n" +
               "\nXP:     " + generateBar(Exp, MaxExp, 20, "YELLOW") + " (" + Exp + "/" + MaxExp + ")\n";
               
    }
    
    
    private String generateBar(int currentValue, int maxValue, int barLength, String color) {
        // Calculate the filled portion of the bar
        int filledLength = (int) ((double) currentValue / maxValue * barLength);
        StringBuilder bar = new StringBuilder("[");
    
        // ANSI color codes for the bar
        String colorCode;
        switch (color.toUpperCase()) {
            case "RED":
                colorCode = "\u001B[31m"; 
                break;
            case "BLUE":
                colorCode = "\u001B[34m"; 
                break;
            case "YELLOW":
                colorCode = "\u001B[33m"; 
                break;
            default:
                colorCode = "\u001B[0m"; 
        }
    
        
        for (int i = 0; i < filledLength; i++) {
            bar.append(colorCode).append("■").append("\u001B[0m"); 
        }
    
        
        for (int i = filledLength; i < barLength; i++) {
            bar.append(" "); 
        }
    
        bar.append("]");
        return bar.toString();
    }
}
