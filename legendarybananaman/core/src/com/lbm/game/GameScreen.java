/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lbm.game;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.ScreenUtils;

/**
 *
 * @author jochi2827
 */
public class GameScreen implements Screen {
    final LBM game;

    public static World world = new World(new Vector2(0, 0), true);
    
    OrthographicCamera camera;
    
    Sprite[] buttonSprites;
    Sprite background, title;

    public GameScreen(final LBM game) {
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 16, 9);
    }

    public void dispose() {

    }

    public void hide() {

    }

    public void resume() {

    }

    public void pause() {

    }
    
    public void resize(int x, int y) {
        
    }

    public void render(float delta) {
        ScreenUtils.clear(1, 0, 0f, 1);
        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();

        game.batch.end();

        world.step(1/60f, 6, 2);
    }

    public void show() {

    }
}
