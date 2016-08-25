package com.mygdx.hangman.screens;

import com.mygdx.hangman.HangmanGame;
import com.mygdx.hangman.entities.ChooseCategory;

public class GameplayScreen extends AbstractScreen {

	public final static int BAR_HEIGHT = 5, BAR_WIDTH = 56;
	private int starting_x, starting_y;
	static String word;
	private int length;
	private ChooseCategory bar1, bar2, bar3, bar4, bar5, bar6, bar7, bar8, bar9;

	public GameplayScreen(HangmanGame game) {
		super(game);

	}

	@Override
	protected void init() {

		length = word.length();
		System.out.println(word);

		starting_x = ChooseCategory.STARTING_X_2;
		starting_y = ChooseCategory.STARTING_Y_2;

		initBars();

		showBars();
	}

	private void initBars() {

		bar1 = new ChooseCategory("BlackBar.png", starting_x, starting_y);
		IncreaseX();
		bar2 = new ChooseCategory("BlackBar.png", starting_x, starting_y);
		IncreaseX();
		bar3 = new ChooseCategory("BlackBar.png", starting_x, starting_y);
		IncreaseX();
		bar4 = new ChooseCategory("BlackBar.png", starting_x, starting_y);
		IncreaseX();
		bar5 = new ChooseCategory("BlackBar.png", starting_x, starting_y);
		IncreaseX();
		bar6 = new ChooseCategory("BlackBar.png", starting_x, starting_y);
		IncreaseX();
		bar7 = new ChooseCategory("BlackBar.png", starting_x, starting_y);
		IncreaseX();
		bar8 = new ChooseCategory("BlackBar.png", starting_x, starting_y);
		IncreaseX();
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

	private void IncreaseX() {starting_x += 70;}

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