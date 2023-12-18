/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lbm.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.ScreenUtils;
import java.util.ArrayList;

/**
 *
 * @author jochi2827
 */
public class GameScreen implements Screen, InputProcessor {

    final LBM game;

    public static World world = new World(new Vector2(0, 0), true);
    ArrayList<Enemy> enemies = new ArrayList();

    OrthographicCamera camera;

    Sprite[] buttonSprites;
    Sprite background, title;

    Player bm;

    public GameScreen(final LBM game) {
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 16, 9);

        bm = new Player(new Vector2(16 / 2, 9 / 2));
        Gdx.input.setInputProcessor(this);
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
        bm.setPlayerPosition(new Vector2(Player.getPlayerPosition().x + bm.getMovement().x, Player.getPlayerPosition().y + bm.getMovement().y));
        bm.playAnim(game);
        game.batch.end();

        world.step(1 / 60f, 6, 2);
    }

    public void show() {

    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    Vector3 tp = new Vector3();

    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean keyDown(int keycode) {
        switch (keycode)
        {
            case Keys.A:
                bm.setMovement(new Vector2(-1 * bm.getPlayerSpeed(), bm.getMovement().y));
                break;
        }
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean scrolled(float x, float y) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchCancelled(int i, int i1, int i2, int i3) {
        return false;
    }

}
