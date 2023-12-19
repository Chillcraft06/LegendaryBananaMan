/** 
 * Main menu class 
 * Dec 19th 
 * 
 */
package com.lbm.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.utils.ScreenUtils;


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

    public void create() { 
    Stage stage;
    stage = new Stage(new ScreenViewport());
    Gdx.input.setInputProcessor(stage);	
    
        int Help_Guides = 12;
        int row_height = Gdx.graphics.getWidth() / 12;
        int col_width = Gdx.graphics.getWidth() / 12;
 Skin mySkin = new Skin(Gdx.files.internal("skin/glassy-ui.json"));
 
        // ImageButton
        ImageButton button3 = new ImageButton(mySkin);
        button3.setSize(col_width*4,(float)(row_height*2));
        button3.getStyle().imageUp = new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("switch_off.png"))));
        button3.getStyle().imageDown = new TextureRegionDrawable(new TextureRegion(new Texture(Gdx.files.internal("switch_on.png"))));
        button3.setPosition(col_width,Gdx.graphics.getHeight()-row_height*6);
        button3.addListener(new InputListener(){
            @Override
            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
                outputLabel.setText("Press a Button");
            }
            @Override
            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
                outputLabel.setText("Pressed Image Button");
                return true;
            }
        });
        stage.addActor(button3);
            @Override
    public void render () {
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        stage.draw();
 
    }
    }
    public void render(float delta) {
        ScreenUtils.clear(1, 0, 0f, 1);
        camera.update();
        game.batch.setProjectionMatrix(camera.combined);
        
        Texture backgroundImg = new Texture(Gdx.files.internal("gradientBG.png")); 
        game.batch.begin();
        game.batch.draw(backgroundImg, 0, 0, 16f, 9f);
        buttonSprites[0].draw(game.batch);
        game.batch.end();
    }

    public void show() {

    }
}
