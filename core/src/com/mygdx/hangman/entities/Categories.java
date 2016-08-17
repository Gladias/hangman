package com.mygdx.hangman.entities;

import java.util.Random;

public class Categories {	

	public static String animals(){
		
		String[] animals = {"Kameleon","Hipopotam","Wieloryb","Jaszczurka","Ropucha"};
		
		Random generator = new Random();
		int result = generator.nextInt(5);
		
		return animals[result];
	}
	
	
    public static String countries(){
		
		String[] countries = {"Afganistan","Mongolia","Argentyna","Portugalia","Rumunia"};
		
		Random generator = new Random();
		int result = generator.nextInt(5);
		
		return countries[result];
	}
     
     
    public static String profession(){
 		
 		String[] profession = {"Polityk","Programista","Listonosz","Ratownik","Nauczyciel"};
 		
 		Random generator = new Random();
 		int result = generator.nextInt(5);
 		
 		return profession[result];
 	}
     
    public static String name(){
  		
  		String[] name = {"Agnieszka","Aleksander","Mateusz","Wojciech","Henryk"};
  		
  		Random generator = new Random();
  		int result = generator.nextInt(5);
  		
  		return name[result];
  	} 

}
