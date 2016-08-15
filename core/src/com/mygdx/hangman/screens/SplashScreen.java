package com.mygdx.hangman.screens;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.hangman.HangmanGame;

public class SplashScreen extends AbstractScreen {

	private Texture splashImg;
	
	public SplashScreen(HangmanGame game) {
		super(game);
		init();
	}

	private void init() {
		// TO DO
		splashImg = new Texture("badlogic.jpg");
	}
	
	@Override
	public void render(float delta) {
		super.render(delta);
		
		spriteBatch.begin();
		
		spriteBatch.draw(splashImg,0,0);
		
		spriteBatch.end();
	}
	


}
 