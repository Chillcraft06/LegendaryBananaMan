/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lbm.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
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
    private int animIndex = 0;
    private Vector2 movement;

    public Player(Vector2 pos) {
        setPlayerPosition(pos);
        movement = new Vector2(0, 0);

        initAnims();
    }

    //private Weapon currentWeapon;
    private Animation<TextureRegion> idleAnim;
    private Texture idleAnimSheet;
    //private Sprite[] moveAnim;
    //private Sprite[] throwAnim;
    private float stateTime = 0;

    public Vector2 getMovement() {
        return movement;
    }

    public void setMovement(Vector2 movement) {
        this.movement = movement;
    }

    public static Vector2 getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(Vector2 playerPosition) {
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

    public void setAnimIndex(int index) {
        animIndex = index;
    }

    private void initAnims() {
        idleAnimSheet = new Texture(Gdx.files.internal("bananaManIdle.png"));

        TextureRegion[][] tmp = TextureRegion.split(idleAnimSheet,
                idleAnimSheet.getWidth() / 3,
                idleAnimSheet.getHeight() / 1);
        TextureRegion[] idleFrames = new TextureRegion[3 * 1];
        int index = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 3; j++) {
                idleFrames[index++] = tmp[i][j];
            }
        }
        idleAnim = new Animation<TextureRegion>(0.5f, idleFrames);
    }

    public void playAnim(LBM game) {
        stateTime += Gdx.graphics.getDeltaTime();
        TextureRegion currentFrame = idleAnim.getKeyFrame(stateTime, true);
        game.batch.draw(currentFrame, playerPosition.x, playerPosition.y, 1, 1);
    }
}
