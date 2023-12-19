/** 
 * Sub Class of Powerup; TempDamage
 * Dec 19th 
 * 
 */
package com.lbm.game;


public class TempDamage extends PowerUp {
    
    // attribute 
    private float duration; 
    private int dmgBoost;

    public float getDuration() {
        return duration;
    }

    public int getDmgBoost() {
        return dmgBoost;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public void setDmgBoost(int dmgBoost) {
        this.dmgBoost = dmgBoost;
    }
    
    // constructor 
    
    //Mutators/ accessors 
    
    // Behaviours 

    public TempDamage() { 
        super();
        this.duration = 0;
        this.dmgBoost = 0;
    }
    public TempDamage(float duration, int dmgBoost) {
        this();
        this.duration = duration;
        this.dmgBoost = dmgBoost;
    }
    
}
