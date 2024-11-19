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
    private int ItemOneCount = 1;
    private int ItemTwoCount = 1;
    private int BossDropOneCount = 0;
    private int gold;
    
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
    
    public int useItemOne(){
        ItemOneCount--;
        return 50; 
    }
    
    public int useItemTwo(){
        ItemTwoCount--;
        return 50;
    }
}
