package com.mygdx.hangman.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;
import com.mygdx.hangman.HangmanGame;

public class StartScreen extends AbstractScreen {

	private Texture splashImg;
	
	public StartScreen(final HangmanGame game) {
		super(game);
		
		Timer.schedule(new Task() {
			
			@Override
			public void run() {
				game.setScreen(new MenuScreen(game));
			}
		}, 1);
		
	}

	protected void init() {
		splashImg = new Texture("background.png");
	}
	
	@Override
	public void render(float delta) {
		super.render(delta);
		
		spriteBatch.begin();
		
		spriteBatch.draw(splashImg,0,0);
		
		spriteBatch.end();
	} 
	


}
 