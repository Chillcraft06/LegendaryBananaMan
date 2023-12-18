/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lbm.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.utils.ScreenUtils;

/**
 *
 * @author jochi2827
 */
public class MainMenuScreen implements Screen {

    final LBM game;

    OrthographicCamera camera;
    
    Sprite[] buttonSprites;
    Sprite background, title;

    public MainMenuScreen(final LBM game) {
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 16, 9);
        buttonSprites = new Sprite[4];
        buttonSprites[0] = new Sprite(new Texture(Gdx.files.internal("buttons.png")), 0, 0, 16, 16);
        buttonSprites[0].setPosition(10, 10);
        
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
        buttonSprites[0].draw(game.batch);
        game.batch.end();
    }

    public void show() {

    }
}
