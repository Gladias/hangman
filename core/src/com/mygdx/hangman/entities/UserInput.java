package com.mygdx.hangman.entities;

import com.badlogic.gdx.InputProcessor;
import com.mygdx.hangman.screens.GameplayScreen;

public class UserInput implements InputProcessor {

	@Override
	public boolean keyDown(int keycode) {
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {

		boolean check = false;
		
		for (int i = 0; i < GameplayScreen.length; i++) {
			if (character == GameplayScreen.word.charAt(i)) {
				GameplayScreen.passwordLetter(character, i);
				check = true;
				GameplayScreen.counter++;
			}
		}
		if (check != true)
			GameplayScreen.userMistakes++;
		
		if(GameplayScreen.counter == GameplayScreen.length)
			GameplayScreen.userMistakes=7; //go to case 7
			
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
