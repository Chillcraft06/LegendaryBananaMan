/** 
 * Sub Class of Weapon; Boombana 
 * Dec 19th 
 * 
 */
package com.lbm.game;


public class Boombana extends Weapon {
    //attribute
   private int fireDuration; 
    private int enemyDrain = 1; 

    //constructor 
    public Boombana() { 
        super(); 
        this.fireDuration = 0; 
        this.enemyDrain = 0; 
    }
    public Boombana(int fireDuration, int enemyDrain) {
        this(); 
        this.fireDuration = fireDuration;
        this.enemyDrain = enemyDrain; 
    }

    //mutator/accessor 
    public int getFireDuration() {
        return fireDuration;
    }

    public void setFireDuration(int fireDuration) {
        this.fireDuration = fireDuration;
    }

    public int getEnemyDrain() {
        return enemyDrain;
    }

    public void setEnemyDrain(int enemyDrain) {
        this.enemyDrain = enemyDrain;
    }
    
    //behaviour here- 
}
