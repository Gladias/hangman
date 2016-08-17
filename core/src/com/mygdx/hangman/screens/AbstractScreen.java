package com.mygdx.hangman.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.mygdx.hangman.HangmanGame;

public abstract class AbstractScreen implements Screen {

	protected HangmanGame game;
	protected Stage stage;
	private OrthographicCamera camera;
	protected SpriteBatch spriteBatch;

	public AbstractScreen(HangmanGame game) {

		this.game = game;
		createCamera();
		stage = new Stage(new StretchViewport(HangmanGame.WIDTH, HangmanGame.HEIGHT, camera));
		spriteBatch = new SpriteBatch();
		Gdx.input.setInputProcessor(stage);
		init();
	}

	private void createCamera() {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, HangmanGame.WIDTH, HangmanGame.HEIGHT);
		camera.update();
	}

	@Override
	public void render(float delta) {
		clearScreen();
		camera.update();
		spriteBatch.setProjectionMatrix(camera.combined);
	}
	
	public void show(){};

	private void clearScreen() {
		Gdx.gl.glClearColor(1, 1, 1, 1);  //WHITE
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}

	public void resume() {
		game.setPaused(false);

	}

	public void pause() {
		game.setPaused(true);
	}
	
	public void hide(){	}
	
	public void dispose(){
		game.dispose();
	}
	
	public void resize(int width, int height) {};
	
	public void init(){};
}
 