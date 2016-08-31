package com.mygdx.hangman.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.mygdx.hangman.HangmanGame;
import com.mygdx.hangman.entities.Categories;
import com.mygdx.hangman.entities.ChooseCategory;

public class MenuScreen extends AbstractScreen {

	private ChooseCategory button1, button2, button3, button4; // 4 actors
	private Button first, second, third, fourth; // first button, second
													// button...
	private BitmapFont font;

	public MenuScreen(HangmanGame game) {
		super(game);
		init();
		initButton();
		initFonts();

	}

	private void initFonts() {
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("font.ttf"));
		FreeTypeFontGenerator.FreeTypeFontParameter params = new FreeTypeFontGenerator.FreeTypeFontParameter();

		params.size = 60;
		params.color = Color.BLACK;
		font = generator.generateFont(params);

	}

	protected void init() {

		button1 = new ChooseCategory("button1.png", ChooseCategory.STARTING_X_1, ChooseCategory.STARTING_Y_1);
		button2 = new ChooseCategory("button2.png", ChooseCategory.STARTING_X_2, ChooseCategory.STARTING_Y_2);
		button3 = new ChooseCategory("button3.png", ChooseCategory.STARTING_X_3, ChooseCategory.STARTING_Y_3);
		button4 = new ChooseCategory("button4.png", ChooseCategory.STARTING_X_4, ChooseCategory.STARTING_Y_4);

		stage.addActor(button1);
		stage.addActor(button2);
		stage.addActor(button3);
		stage.addActor(button4);
	}

	private void initButton() {

		first = new Button(new ButtonStyle());
		second = new Button(new ButtonStyle());
		third = new Button(new ButtonStyle());
		fourth = new Button(new ButtonStyle());

		first.setWidth(ChooseCategory.WIDTH);
		first.setHeight(ChooseCategory.HEIGHT);
		first.setX(ChooseCategory.STARTING_X_1);
		first.setY(ChooseCategory.STARTING_Y_1);
		first.setDebug(true);

		third.setWidth(ChooseCategory.WIDTH);
		third.setHeight(ChooseCategory.HEIGHT);
		third.setX(ChooseCategory.STARTING_X_2);
		third.setY(ChooseCategory.STARTING_Y_2);
		third.setDebug(true);

		second.setWidth(ChooseCategory.WIDTH);
		second.setHeight(ChooseCategory.HEIGHT);
		second.setX(ChooseCategory.STARTING_X_3);
		second.setY(ChooseCategory.STARTING_Y_3);
		second.setDebug(true);

		fourth.setWidth(ChooseCategory.WIDTH);
		fourth.setHeight(ChooseCategory.HEIGHT);
		fourth.setX(ChooseCategory.STARTING_X_4);
		fourth.setY(ChooseCategory.STARTING_Y_4);
		fourth.setDebug(true);

		stage.addActor(first);
		stage.addActor(second);
		stage.addActor(third);
		stage.addActor(fourth);

		initListener();
	}

	private void initListener() {

		first.addListener(new ClickListener() {

			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

				GameplayScreen.word = Categories.countries();
				game.setScreen(new GameplayScreen(game));

				return super.touchDown(event, x, y, pointer, button);
			}
		});

		second.addListener(new ClickListener() {

			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

				GameplayScreen.word = Categories.name();
				game.setScreen(new GameplayScreen(game));

				return super.touchDown(event, x, y, pointer, button);
			}
		});

		third.addListener(new ClickListener() {

			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

				GameplayScreen.word = Categories.profession();
				game.setScreen(new GameplayScreen(game));

				return super.touchDown(event, x, y, pointer, button);
			}
		});

		fourth.addListener(new ClickListener() {

			@Override
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {

				GameplayScreen.word = Categories.animals();
				game.setScreen(new GameplayScreen(game));

				return super.touchDown(event, x, y, pointer, button);
			}
		});

	}

	@Override
	public void render(float delta) {
		super.render(delta);
		update();

		spriteBatch.begin();

		font.draw(spriteBatch, "Wybierz kategorie:", 150, 550);
		spriteBatch.end();

		spriteBatch.begin();
		stage.draw();
		spriteBatch.end();
	}

	private void update() {
		stage.act();

	}
}
