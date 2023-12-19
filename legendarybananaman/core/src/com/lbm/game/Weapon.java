
package com.lbm.game;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;


abstract public class Weapon {
    //attributes 
    protected int damage; 
    protected float radius; 
    protected Vector2 pos;
    protected Sprite weaponSprite;

    // constructor 
    public Weapon() { 
        this.damage = 0; 
        this.radius = 0; 
        pos = new Vector2(0, 0);
    }
    public Weapon(int damage, int radius, int yPos, int xPos) {
        this.damage = damage;
        this.radius = radius;
        pos = new Vector2(yPos, xPos);
    }
// mutator/accessor 
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public void setPosition(Vector2 pos)
    {
        this.pos = pos;
    }
    
    public Vector2 getPosition()
    {
        return pos;
    }
    
    //behaviours - add here later if needed 
    
}
