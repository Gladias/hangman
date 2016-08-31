package com.mygdx.hangman;

import com.badlogic.gdx.Game;
import com.mygdx.hangman.screens.StartScreen;

public class HangmanGame extends Game {
	
	public final static String GAME_NAME = "Hangman";
	
	public final static int HEIGHT = 600;
	public final static int WIDTH = 780;
	
	private boolean paused;

	@Override
	public void create () {
		this.setScreen(new StartScreen(this));
	}


	public boolean isPaused() {
		return paused;
	}

	public void setPaused(boolean paused) {
		this.paused = paused;
	}
}
