/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textBasedGame;

/**
 *
 * @author User
 */
public abstract class Enemy {
    private int Health;
    private String Name;
    
    public abstract int skillOne();
    public abstract int skillTwo();
    public abstract int skillThree();
    
    public abstract void takeDamage(int damage);

    public abstract int getHealth();
    
    public abstract String getName();

    public abstract String toString();
}
    
    

