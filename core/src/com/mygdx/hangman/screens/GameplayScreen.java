package com.mygdx.hangman.screens;

import com.mygdx.hangman.HangmanGame;
import com.mygdx.hangman.entities.ChooseCategory;

public class GameplayScreen extends AbstractScreen{

	private ChooseCategory button1;
	private ChooseCategory button2;
	private ChooseCategory button3;
	private ChooseCategory button4;
	
	public GameplayScreen(HangmanGame game) {
		super(game);
		initButton();

	}

	private void initButton() {
		
		button1 = new ChooseCategory("button1.png",ChooseCategory.STARTING_X_1,ChooseCategory.STARTING_Y_1);
		button2 = new ChooseCategory("button2.png",ChooseCategory.STARTING_X_2,ChooseCategory.STARTING_Y_2);
		button3 = new ChooseCategory("button3.png",ChooseCategory.STARTING_X_3,ChooseCategory.STARTING_Y_3);
		button4 = new ChooseCategory("button4.png",ChooseCategory.STARTING_X_4,ChooseCategory.STARTING_Y_4);
		
		stage.addActor(button1);
		stage.addActor(button2);
		stage.addActor(button3);
		stage.addActor(button4);
	}
	
	@Override
	public void render(float delta) {
		super.render(delta);
		update();
		
		spriteBatch.begin();
		stage.draw();
		spriteBatch.end();	
	}

	private void update() {
		stage.act();
		
	}
}

