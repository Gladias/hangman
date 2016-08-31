package com.mygdx.hangman.screens;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.utils.Timer;
import com.badlogic.gdx.utils.Timer.Task;
import com.mygdx.hangman.HangmanGame;
import com.mygdx.hangman.entities.ChooseCategory;
import com.mygdx.hangman.entities.UserInput;

public class GameplayScreen extends AbstractScreen {

	public static int counter = 0;
	public final static int BAR_HEIGHT = 5, BAR_WIDTH = 56;
	private static int starting_x;
	private int starting_y;
	private static int letters_x;
	private int letters_y;
	public static String word;
	public static int length;
	private ChooseCategory bar1, bar2, bar3, bar4, bar5, bar6, bar7, bar8, bar9;
	private Texture man1, man2, man3, man4, man5, man6;
	private SpriteBatch batch;
	private static String result = "";
	public static int userMistakes = 0;

	private static String[] tab_letters = new String[9];
	private static int[] tab_positions = new int[9];

	UserInput InputProcessor;

	public BitmapFont font;

	public GameplayScreen(HangmanGame game) {
		super(game);

	}

	@Override
	protected void init() {

		for (int i = 0; i < 9; i++) {
			tab_letters[i] = "";
			tab_positions[i] = 0;

		}

		batch = new SpriteBatch();

		length = word.length();

		UserInput InputProcessor = new UserInput();
		Gdx.input.setInputProcessor(InputProcessor);

		starting_x = ChooseCategory.STARTING_X_2;
		starting_y = ChooseCategory.STARTING_Y_2;

		letters_x = ChooseCategory.STARTING_X_2 + 5;
		letters_y = ChooseCategory.STARTING_Y_2 + 60;

		initBars();

		initFonts();

		initHangman();

		showBars();

	}

	private void initHangman() {

		man1 = new Texture("man1.png");
		man2 = new Texture("man2.png");
		man3 = new Texture("man3.png");
		man4 = new Texture("man4.png");
		man5 = new Texture("man5.png");
		man6 = new Texture("man6.png");

	}

	private void initFonts() {
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("font.ttf"));
		FreeTypeFontGenerator.FreeTypeFontParameter params = new FreeTypeFontGenerator.FreeTypeFontParameter();

		params.size = 60;
		params.color = Color.BLACK;
		font = generator.generateFont(params);

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
		starting_x += 72;
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

	public static String passwordLetter(char character, int i) {
		result = Character.toString(character);
		tab_positions[i] = letters_x + (i * 73);
		tab_letters[i] = result;
		return result;
	}

	public void render(float delta) {
		super.render(delta);
		update();

		batch.begin();

		if (result != "") {
			font.draw(batch, tab_letters[0], tab_positions[0], letters_y);
			font.draw(batch, tab_letters[1], tab_positions[1], letters_y);
			font.draw(batch, tab_letters[2], tab_positions[2], letters_y);
			font.draw(batch, tab_letters[3], tab_positions[3], letters_y);
			font.draw(batch, tab_letters[4], tab_positions[4], letters_y);
			font.draw(batch, tab_letters[5], tab_positions[5], letters_y);
			font.draw(batch, tab_letters[6], tab_positions[6], letters_y);
			font.draw(batch, tab_letters[7], tab_positions[7], letters_y);
			font.draw(batch, tab_letters[8], tab_positions[8], letters_y);
		}

		switch (userMistakes) {
		case 1:
			batch.draw(man1, 150, 200);
			break;
		case 2:
			batch.draw(man2, 150, 200);
			break;
		case 3:
			batch.draw(man3, 150, 200);
			break;
		case 4:
			batch.draw(man4, 150, 200);
			break;
		case 5:
			batch.draw(man5, 150, 200); 
			break;
		case 6:
			batch.draw(man6, 150, 200);
		case 7:
			Timer.schedule(new Task() {
				
				@Override
				public void run() {
					game.setScreen(new FinishScreen(game));
				}
			}, 1);
			break;
		}

		batch.end();

		spriteBatch.begin();

		stage.draw();

		spriteBatch.end();
	}

	private void update() {
		stage.act();

	}

}