
package com.lbm.game;


public class Coldbana extends Weapon {
    //attributes 
    private int duration = 5; 
    
    //constructors 
    public Coldbana() { 
        super();
        this.duration = 5; 
    }
    public Coldbana(int duration) { 
        this(); 
        this.duration = duration; 
    }
//mutators and accesssor 
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    //behavoirs add here - 
    
}
