/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lbm.game;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.BodyDef.BodyType;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import static com.lbm.game.GameScreen.world;

/**
 *
 * @author jochi2827
 */
abstract public class Enemy {
    // Variables
    
    private Sprite enemySprite;
    private Body enemyBody;
    // apply sprites to kinematic bodies eventually!!
    private Sprite projSprite;
    private Vector2 enemyPosition;
    private float enemySpeed = 1;
    private float projSpeed = 1.5f;
    private float hp = 10;
    private int attack = 5;
    
    // Constructors
    
    public Enemy(Vector2 enemyPosition, float enemySpeed, float hp) {
        this.enemyPosition = enemyPosition;
        this.enemySpeed = enemySpeed;
        this.hp = hp;
    }

    public Enemy(Sprite enemySprite, Vector2 enemyPosition, float enemySpeed, float hp, int attack) {
        this.enemySprite = enemySprite;
        this.enemyPosition = enemyPosition;
        this.enemySpeed = enemySpeed;
        this.hp = hp;
        this.attack = attack;
    }

    public Enemy(Sprite enemySprite, Sprite projSprite, Vector2 enemyPosition, float enemySpeed, float hp, int attack) {
        this.enemySprite = enemySprite;
        this.projSprite = projSprite;
        this.enemyPosition = enemyPosition;
        this.enemySpeed = enemySpeed;
        this.hp = hp;
        this.attack = attack;
    }

    public Enemy(Vector2 enemyPosition) {
        this.enemyPosition = enemyPosition;
    }
    
    // Getters, Setters
    
    public void setPosition(Vector2 pos)
    {
        enemyPosition = pos;
    }
    
    public Vector2 getPosition()
    {
        return enemyPosition;
    }
    
    public void setSprite(Sprite sprite)
    {
        enemySprite = sprite;
    }
    
    public Sprite getSprite()
    {
        return enemySprite;
    }

    public float getEnemySpeed() {
        return enemySpeed;
    }

    public void setEnemySpeed(float enemySpeed) {
        this.enemySpeed = enemySpeed;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public Sprite getEnemySprite() {
        return enemySprite;
    }

    public void setEnemySprite(Sprite enemySprite) {
        this.enemySprite = enemySprite;
    }

    public Vector2 getEnemyPosition() {
        return enemyPosition;
    }

    public void setEnemyPosition(Vector2 enemyPosition) {
        this.enemyPosition = enemyPosition;
    }

    public float getProjSpeed() {
        return projSpeed;
    }

    public void setProjSpeed(float projSpeed) {
        this.projSpeed = projSpeed;
    }

    public Body getEnemyBody() {
        return enemyBody;
    }

    public void setEnemyBody(Body enemyBody) {
        this.enemyBody = enemyBody;
    }
    
    
    
    // Behavior
    
    /**
     * Default behavior, move towards player
     */
    public void step()
    {
        if (enemyPosition.x > Player.playerPosition.x) enemyPosition.x -= enemySpeed;
        else enemyPosition.x += enemySpeed;
        if (enemyPosition.y > Player.playerPosition.y) enemyPosition.y -= enemySpeed;
        else enemyPosition.y += enemySpeed;
    }
    
    /**
     * Default behavior, throw projectile towards player
     */
    public void attack()
    {
        BodyDef bodyDef = new BodyDef();
        bodyDef.type = BodyType.KinematicBody;
        bodyDef.position.set(enemyPosition.x, enemyPosition.y);
        Body proj = world.createBody(bodyDef);
        
        CircleShape circle = new CircleShape();
        circle.setRadius(1f);
        
        FixtureDef fixtureDef = new FixtureDef();
        fixtureDef.shape = circle;
        
        Fixture fixture = proj.createFixture(fixtureDef);
        
        circle.dispose();
        
        // set projectile to go towards player
        // proj.setLinearVelocity( /*player direction*/);
    }
}
