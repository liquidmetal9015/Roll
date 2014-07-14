package com.example.roll;

import java.lang.Math;



public class AppUtils {

	
	
	//returns a random number between 1 and 6
	public static int roll(){
		return (int)Math.ceil(Math.random()*6);
	}
	
	
	public static int[] multiRoll(int input){
		int[] results = {0,0,0,0,0,0};
		
		int dieRoll = 0;
		
		for(int count = 0;count < input;count++){
			dieRoll = roll();
			results[dieRoll-1]++;
		}
		
		
		return results;
	}
	
	
	
	public static int test(int value, int input){
		
		int rValue = 0;
		int[] rolls = multiRoll(input);
		
		for(int count = value-1;count < 6;count++){
			rValue += rolls[count];
			
		}
		
		return rValue;
	}
	
	
	public static int randomOrient(){
	return (int)Math.ceil(Math.random()*360);
	}
	
}
	
	
	
	

