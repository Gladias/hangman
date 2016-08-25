package com.mygdx.hangman.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;
import com.mygdx.hangman.HangmanGame;
import com.mygdx.hangman.entities.Categories;

public class SplashScreen extends AbstractScreen {

	private Texture splashImg;
	
	public SplashScreen(final HangmanGame game) {
		super(game);
		
		Timer.schedule(new Task() {
			
			@Override
			public void run() {
				System.out.println(Categories.animals());
				game.setScreen(new MenuScreen(game));
			}
		}, 1);
		
	}

	protected void init() {
		// TO DO
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
 