
package com.lbm.game;

public class TempHealth extends PowerUp {
    
    // attribute 
    
    private int tempHealthAmt; 
    private int addHp; 
    
    
   //Mutators/ accessors 
    
    
    public int getTempHealthAmt() {
        return tempHealthAmt;
    }

    public int getAddHp() {
        return addHp;
    }

    public void setTempHealthAmt(int tempHealthAmt) {
        this.tempHealthAmt = tempHealthAmt;
    }

    public void setAddHp(int addHp) {
        this.addHp = addHp;
    }
    
    
    // Behaviours 
    
    
    
    // constructor 
    public TempHealth() { 
        this.tempHealthAmt = 0; 
        this.addHp = 0; 
    }
    public TempHealth(int tempHealthAmt, int addHp) {
        this.tempHealthAmt = tempHealthAmt;
        this.addHp = addHp;
    }
}
