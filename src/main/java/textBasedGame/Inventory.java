/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textBasedGame;

/**
 *
 * @author Silent Voice
 */
public class Inventory {
    private String ItemOne = "Healing Potion";
    private String ItemTwo = "Mana Potion";
    private String BossDropOne = "Sanguine Shackle";
    private String BossDropTwo = "Ravenbane Talisman";
    private int ItemOneCount = 1;
    private int ItemTwoCount = 1;
    private int BossDropOneCount = 0;
    private int BossDropTwoCount = 0;
    private int gold;
    private double multiplier;
    
    public void setGold(int gold){
        this.gold += gold;
    }
    
    public void useGold(int gold){
        this.gold -= gold;
    }
    
    public int getGold(){
        return gold;
    }
    
    public void IncItemOneCount(){
        ItemOneCount++;
    }
    
    public int getItemOneCount(){
        return ItemOneCount;
    }
    
    public int getItemTwoCount(){
        return ItemTwoCount;
    }
    
    public void IncItemTwoCount(){
        ItemTwoCount++;
    }
    
    public String getBossDropOne(){
        return BossDropOne;
    }
    
    public void IncBossDropOneCount(){
        BossDropOneCount++;
    }
    
    public boolean getBossDropOneCount(){
        if(BossDropOneCount == 1){
            return true;
        }
        return false;
    }
    
    public String getBossDropTwo(){
        return BossDropTwo;
    }
    
    public void IncBossDropTwoCount(){
        BossDropTwoCount++;
    }
    
    public boolean getBossDropTwoCount(){
        if(BossDropTwoCount == 1){
            return true;
        }
        return false;
    }
    
    public int BossDropTwoEffect(int damage){
        multiplier = (double) (Math.random() * (2.0 - 1.8 + 1)) + 1.8;
        
        double MultipliedDamage = damage * multiplier;
        
        return (int) Math.ceil(MultipliedDamage);
    }
    
    public double getMultiplier(){
        return multiplier;
    }

    public int useItemOne(){
        ItemOneCount--;
        return 50; 
    }
    
    public int useItemTwo(){
        ItemTwoCount--;
        return 50;
    }
}
