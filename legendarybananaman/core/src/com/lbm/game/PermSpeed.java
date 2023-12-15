
package com.lbm.game;

public class PermSpeed extends PowerUp {
    
    
    // attribute 
    private int tempSpeedIncr; 
    private double incrAmt = 0.25; 
    
     //Mutators/ accessors
    public int getTempSpeedIncr() { 
        return tempSpeedIncr;
    }
    public double getIncrAmt() { 
        return incrAmt;
    }

    public void setTempSpeedIncr(int tempSpeedIncr) {
        this.tempSpeedIncr = tempSpeedIncr;
    }

    public void setIncrAmt(double incrAmt) {
        this.incrAmt = incrAmt;
    }
    

    // Behaviours
    
    
    // constructor
    public PermSpeed() {
        this.tempSpeedIncr = 0;
        this.incrAmt = 0; 
    }
    public PermSpeed(int tempSpeedIncr, double incrAmt) {
        this.tempSpeedIncr = tempSpeedIncr;
        this.incrAmt = incrAmt; 
    }
    
}
