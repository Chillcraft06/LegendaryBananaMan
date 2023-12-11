/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lbm.game;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;

/**
 *
 * @author jochi2827
 */
public class MainMenuScreen implements Screen {

    final LBM game;

    OrthographicCamera camera;

    public MainMenuScreen(final LBM game) {
        this.game = game;

        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
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
        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        
        game.batch.end();
    }

    public void show() {

    }
}
