package com.mygdx.hangman.entities;

import java.util.Random;

public class Categories {
	
	private String password;

	public static String animals(){
		
		String[] animals = {"Kameleon","Hipopotam","Wieloryb","Jaszczurka","Ropucha"};
		
		Random generator = new Random();
		int result = generator.nextInt(5);
		
		return animals[result];
	}
	
	
	
	
	public String getPassword() {
		return password;
	}
	

}
