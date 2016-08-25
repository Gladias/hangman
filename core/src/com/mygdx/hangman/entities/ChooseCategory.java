package com.mygdx.hangman.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class ChooseCategory extends Image{
	
	public final static int WIDTH = 318;
	public final static int HEIGHT = 119;
	
	public final static int STARTING_X_1 = 29;
	public final static int STARTING_Y_1 = 310;
	
	public final static int STARTING_X_2 = 29;
	public final static int STARTING_Y_2 = 100;
	
	public final static int STARTING_X_3 = 423;
	public final static int STARTING_Y_3 = 310;
	
	public final static int STARTING_X_4 = 423;
	public final static int STARTING_Y_4 = 100;
	
	
	public ChooseCategory(String texture, int starting_x, int starting_y){
		super(new Texture(texture));
		
		 this.setOrigin(WIDTH/2, HEIGHT/2);
		 this.setSize(WIDTH, HEIGHT);
		 this.setPosition(starting_x, starting_y);
	}
}
