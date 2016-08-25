package com.mygdx.hangman.entities;

import java.util.Random;

public class Categories {	

	public static String animals(){
		
		String[] animals = {"Kameleon","Hipopotam","Wieloryb","Ropucha"};
		
		Random generator = new Random();
		int result = generator.nextInt(4);
		
		return animals[result];
	}
	
	
    public static String countries(){
		
		String[] countries = {"Mongolia","Argentyna","Rumunia"};
		
		Random generator = new Random();
		int result = generator.nextInt(3);
		
		return countries[result];
	}
     
     
    public static String profession(){
 		
 		String[] profession = {"Polityk","Listonosz","Ratownik"};
 		
 		Random generator = new Random();
 		int result = generator.nextInt(3);
 		
 		return profession[result];
 	}
     
    public static String name(){
  		
  		String[] name = {"Agnieszka","Mateusz","Wojciech","Henryk"};
  		
  		Random generator = new Random();
  		int result = generator.nextInt(4);
  		
  		return name[result];
  	} 

}
