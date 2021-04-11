package application;

import java.util.ArrayList;

public class Main {
	
	static Input input = new Input();
	
	public static ArrayList<Integer> getIntegers(ArrayList<Integer> integers){
		
		int i, number, MAX_INTEGER = 4;
		
		for (i = 0; i < MAX_INTEGER; i++) {
			
			number = input.setInputInt("Number: ");
			
			integers.add(number);
			
		}
		
		return integers;
		
	}
	
	public static boolean checkFuckingNumber(int number, int magicNumber) {
		
		if (number > magicNumber) {
			
			return true;
			
		}
		
		return false;
		
	}
	
	public static ArrayList<Integer> getBigNumbers(ArrayList<Integer> integers, ArrayList<Integer> bigNumbers){
		
		int i, number, MAX_INTEGER = 4;
		
		int magicNumber = input.setInputInt("MagicNumber> ");
		
		for (i = 0; i < MAX_INTEGER; i++) {
			
			number = integers.get(i);
			
			if (checkFuckingNumber(number, magicNumber)) {
				
				bigNumbers.add(number);
				
			}
			
		}
		
		return bigNumbers;
		
	}
	
	public static void displayNumbers(ArrayList<Integer> bigNumbers) {
		
		System.out.println("Estos son los numeros más grandes que el inicial: ");
		
		for (Integer number: bigNumbers) {
			
			System.out.println(number);
			
		}		
		
	}
	
	public static void main(java.lang.String[] args) {
		
		ArrayList<Integer> integers = new ArrayList<Integer>();
		ArrayList<Integer> bigNumbers = new ArrayList<Integer>();
		
		bigNumbers = getBigNumbers(getIntegers(integers), bigNumbers);
		
		displayNumbers(bigNumbers);
		
	}
	
}
