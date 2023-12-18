
package com.lbm.game;

import com.badlogic.gdx.graphics.g2d.Sprite;


abstract public class PowerUp {
    // attribute 
   private float spawnChance;
   private String name; 
   private Sprite powerup; 
   
 //Mutators/ accessors
    public float getSpawnChance() {
        return spawnChance;
    }

    public String getName() {
        return name;
    }

 
    public Sprite getPowerup() {
        return powerup;
    }

    public void setSpawnChance(float spawnChance) {
        this.spawnChance = spawnChance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPowerup(Sprite powerup) {
        this.powerup = powerup;
    }

    // Contructor 
    public PowerUp() { 
        this.spawnChance = 0;
        this.name = "powerup";
        this.powerup = powerup;
    }
    public PowerUp(float spawnChance, String name, Sprite powerup) {
        this.spawnChance = spawnChance;
        this.name = name;
        this.powerup = powerup;
    }
    
    //Behaviour 
}
