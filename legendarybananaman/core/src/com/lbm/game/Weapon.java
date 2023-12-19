/** 
 * Abstract weapon class  
 * Dec 19th 
 * 
 */
package com.lbm.game;


abstract public class Weapon {
    //attributes 
   private int damage; 
    private int radius; 
    private int xPos, yPos; 

    // constructor 
    public Weapon() { 
        this.damage = 0; 
        this.radius = 0; 
        this.xPos = 0; 
        this.yPos = 0; 
    }
    public Weapon(int damage, int radius, int yPos, int xPos) {
        this.damage = damage;
        this.radius = radius;
        this.yPos = yPos;
        this.xPos = xPos; 
    }
// mutator/accessor 
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
    
    //behaviours - add here later if needed 
    
}
