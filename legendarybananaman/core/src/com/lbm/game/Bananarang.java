/** 
 * Sub Class of Weapon; Bananarang
 * Dec 19th 
 * 
 */
package com.lbm.game;


public class Bananarang extends Weapon {
    //attribute 
 private int comeBackDuration; 
 
    // constructor 
    public Bananarang() { 
        super();
        this.comeBackDuration = 5; 
    }
    public Bananarang(int comeBackDuration) { 
        this(); 
        this.comeBackDuration = comeBackDuration; 
    }

    //mutators/accessors 
    public int getComeBackDuration() {
        return comeBackDuration;
    }

    public void setComeBackDuration(int comeBackDuration) {
        this.comeBackDuration = comeBackDuration;
    }
    
    // behaviour here - 
}
