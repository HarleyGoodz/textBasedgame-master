/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textBasedGame;

/**
 *
 * @author User
 */
public abstract class Player {
    
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
            System.out.println("Not enough mana!");
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
            
        System.out.println("You leveled up to " + ExpLevel + "!");
        
    }
    
    public String toString(){
        return Name + "'s Health: " + Health + "/" + MaxHealth + " | " + "Mana: " + Mana + "/" + MaxMana + " | " + " XP: " + Exp + "/" + MaxExp;
    }
      
}
    
