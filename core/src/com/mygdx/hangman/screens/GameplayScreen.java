package com.mygdx.hangman.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.mygdx.hangman.HangmanGame;
import com.mygdx.hangman.entities.ChooseCategory;
import com.mygdx.hangman.entities.UserInput;

public class GameplayScreen extends AbstractScreen {

	public final static int BAR_HEIGHT = 5, BAR_WIDTH = 56;
	private int starting_x, starting_y;
	public static String word;
	public static int length;
	private ChooseCategory bar1, bar2, bar3, bar4, bar5, bar6, bar7, bar8, bar9;
	private BitmapFont letter1, letter2, letter3, 
	                   letter4, letter5, letter6, 
	                   letter7, letter8, letter9;
	UserInput InputProcessor;

	public GameplayScreen(HangmanGame game) {
		super(game);

	}

	@Override
	protected void init() {

		length = word.length();

		UserInput InputProcessor = new UserInput();
		Gdx.input.setInputProcessor(InputProcessor);

		starting_x = ChooseCategory.STARTING_X_2;
		starting_y = ChooseCategory.STARTING_Y_2;

		initBars();
		
		initLetters();

		showBars();

	}

	private void initLetters() {
		letter1 = new BitmapFont();
		letter2 = new BitmapFont();
		letter3 = new BitmapFont();
		letter4 = new BitmapFont();
		letter5 = new BitmapFont();
		letter6 = new BitmapFont();
		letter7 = new BitmapFont();
		letter8 = new BitmapFont();
		letter9 = new BitmapFont();	
		
		letter1.setColor(Color.BLACK);
		letter1.getData().setScale(2.3f);
	}

	private void initBars() {

		bar1 = new ChooseCategory("BlackBar.png", starting_x, starting_y);
		increaseX();
		bar2 = new ChooseCategory("BlackBar.png", starting_x, starting_y);
		increaseX();
		bar3 = new ChooseCategory("BlackBar.png", starting_x, starting_y);
		increaseX();
		bar4 = new ChooseCategory("BlackBar.png", starting_x, starting_y);
		increaseX();
		bar5 = new ChooseCategory("BlackBar.png", starting_x, starting_y);
		increaseX();
		bar6 = new ChooseCategory("BlackBar.png", starting_x, starting_y);
		increaseX();
		bar7 = new ChooseCategory("BlackBar.png", starting_x, starting_y);
		increaseX();
		bar8 = new ChooseCategory("BlackBar.png", starting_x, starting_y);
		increaseX();
		bar9 = new ChooseCategory("BlackBar.png", starting_x, starting_y);

		bar1.setSize(BAR_WIDTH, BAR_HEIGHT);
		bar2.setSize(BAR_WIDTH, BAR_HEIGHT);
		bar3.setSize(BAR_WIDTH, BAR_HEIGHT);
		bar4.setSize(BAR_WIDTH, BAR_HEIGHT);
		bar5.setSize(BAR_WIDTH, BAR_HEIGHT);
		bar6.setSize(BAR_WIDTH, BAR_HEIGHT);
		bar7.setSize(BAR_WIDTH, BAR_HEIGHT);
		bar8.setSize(BAR_WIDTH, BAR_HEIGHT);
		bar9.setSize(BAR_WIDTH, BAR_HEIGHT);

	}

	private void increaseX() {
		starting_x += 70;
	}

	private void showBars() {

		if (length == 6) {
			stage.addActor(bar1);
			stage.addActor(bar2);
			stage.addActor(bar3);
			stage.addActor(bar4);
			stage.addActor(bar5);
			stage.addActor(bar6);

		} else if (length == 7) {
			stage.addActor(bar1);
			stage.addActor(bar2);
			stage.addActor(bar3);
			stage.addActor(bar4);
			stage.addActor(bar5);
			stage.addActor(bar6);
			stage.addActor(bar7);

		} else if (length == 8) {
			stage.addActor(bar1);
			stage.addActor(bar2);
			stage.addActor(bar3);
			stage.addActor(bar4);
			stage.addActor(bar5);
			stage.addActor(bar6);
			stage.addActor(bar7);
			stage.addActor(bar8);
		} else {
			stage.addActor(bar1);
			stage.addActor(bar2);
			stage.addActor(bar3);
			stage.addActor(bar4);
			stage.addActor(bar5);
			stage.addActor(bar6);
			stage.addActor(bar7);
			stage.addActor(bar8);
			stage.addActor(bar9);
		}

	}

	public static String showLetter(char character) {
		String result = Character.toString(character);
		return result;
	}

	public void render(float delta) {
		super.render(delta);
		update();

		spriteBatch.begin();

		stage.draw();
		letter1.draw(spriteBatch,"XD",280,440);

		spriteBatch.end();
	}

	private void update() {
		stage.act();

	}
}