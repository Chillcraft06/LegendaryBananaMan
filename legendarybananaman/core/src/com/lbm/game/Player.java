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
    private float playerSpeed = 2;
    private float playerAttack = 2;
    private int animIndex = 0;
    public boolean isFlipped;

    public Player(Vector2 pos) {
        playerPosition = pos;
        isFlipped = false;

        initAnims();
    }

    private Weapon currentWeapon;
    private Animation<TextureRegion> idleAnim;
    private Texture idleAnimSheet;
    //private Sprite[] moveAnim;
    private Animation<TextureRegion> throwAnim;
    private Texture throwAnimSheet;
    private float idleStateTime = 0;
    private float throwStateTime = 0;

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
        // idle
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

        // throw
        throwAnimSheet = new Texture(Gdx.files.internal("bmthrow.png"));

        TextureRegion[][] tmpThr = TextureRegion.split(throwAnimSheet,
                throwAnimSheet.getWidth() / 14,
                throwAnimSheet.getHeight() / 1);
        TextureRegion[] throwFrames = new TextureRegion[14 * 1];
        index = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 14; j++) {
                throwFrames[index++] = tmpThr[i][j];
            }
        }
        throwAnim = new Animation<TextureRegion>(0.1f, throwFrames);
    }

    public void playAnim(LBM game) {
        
        if (animIndex == 0) {
            idleStateTime += Gdx.graphics.getDeltaTime();
            TextureRegion currentFrame = idleAnim.getKeyFrame(idleStateTime, true);
            if (!isFlipped) {
                game.batch.draw(currentFrame, playerPosition.x, playerPosition.y, 0.5f, 0, 1, 1, 1, 1, 0);
            } else {
                game.batch.draw(currentFrame, playerPosition.x, playerPosition.y, 0.5f, 0, 1, 1, -1, 1, 0);
            }
        } else if (animIndex == 1) {
            throwStateTime += Gdx.graphics.getDeltaTime();
            TextureRegion currentFrame = throwAnim.getKeyFrame(throwStateTime, true);
            if (!isFlipped) {
                game.batch.draw(currentFrame, playerPosition.x, playerPosition.y, 0.5f, 0, 1, 1, 1, 1, 0);
            } else {
                game.batch.draw(currentFrame, playerPosition.x, playerPosition.y, 0.5f, 0, 1, 1, -1, 1, 0);
            }
            if (throwAnim.isAnimationFinished(throwStateTime))
            {
                animIndex = 0;
                throwStateTime = 0;
            }
        }
    }
}
