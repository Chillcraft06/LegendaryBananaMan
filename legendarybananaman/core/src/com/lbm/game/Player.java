/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lbm.game;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

/**
 *
 * @author jochi2827
 */
public class Player {
    static public Vector2 playerPosition;
    private float playerHealth = 100;
    private float playerSpeed = 1;
    private float playerAttack = 2;
    
    public Player(Vector2 pos)
    {
        setPlayerPosition(pos);
    }
    
    //private Weapon currentWeapon;
    
    private Sprite[] idleAnim;
    private Sprite[] moveAnim;
    private Sprite[] throwAnim;

    public static Vector2 getPlayerPosition() {
        return playerPosition;
    }

    public static void setPlayerPosition(Vector2 playerPosition) {
        Player.playerPosition = playerPosition;
    }

    public float getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(float playerHealth) {
        this.playerHealth = playerHealth;
    }

    public float getPlayerSpeed() {
        return playerSpeed;
    }

    public void setPlayerSpeed(float playerSpeed) {
        this.playerSpeed = playerSpeed;
    }

    public float getPlayerAttack() {
        return playerAttack;
    }

    public void setPlayerAttack(float playerAttack) {
        this.playerAttack = playerAttack;
    }
    
}
