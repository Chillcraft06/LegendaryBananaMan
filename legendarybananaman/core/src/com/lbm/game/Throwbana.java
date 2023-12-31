/** 
 * Sub Class of Weapon; Throwbana
 * Dec 19th 
 * 
 */
package com.lbm.game;


public class Throwbana extends Weapon {
    //attributes 
    private int range = 15; 
    
    // constructor 
    public Throwbana() { 
        super(); 
        this.range = 15;
    }
    public Throwbana(int range) { 
        this(); 
        this.range = range; 
    }

    // mutator/accessor 
    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
    
    // behaviours add here later 
    
}
