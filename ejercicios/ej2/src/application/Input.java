package application;

import java.util.Scanner;

public class Input{
	
	private Scanner scan;	

	public Input(){
	
		scan = new Scanner(System.in);
		
	}

	public String setInput(String text){
		
		String option;

		System.out.print(text);
		
		option = scan.nextLine(); 

		return option;

	}

	public void close(){
	
		scan.close();
	
	}

}
