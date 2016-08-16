package com.mygdx.hangman.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;
import com.mygdx.hangman.HangmanGame;

import sun.misc.Timeable;

public class SplashScreen extends AbstractScreen {

	private Texture splashImg;
	
	public SplashScreen(HangmanGame game) {
		super(game);
		init();
		
		Timer.schedule(new Task() {
			
			@Override
			public void run() {
				System.out.println("1sek");
				
			}
		}, 1);
		
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
 