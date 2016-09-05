package com.mygdx.hangman.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.mygdx.hangman.HangmanGame;

public class FinishScreen extends AbstractScreen {

	public BitmapFont font;
	private SpriteBatch batch;


	public FinishScreen(HangmanGame game) {
		super(game);
	}

	@Override
	protected void init() {
		batch = new SpriteBatch();
		initFonts();

	}

	private void initFonts() {
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("font.ttf"));
		FreeTypeFontGenerator.FreeTypeFontParameter params = new FreeTypeFontGenerator.FreeTypeFontParameter();

		params.size = 60;
		params.color = Color.BLACK;
		font = generator.generateFont(params);

	}

	public void render(float delta) {
		super.render(delta);
		update();
		
		batch.begin();
		
		font.draw(batch,"Koniec",275,550);
		
		batch.end();
	} 
	private void update() {
		stage.act();

	}

}
