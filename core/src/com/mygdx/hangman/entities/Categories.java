package com.mygdx.hangman.entities;

import java.util.Random;

public class Categories {	

	public static String animals(){
		
		String[] animals = {"kameleon","hipopotam","wieloryb","ropucha"};
		
		Random generator = new Random();
		int result = generator.nextInt(4);
		
		return animals[result];
	}
	
	
    public static String countries(){
		
		String[] countries = {"mongolia","argentyna","rumunia"};
		
		Random generator = new Random();
		int result = generator.nextInt(3);
		
		return countries[result];
	}
     
     
    public static String profession(){
 		
 		String[] profession = {"polityk","listonosz","ratownik"};
 		
 		Random generator = new Random();
 		int result = generator.nextInt(3);
 		
 		return profession[result];
 	}
     
    public static String name(){
  		
  		String[] name = {"agnieszka","mateusz","wojciech","henryk"};
  		
  		Random generator = new Random();
  		int result = generator.nextInt(4);
  		
  		return name[result];
  	} 

}
