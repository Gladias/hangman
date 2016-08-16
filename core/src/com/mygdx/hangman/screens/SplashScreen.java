package com.mygdx.hangman.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;
import com.mygdx.hangman.HangmanGame;

public class SplashScreen extends AbstractScreen {

	private Texture splashImg;
	
	public SplashScreen(final HangmanGame game) {
		super(game);
		
		Timer.schedule(new Task() {
			
			@Override
			public void run() {
				game.setScreen(new GameplayScreen(game));
			}
		}, 1);
		
	}

	public void init() {
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
 