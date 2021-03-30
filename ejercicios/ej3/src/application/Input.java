package application;

import java.util.Scanner;

public class Input{
	
	private Scanner scan;	

	public Input(){
	
		scan = new Scanner(System.in);
		
	}

	public String setInputString(String text){
		
		System.out.print(text);
		
		String input = scan.nextLine();

		return input;

	}
	
	public int setInputInt(String text){
		
		System.out.print(text);
		
		int input = scan.nextInt();

		return input;

	}

	public void close(){
	
		scan.close();
	
	}

}
