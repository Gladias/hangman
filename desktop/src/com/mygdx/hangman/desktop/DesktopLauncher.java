package com.mygdx.hangman.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.hangman.HangmanGame;

public class DesktopLauncher {
	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.title = HangmanGame.GAME_NAME;
		config.height = HangmanGame.HEIGHT;
		config.width = HangmanGame.WIDTH;
		config.resizable = false;

		new LwjglApplication(new HangmanGame(), config);
	}
}
